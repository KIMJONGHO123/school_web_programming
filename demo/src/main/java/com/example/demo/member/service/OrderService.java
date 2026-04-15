package com.example.demo.member.service;

import org.springframework.stereotype.Service;

import com.example.demo.member.controller.dto.OrderDto;
import com.example.demo.member.repository.MemberRepository;
import com.example.demo.member.repository.OrderRepository;
import com.example.demo.member.repository.ProductRepository;
import com.example.demo.member.repository.entity.Order;
import com.example.demo.member.repository.entity.Product;
import com.example.demo.member.repository.entity.Member;


@Service
public class OrderService {

    private MemberRepository memberRepository;
    private OrderRepository orderRepository;
    private ProductRepository productRepository;


    public void insertOrder(OrderDto dto) {

        Member member = memberRepository.findById(dto.getMemberId())
                                    .orElseThrow();

        
        Product product = productRepository.findById(dto.getProductId()).orElseThrow();

        Order order = Order.builder()
                            .product(product)
                            .member(member)
                            .quantity(dto.getQuantity())
                            .orderDate(null)
                            .unitPrice(0)
                            .totalPrice(0)
                            .build();

        orderRepository.save(order);
    }
    
}
