package online.market.uz.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import online.market.uz.dto.request.ProductRequestDTO;
import online.market.uz.dto.response.ProductResponseDTO;
import online.market.uz.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/product")
@Api("Product")
public class ProductController {
    private final ProductService productService;

    @ApiOperation(value = "Create Product", notes = "Method used for Create Product")
    @PostMapping("")
    public ResponseEntity<ProductResponseDTO> create(@RequestBody @Valid ProductRequestDTO dto) {
        log.info("Product Create {}{}", dto, ProductController.class);
        return ResponseEntity.ok(productService.create(dto));
    }


    @ApiOperation(value = "Update Product", notes = "Method used for update Product by id")
    @PutMapping("/{id}")
    public ResponseEntity<ProductResponseDTO> update(@PathVariable("id") String bId,
                                                      @RequestBody @Valid ProductRequestDTO dto) {
        log.info("Product update {}{}", dto, ProductController.class);
        return ResponseEntity.ok(productService.update(dto, bId));
    }


    @ApiOperation(value = "Delete Product", notes = "Method used for delete Product by id")
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") String bId) {
        log.info("Product delete {}{}", bId, ProductController.class);
        return ResponseEntity.ok(productService.delete(bId));
    }


    @ApiOperation(value = "Get Product", notes = "Method used for Get Product by id")
    @GetMapping("/{id}")
    public ResponseEntity<ProductResponseDTO> getById(@PathVariable("id") String bId) {
        log.info("Product get by id {}{}", bId, ProductController.class);
        return ResponseEntity.ok(productService.getById(bId));
    }

}
