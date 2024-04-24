package com.mh.green2nd.order;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;


    public List<String> viewmenu(String category) { // 반환 타입 변경
        return orderRepository.viewmenu(category);
    }

}
