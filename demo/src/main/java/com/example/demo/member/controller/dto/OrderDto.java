package com.example.demo.member.controller.dto;
import lombok.Data;

@Data
public class OrderDto {

    Long memberId;
    Long productId;
    int quantity;

}
