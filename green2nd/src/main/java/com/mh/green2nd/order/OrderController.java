package com.mh.green2nd.order;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@Service
@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @Operation(summary = "오더화면 음료가 디폴트 beverage food goods로 검색")
    @GetMapping("/menu")
    public ResponseEntity<List<String>> beverage(@RequestBody OrderDto orderDto) { // 반환 타입 변경
        List<String> result = orderService.viewmenu(orderDto.getP_category()); // 반환 타입 변경
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
