package com.shop.controller;

import com.shop.domain.Member;
import com.shop.domain.Product;
import com.shop.service.MemberService;
import com.shop.service.ShopService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/shop")
public class ShopController {

    private final MemberService memberService;
    private final ShopService shopService;

    public ShopController(MemberService memberService,
                          ShopService shopService) {

        this.memberService = memberService;
        this.shopService = shopService;
    }

    // 20세 이상 회원 조회
    @GetMapping("/members")
    public List<Member> getAdultMembers() {

        return memberService.getAdultMembers();
    }

    // 상품 목록 조회
    @GetMapping("/products")
    public List<Product> getProducts() {

        return shopService.getProducts();
    }

    // 상품 가격 계산
    @PostMapping("/purchase")
    public Map<String, Object> purchase(
            @RequestParam String productName,
            @RequestParam int quantity) {

        int totalPrice = shopService.calculatePrice(productName, quantity);

        Map<String, Object> result = new HashMap<>();

        result.put("상품명", productName);
        result.put("수량", quantity);
        result.put("총금액", totalPrice);

        return result;
    }

    // 결제
    @PostMapping("/pay")
    public String pay(@RequestParam int amount) {

        shopService.pay(amount);

        return "결제 완료";
    }
}