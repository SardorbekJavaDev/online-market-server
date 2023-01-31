package online.market.uz.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import online.market.uz.dto.request.CardRequestDTO;
import online.market.uz.dto.response.CardResponseDTO;
import online.market.uz.service.CardService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/card")
@Api("Card")
public class CardController {
    private final CardService cardService;

    @ApiOperation(value = "Create Card", notes = "Method used for Create Card")
    @PostMapping("")
    public ResponseEntity<CardResponseDTO> create(@RequestBody @Valid CardRequestDTO dto) {
        log.info("Card Create {}{}", dto, CardController.class);
        return ResponseEntity.ok(cardService.create(dto));
    }


    @ApiOperation(value = "Update Card", notes = "Method used for update Card by id")
    @PutMapping("/{id}")
    public ResponseEntity<CardResponseDTO> update(@PathVariable("id") String bId,
                                                                @RequestBody @Valid CardRequestDTO dto) {
        log.info("Card update {}{}", dto, CardController.class);
        return ResponseEntity.ok(cardService.update(dto, bId));
    }


    @ApiOperation(value = "Delete Card", notes = "Method used for delete Card by id")
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") String bId) {
        log.info("Card delete {}{}", bId, CardController.class);
        return ResponseEntity.ok(cardService.delete(bId));
    }


    @ApiOperation(value = "Get Card", notes = "Method used for Get Card by id")
    @GetMapping("/{id}")
    public ResponseEntity<CardResponseDTO> getById(@PathVariable("id") String bId) {
        log.info("Card get by id {}{}", bId, CardController.class);
        return ResponseEntity.ok(cardService.getById(bId));
    }

}