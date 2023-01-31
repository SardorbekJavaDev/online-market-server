package online.market.uz.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import online.market.uz.dto.request.OrderRequestDTO;
import online.market.uz.dto.response.OrderResponseDTO;
import online.market.uz.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/order")
@Api("Order")
public class OrderController {
    private final OrderService orderService;

    @ApiOperation(value = "Create Order", notes = "Method used for Create Order")
    @PostMapping("")
    public ResponseEntity<OrderResponseDTO> create(@RequestBody @Valid OrderRequestDTO dto) {
        log.info("Order Create {}{}", dto, OrderController.class);
        return ResponseEntity.ok(orderService.create(dto));
    }


    @ApiOperation(value = "Update Order", notes = "Method used for update Order by id")
    @PutMapping("/{id}")
    public ResponseEntity<OrderResponseDTO> update(@PathVariable("id") String bId,
                                                      @RequestBody @Valid OrderRequestDTO dto) {
        log.info("Order update {}{}", dto, OrderController.class);
        return ResponseEntity.ok(orderService.update(dto, bId));
    }


    @ApiOperation(value = "Delete Order", notes = "Method used for delete Order by id")
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") String bId) {
        log.info("Order delete {}{}", bId, OrderController.class);
        return ResponseEntity.ok(orderService.delete(bId));
    }


    @ApiOperation(value = "Get Order", notes = "Method used for Get Order by id")
    @GetMapping("/{id}")
    public ResponseEntity<OrderResponseDTO> getById(@PathVariable("id") String bId) {
        log.info("Order get by id {}{}", bId, OrderController.class);
        return ResponseEntity.ok(orderService.getById(bId));
    }

}
