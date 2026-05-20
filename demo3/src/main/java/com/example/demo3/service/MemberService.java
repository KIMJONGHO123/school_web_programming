package com.example.demo3.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo3.controller.MemberController;
import com.example.demo3.entity.MemberInfo;
import com.example.demo3.repository.MemeberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberController membercontroller;
    private final MemeberRepository memberrepository;

    

    // 회원 등록 - join
    public MemberInfo create(String name, int age, String email) {
        MemberInfo info = MemberInfo.builder()
                        .name(name)
                        .age(age)
                        .email(email)
                        .build();

        
        return memberrepository.save(info);
    }
    // 회원 수정 - update

    // 회원 삭제 - delete

    // 회원 조회 (전체) - findALL

    // 회원 조회 (개인) - findById - Getmapping{id}
}
