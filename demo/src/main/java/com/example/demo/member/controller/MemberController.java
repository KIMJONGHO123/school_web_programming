package com.example.demo.member.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.member.controller.dto.JoinRequest;
import com.example.demo.member.service.MemberService;
import com.example.demo.member.service.MemberServiceImpl;

import lombok.RequiredArgsConstructor;



@RestController
@RequiredArgsConstructor
public class MemberController {
    
    private final MemberService memberService;

    @GetMapping("/hello")
    public String getHello(){
        return "hello";
    }

    @PostMapping("/join")
    public ResponseEntity<String> join(@RequestBody JoinRequest joinRequest){
        // String id = joinRequest.getId();
        // int age = joinRequest.getAge();
        // String name = joinRequest.getName();
        // String hobby = joinRequest.getHobby();
        memberService.Join(joinRequest.getId(),joinRequest.getName(),joinRequest.getAge(),joinRequest.getHobby());

        return ResponseEntity.ok("회원가입 완료");
    }


}
