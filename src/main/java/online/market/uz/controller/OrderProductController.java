package online.market.uz.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import online.market.uz.dto.request.OrderProductRequestDTO;
import online.market.uz.dto.response.OrderProductResponseDTO;
import online.market.uz.service.OrderProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/order/product")
@Api("Order Product")
public class OrderProductController {
    private final OrderProductService orderProductService;

    @ApiOperation(value = "Create OrderProduct", notes = "Method used for Create OrderProduct")
    @PostMapping("")
    public ResponseEntity<OrderProductResponseDTO> create(@RequestBody @Valid OrderProductRequestDTO dto) {
        log.info("OrderProduct Create {}{}", dto, OrderProductController.class);
        return ResponseEntity.ok(orderProductService.create(dto));
    }


    @ApiOperation(value = "Update OrderProduct", notes = "Method used for update OrderProduct by id")
    @PutMapping("/{id}")
    public ResponseEntity<OrderProductResponseDTO> update(@PathVariable("id") String bId,
                                                          @RequestBody @Valid OrderProductRequestDTO dto) {
        log.info("OrderProduct update {}{}", dto, OrderProductController.class);
        return ResponseEntity.ok(orderProductService.update(dto, bId));
    }


    @ApiOperation(value = "Delete OrderProduct", notes = "Method used for delete OrderProduct by id")
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") String bId) {
        log.info("OrderProduct delete {}{}", bId, OrderProductController.class);
        return ResponseEntity.ok(orderProductService.delete(bId));
    }


    @ApiOperation(value = "Get OrderProduct", notes = "Method used for Get OrderProduct by id")
    @GetMapping("/{id}")
    public ResponseEntity<OrderProductResponseDTO> getById(@PathVariable("id") String bId) {
        log.info("OrderProduct get by id {}{}", bId, OrderProductController.class);
        return ResponseEntity.ok(orderProductService.getById(bId));
    }

}
