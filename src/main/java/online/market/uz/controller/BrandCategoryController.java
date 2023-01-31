package online.market.uz.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import online.market.uz.dto.request.BrandCategoryRequestDTO;
import online.market.uz.dto.response.BrandCategoryResponseDTO;
import online.market.uz.service.BrandCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/v1/brand/category")
@Api("BrandCategory")
public class BrandCategoryController {

    private final BrandCategoryService brandCategoryService;

    public BrandCategoryController(BrandCategoryService brandCategoryService) {
        this.brandCategoryService = brandCategoryService;
    }

    @ApiOperation(value = "Create Brand Category", notes = "Method used for Create Brand Category")
    @PostMapping("")
    public ResponseEntity<BrandCategoryResponseDTO> create(@RequestBody @Valid BrandCategoryRequestDTO dto) {
        log.info("Brand Category Create {}{}", dto, BrandCategoryController.class);
        return ResponseEntity.ok(brandCategoryService.create(dto));
    }


    @ApiOperation(value = "Update Brand Category", notes = "Method used for update Brand Category by id")
    @PutMapping("/{id}")
    public ResponseEntity<BrandCategoryResponseDTO> update(@PathVariable("id") String bId,
                                                           @RequestBody @Valid BrandCategoryRequestDTO dto) {
        log.info("Brand Category update {}{}", dto, BrandCategoryController.class);
        return ResponseEntity.ok(brandCategoryService.update(dto, bId));
    }


    @ApiOperation(value = "Delete Brand Category", notes = "Method used for delete Brand Category by id")
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") String bId) {
        log.info("Brand Category delete {}{}", bId, BrandCategoryController.class);
        return ResponseEntity.ok(brandCategoryService.delete(bId));
    }


    @ApiOperation(value = "Get Brand Category", notes = "Method used for Get Brand Category by id")
    @GetMapping("/{id}")
    public ResponseEntity<BrandCategoryResponseDTO> getById(@PathVariable("id") String bId) {
        log.info("Brand Category get by id {}{}", bId, BrandCategoryController.class);
        return ResponseEntity.ok(brandCategoryService.getById(bId));
    }

}
