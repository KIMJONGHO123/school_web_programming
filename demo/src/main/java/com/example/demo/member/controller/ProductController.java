package com.example.demo.member.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.member.controller.dto.ProductDto;

import com.example.demo.member.service.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ProductController {
    
    private final ProductService productService;
    @PostMapping("/products/addProduct")
    public void intProuct(@RequestBody ProductDto dto){
        productService.update(dto);
    }

}
