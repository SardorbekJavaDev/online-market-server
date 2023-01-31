package online.market.uz.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import online.market.uz.dto.request.BillingInformationRequestDTO;
import online.market.uz.dto.response.BillingInformationResponseDTO;
import online.market.uz.enums.LangEnum;
import online.market.uz.service.BillingInformationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/billing/information")
@Api("BillingInformation")
public class BillingInformationController {
    private final BillingInformationService billingInformationService;

    @ApiOperation(value = "Create Billing Information", notes = "Method used for Create Billing Information")
    @PostMapping("")
    public ResponseEntity<BillingInformationResponseDTO> create(@RequestBody @Valid BillingInformationRequestDTO dto) {
        log.info("Billing Information Create {}{}", dto, BillingInformationController.class);
        return ResponseEntity.ok(billingInformationService.create(dto));
    }


    @ApiOperation(value = "Update Billing Information", notes = "Method used for update Billing Information by id")
    @PutMapping("/{id}")
    public ResponseEntity<BillingInformationResponseDTO> update(@PathVariable("id") String bId,
                                          @RequestBody @Valid BillingInformationRequestDTO dto) {
        log.info("Billing Information update {}{}", dto, BillingInformationController.class);
        return ResponseEntity.ok(billingInformationService.update(dto, bId));
    }


    @ApiOperation(value = "Delete Billing Information", notes = "Method used for delete Billing Information by id")
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") String bId) {
        log.info("Billing Information delete {}{}", bId, BillingInformationController.class);
        return ResponseEntity.ok(billingInformationService.delete(bId));
    }


    @ApiOperation(value = "Get Billing Information", notes = "Method used for Get Billing Information by id")
    @GetMapping("/{id}")
    public ResponseEntity<BillingInformationResponseDTO> getById(@PathVariable("id") String bId) {
        log.info("Billing Information get by id {}{}", bId, BillingInformationController.class);
        return ResponseEntity.ok(billingInformationService.getById(bId));
    }

}