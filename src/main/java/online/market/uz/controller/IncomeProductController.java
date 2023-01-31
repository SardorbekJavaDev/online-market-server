package online.market.uz.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import online.market.uz.dto.request.IncomeProductRequestDTO;
import online.market.uz.dto.response.IncomeProductResponseDTO;
import online.market.uz.service.IncomeProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/income/product")
@Api("Income Product")
public class IncomeProductController {
    private final IncomeProductService incomeProductService;

    @ApiOperation(value = "Create IncomeProduct", notes = "Method used for Create IncomeProduct")
    @PostMapping("")
    public ResponseEntity<IncomeProductResponseDTO> create(@RequestBody @Valid IncomeProductRequestDTO dto) {
        log.info("IncomeProduct Create {}{}", dto, IncomeProductController.class);
        return ResponseEntity.ok(incomeProductService.create(dto));
    }


    @ApiOperation(value = "Update IncomeProduct", notes = "Method used for update IncomeProduct by id")
    @PutMapping("/{id}")
    public ResponseEntity<IncomeProductResponseDTO> update(@PathVariable("id") String bId,
                                                      @RequestBody @Valid IncomeProductRequestDTO dto) {
        log.info("IncomeProduct update {}{}", dto, IncomeProductController.class);
        return ResponseEntity.ok(incomeProductService.update(dto, bId));
    }


    @ApiOperation(value = "Delete IncomeProduct", notes = "Method used for delete IncomeProduct by id")
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") String bId) {
        log.info("IncomeProduct delete {}{}", bId, IncomeProductController.class);
        return ResponseEntity.ok(incomeProductService.delete(bId));
    }


    @ApiOperation(value = "Get IncomeProduct", notes = "Method used for Get IncomeProduct by id")
    @GetMapping("/{id}")
    public ResponseEntity<IncomeProductResponseDTO> getById(@PathVariable("id") String bId) {
        log.info("IncomeProduct get by id {}{}", bId, IncomeProductController.class);
        return ResponseEntity.ok(incomeProductService.getById(bId));
    }

}
