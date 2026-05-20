package com.example.demo.Common;

import org.springframework.stereotype.Component;

@Component
public class CardPayment implements Payment {

    @Override
    public void pay(int amount) {
        System.out.println("카드로 " + amount + "원 결제 완료!");
    }
}