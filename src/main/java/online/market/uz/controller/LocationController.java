package online.market.uz.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import online.market.uz.dto.request.LocationRequestDTO;
import online.market.uz.dto.response.LocationResponseDTO;
import online.market.uz.service.LocationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/location")
@Api("Location")
public class LocationController {
    private final LocationService locationService;

    @ApiOperation(value = "Create Location", notes = "Method used for Create Location")
    @PostMapping("")
    public ResponseEntity<LocationResponseDTO> create(@RequestBody @Valid LocationRequestDTO dto) {
        log.info("Location Create {}{}", dto, LocationController.class);
        return ResponseEntity.ok(locationService.create(dto));
    }


    @ApiOperation(value = "Update Location", notes = "Method used for update Location by id")
    @PutMapping("/{id}")
    public ResponseEntity<LocationResponseDTO> update(@PathVariable("id") String bId,
                                                      @RequestBody @Valid LocationRequestDTO dto) {
        log.info("Location update {}{}", dto, LocationController.class);
        return ResponseEntity.ok(locationService.update(dto, bId));
    }


    @ApiOperation(value = "Delete Location", notes = "Method used for delete Location by id")
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") String bId) {
        log.info("Location delete {}{}", bId, LocationController.class);
        return ResponseEntity.ok(locationService.delete(bId));
    }


    @ApiOperation(value = "Get Location", notes = "Method used for Get Location by id")
    @GetMapping("/{id}")
    public ResponseEntity<LocationResponseDTO> getById(@PathVariable("id") String bId) {
        log.info("Location get by id {}{}", bId, LocationController.class);
        return ResponseEntity.ok(locationService.getById(bId));
    }

}
