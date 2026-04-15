package com.example.demo.member.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.member.controller.dto.OrderDto;
import com.example.demo.member.service.OrderService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class OrderController {
    
    private final OrderService orderService;

    @PostMapping("/orders/addOrder")
    public void  insertOrder(@RequestBody OrderDto dto){
        orderService.insertOrder(dto);
    }
}
