package com.example.demo3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo3.entity.MemberInfo;

public interface MemeberRepository extends JpaRepository<MemberInfo,Long>{
    
}
