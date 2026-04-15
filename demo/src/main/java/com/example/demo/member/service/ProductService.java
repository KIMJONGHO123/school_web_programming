package com.example.demo.member.service;

import org.springframework.stereotype.Service;

import com.example.demo.member.controller.dto.ProductDto;
import com.example.demo.member.repository.ProductRepository;
import com.example.demo.member.repository.entity.Product;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;


    public void update(ProductDto dto) {
        Product pro  = Product.builder()
                        .name(dto.getName())
                        .price(dto.getPrice())
                        .build();

        productRepository.save(pro);
        
    }
    
}
