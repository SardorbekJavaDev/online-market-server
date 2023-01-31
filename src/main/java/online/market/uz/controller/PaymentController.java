package online.market.uz.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import online.market.uz.dto.request.PaymentRequestDTO;
import online.market.uz.dto.response.PaymentResponseDTO;
import online.market.uz.service.PaymentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/payment")
@Api("Payment")
public class PaymentController {
    private final PaymentService paymentService;

    @ApiOperation(value = "Create Payment", notes = "Method used for Create Payment")
    @PostMapping("")
    public ResponseEntity<PaymentResponseDTO> create(@RequestBody @Valid PaymentRequestDTO dto) {
        log.info("Payment Create {}{}", dto, PaymentController.class);
        return ResponseEntity.ok(paymentService.create(dto));
    }


    @ApiOperation(value = "Update Payment", notes = "Method used for update Payment by id")
    @PutMapping("/{id}")
    public ResponseEntity<PaymentResponseDTO> update(@PathVariable("id") String bId,
                                                      @RequestBody @Valid PaymentRequestDTO dto) {
        log.info("Payment update {}{}", dto, PaymentController.class);
        return ResponseEntity.ok(paymentService.update(dto, bId));
    }


    @ApiOperation(value = "Delete Payment", notes = "Method used for delete Payment by id")
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") String bId) {
        log.info("Payment delete {}{}", bId, PaymentController.class);
        return ResponseEntity.ok(paymentService.delete(bId));
    }


    @ApiOperation(value = "Get Payment", notes = "Method used for Get Payment by id")
    @GetMapping("/{id}")
    public ResponseEntity<PaymentResponseDTO> getById(@PathVariable("id") String bId) {
        log.info("Payment get by id {}{}", bId, PaymentController.class);
        return ResponseEntity.ok(paymentService.getById(bId));
    }

}
