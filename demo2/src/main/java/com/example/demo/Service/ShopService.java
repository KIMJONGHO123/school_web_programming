package com.shop.service;

import com.shop.common.CardPayment;
import com.shop.common.Payment;
import com.shop.domain.Product;
import com.shop.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopService {

    private final ProductRepository productRepository;
    private final Payment payment;

    public ShopService(ProductRepository productRepository,
                       CardPayment payment) {

        this.productRepository = productRepository;
        this.payment = payment;
    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public int calculatePrice(String productName, int quantity) {

        Product product = productRepository.findAll()
                .stream()
                .filter(p -> p.getProductName().equals(productName))
                .findFirst()
                .orElseThrow(() ->
                        new IllegalArgumentException("상품이 존재하지 않습니다."));

        return product.getPrice() * quantity;
    }

    public void pay(int amount) {
        payment.pay(amount);
    }
}