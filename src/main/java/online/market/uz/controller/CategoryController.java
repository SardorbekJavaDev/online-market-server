package online.market.uz.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import online.market.uz.dto.request.CategoryRequestDTO;
import online.market.uz.dto.response.CategoryResponseDTO;
import online.market.uz.service.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/category")
@Api("Category")
public class CategoryController {
    private final CategoryService categoryService;

    @ApiOperation(value = "Create Category", notes = "Method used for Create Category")
    @PostMapping("")
    public ResponseEntity<CategoryResponseDTO> create(@RequestBody @Valid CategoryRequestDTO dto) {
        log.info("Category Create {}{}", dto, CategoryController.class);
        return ResponseEntity.ok(categoryService.create(dto));
    }


    @ApiOperation(value = "Update Category", notes = "Method used for update Category by id")
    @PutMapping("/{id}")
    public ResponseEntity<CategoryResponseDTO> update(@PathVariable("id") String bId,
                                                      @RequestBody @Valid CategoryRequestDTO dto) {
        log.info("Category update {}{}", dto, CategoryController.class);
        return ResponseEntity.ok(categoryService.update(dto, bId));
    }


    @ApiOperation(value = "Delete Category", notes = "Method used for delete Category by id")
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") String bId) {
        log.info("Category delete {}{}", bId, CategoryController.class);
        return ResponseEntity.ok(categoryService.delete(bId));
    }


    @ApiOperation(value = "Get Category", notes = "Method used for Get Category by id")
    @GetMapping("/{id}")
    public ResponseEntity<CategoryResponseDTO> getById(@PathVariable("id") String bId) {
        log.info("Category get by id {}{}", bId, CategoryController.class);
        return ResponseEntity.ok(categoryService.getById(bId));
    }

}
