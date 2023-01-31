package online.market.uz.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import online.market.uz.dto.request.DeviceRequestDTO;
import online.market.uz.dto.response.DeviceResponseDTO;
import online.market.uz.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/device")
@Api("Device")
public class DeviceController {
    @Autowired
    private DeviceService deviceService;

    @ApiOperation(value = "create", notes = "Method used create device for user !")
    @PostMapping("")
    public ResponseEntity<DeviceResponseDTO> create(@RequestBody @Valid DeviceRequestDTO dto) {
        log.info("Device create {}{}", dto, DeviceController.class);
        return ResponseEntity.ok(deviceService.create(dto));
    }

    @ApiOperation(value = "get by user id", notes = "Method delete device by deviceId")
    @DeleteMapping("/delete{id}")  // delete device by deviceId
    public ResponseEntity<?> delete(@PathVariable("id") String deviceId,
                                    HttpServletRequest request) {
        String pId = "JwtUtil.getIdFromHeader(request)";
//        String pId = JwtUtil.getIdFromHeader(request);
        log.info("Delete device by user ID: ", pId, "device:", deviceId);
        return ResponseEntity.ok(deviceService.delete(deviceId, pId));
    }
    @ApiOperation(value = "get by user id", notes = "Method get device by user id")
    @GetMapping("{id}")  // TODO: 17.05.2022 Use Only for Admin !
    public ResponseEntity<List<DeviceResponseDTO>> getByUserId(@PathVariable("id") String id) {
        log.info("Device List {}{}", id, DeviceController.class);
        return ResponseEntity.ok(deviceService.getDeviceByProfileId(id));
    }
}
