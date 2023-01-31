package online.market.uz.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import online.market.uz.dto.request.PaymentTypeRequestDTO;
import online.market.uz.dto.response.PaymentTypeResponseDTO;
import online.market.uz.service.PaymentTypeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/payment/type")
@Api("Payment Type")
public class PaymentTypeController {
    private final PaymentTypeService paymentTypeService;

    @ApiOperation(value = "Create PaymentType", notes = "Method used for Create PaymentType")
    @PostMapping("/")
    public ResponseEntity<PaymentTypeResponseDTO> create(@RequestBody @Valid PaymentTypeRequestDTO dto) {
        log.info("PaymentType Create {}{}", dto, PaymentTypeController.class);
        return ResponseEntity.ok(paymentTypeService.create(dto));
    }


    @ApiOperation(value = "Update PaymentType", notes = "Method used for update PaymentType by id")
    @PutMapping("/{id}")
    public ResponseEntity<PaymentTypeResponseDTO> update(@PathVariable("id") String bId,
                                                      @RequestBody @Valid PaymentTypeRequestDTO dto) {
        log.info("PaymentType update {}{}", dto, PaymentTypeController.class);
        return ResponseEntity.ok(paymentTypeService.update(dto, bId));
    }


    @ApiOperation(value = "Delete PaymentType", notes = "Method used for delete PaymentType by id")
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") String bId) {
        log.info("PaymentType delete {}{}", bId, PaymentTypeController.class);
        return ResponseEntity.ok(paymentTypeService.delete(bId));
    }


    @ApiOperation(value = "Get PaymentType", notes = "Method used for Get PaymentType by id")
    @GetMapping("/{id}")
    public ResponseEntity<PaymentTypeResponseDTO> getById(@PathVariable("id") String bId) {
        log.info("PaymentType get by id {}{}", bId, PaymentTypeController.class);
        return ResponseEntity.ok(paymentTypeService.getById(bId));
    }

}
