package com.example.demo.member.repository.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Order {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long index;

    LocalDate orderDate;

    @ManyToOne // 여러개의 주문데이터가 하나의 상품을 가리키니까
    @JoinColumn
    Product product;


    @ManyToOne
    @JoinColumn
    Member member;

    int quantity;

    int unitPrice;

    int totalPrice;


}
