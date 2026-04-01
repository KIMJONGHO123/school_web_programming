package com.example.demo.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.member.controller.dto.JoinRequest;

public interface MemberRepository extends JpaRepository<JoinRequest,Long> {
    
}
