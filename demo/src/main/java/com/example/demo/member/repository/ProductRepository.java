package com.example.demo.member.repository;

import org.springframework.stereotype.Repository;
import com.example.demo.member.repository.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    
}
