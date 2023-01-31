package online.market.uz.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import online.market.uz.dto.request.BranchRequestDTO;
import online.market.uz.dto.response.BranchResponseDTO;
import online.market.uz.service.BranchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/branch")
@Api("Branch")
public class BranchController {
    private final BranchService branchService;

    @ApiOperation(value = "Create Branch", notes = "Method used for Create Branch")
    @PostMapping("")
    public ResponseEntity<BranchResponseDTO> create(@RequestBody @Valid BranchRequestDTO dto) {
        log.info("Branch Create {}{}", dto, BranchController.class);
        return ResponseEntity.ok(branchService.create(dto));
    }


    @ApiOperation(value = "Update Branch", notes = "Method used for update Branch by id")
    @PutMapping("/{id}")
    public ResponseEntity<BranchResponseDTO> update(@PathVariable("id") String bId,
                                                                @RequestBody @Valid BranchRequestDTO dto) {
        log.info("Branch update {}{}", dto, BranchController.class);
        return ResponseEntity.ok(branchService.update(dto, bId));
    }


    @ApiOperation(value = "Delete Branch", notes = "Method used for delete Branch by id")
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") String bId) {
        log.info("Branch delete {}{}", bId, BranchController.class);
        return ResponseEntity.ok(branchService.delete(bId));
    }


    @ApiOperation(value = "Get Branch", notes = "Method used for Get Branch by id")
    @GetMapping("/{id}")
    public ResponseEntity<BranchResponseDTO> getById(@PathVariable("id") String bId) {
        log.info("Branch get by id {}{}", bId, BranchController.class);
        return ResponseEntity.ok(branchService.getById(bId));
    }

}
