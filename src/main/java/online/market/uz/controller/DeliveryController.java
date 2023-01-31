package online.market.uz.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import online.market.uz.dto.request.DeliveryRequestDTO;
import online.market.uz.dto.response.DeliveryResponseDTO;
import online.market.uz.service.DeliveryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/delivery")
@Api("Delivery")
public class DeliveryController {
    private final DeliveryService deliveryService;

    @ApiOperation(value = "Create Delivery", notes = "Method used for Create Delivery")
    @PostMapping("")
    public ResponseEntity<DeliveryResponseDTO> create(@RequestBody @Valid DeliveryRequestDTO dto) {
        log.info("Delivery Create {}{}", dto, DeliveryController.class);
        return ResponseEntity.ok(deliveryService.create(dto));
    }


    @ApiOperation(value = "Update Delivery", notes = "Method used for update Delivery by id")
    @PutMapping("/{id}")
    public ResponseEntity<DeliveryResponseDTO> update(@PathVariable("id") String bId,
                                                      @RequestBody @Valid DeliveryRequestDTO dto) {
        log.info("Delivery update {}{}", dto, DeliveryController.class);
        return ResponseEntity.ok(deliveryService.update(dto, bId));
    }


    @ApiOperation(value = "Delete Delivery", notes = "Method used for delete Delivery by id")
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") String bId) {
        log.info("Delivery delete {}{}", bId, DeliveryController.class);
        return ResponseEntity.ok(deliveryService.delete(bId));
    }


    @ApiOperation(value = "Get Delivery", notes = "Method used for Get Delivery by id")
    @GetMapping("/{id}")
    public ResponseEntity<DeliveryResponseDTO> getById(@PathVariable("id") String bId) {
        log.info("Delivery get by id {}{}", bId, DeliveryController.class);
        return ResponseEntity.ok(deliveryService.getById(bId));
    }

}
