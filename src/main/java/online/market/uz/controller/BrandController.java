package online.market.uz.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import online.market.uz.dto.request.BrandRequestDTO;
import online.market.uz.dto.response.BrandResponseDTO;
import online.market.uz.service.BranchService;
import online.market.uz.service.BrandService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/brand")
@Api("Brand")
public class BrandController {
    private final BrandService brandService;

    @ApiOperation(value = "Create Brand", notes = "Method used for Create Brand")
    @PostMapping("")
    public ResponseEntity<BrandResponseDTO> create(@RequestBody @Valid BrandRequestDTO dto) {
        log.info("Brand Create {}{}", dto, BrandController.class);
        return ResponseEntity.ok(brandService.create(dto));
    }


    @ApiOperation(value = "Update Brand", notes = "Method used for update Brand by id")
    @PutMapping("/{id}")
    public ResponseEntity<BrandResponseDTO> update(@PathVariable("id") String bId,
                                                                @RequestBody @Valid BrandRequestDTO dto) {
        log.info("Brand update {}{}", dto, BrandController.class);
        return ResponseEntity.ok(brandService.update(dto, bId));
    }


    @ApiOperation(value = "Delete Brand", notes = "Method used for delete Brand by id")
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") String bId) {
        log.info("Brand delete {}{}", bId, BrandController.class);
        return ResponseEntity.ok(brandService.delete(bId));
    }


    @ApiOperation(value = "Get Brand", notes = "Method used for Get Brand by id")
    @GetMapping("/{id}")
    public ResponseEntity<BrandResponseDTO> getById(@PathVariable("id") String bId) {
        log.info("Brand get by id {}{}", bId, BrandController.class);
        return ResponseEntity.ok(brandService.getById(bId));
    }

}