package online.market.uz.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import online.market.uz.dto.request.CardTypeRequestDTO;
import online.market.uz.dto.response.CardTypeResponseDTO;
import online.market.uz.service.CardTypeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/card/type")
@Api("CardType")
public class CardTypeController {
    private final CardTypeService cardTypeService;

    @ApiOperation(value = "Create Card Type", notes = "Method used for Create Card Type")
    @PostMapping("")
    public ResponseEntity<CardTypeResponseDTO> create(@RequestBody @Valid CardTypeRequestDTO dto) {
        log.info("Card Type Create {}{}", dto, CardTypeController.class);
        return ResponseEntity.ok(cardTypeService.create(dto));
    }


    @ApiOperation(value = "Update Card Type", notes = "Method used for update Card Type by id")
    @PutMapping("/{id}")
    public ResponseEntity<CardTypeResponseDTO> update(@PathVariable("id") String bId,
                                                  @RequestBody @Valid CardTypeRequestDTO dto) {
        log.info("CardType update {}{}", dto, CardTypeController.class);
        return ResponseEntity.ok(cardTypeService.update(dto, bId));
    }


    @ApiOperation(value = "Delete Card Type", notes = "Method used for delete Card Type by id")
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") String bId) {
        log.info("Card Type delete {}{}", bId, CardTypeController.class);
        return ResponseEntity.ok(cardTypeService.delete(bId));
    }


    @ApiOperation(value = "Get Card Type", notes = "Method used for Get Card Type by id")
    @GetMapping("/{id}")
    public ResponseEntity<CardTypeResponseDTO> getById(@PathVariable("id") String bId) {
        log.info("Card Type get by id {}{}", bId, CardTypeController.class);
        return ResponseEntity.ok(cardTypeService.getById(bId));
    }

}
