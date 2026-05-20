package com.example.demo3.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo3.dto.MemberDto;
import com.example.demo3.entity.MemberInfo;
import com.example.demo3.service.MemberService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {
    
    private final MemberService memberservice;

    @PostMapping
    public ResponseEntity<MemberInfo> createMember(@RequestBody MemberDto mapping){
        if(mapping.getName().isEmpty() || mapping.getAge()<=0 || mapping.getEmail().isEmpty()){
            return ResponseEntity.status(201).build();
        }
        MemberInfo info = memberservice.create(mapping.getName(),mapping.getAge(),mapping.getEmail());
        if(info==null){
            return ResponseEntity.status(201).build();
        }

        return ResponseEntity.status(200).body(info);
    }

}
