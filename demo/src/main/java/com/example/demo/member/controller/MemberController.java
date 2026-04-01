package com.example.demo.member.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.member.controller.dto.JoinRequest;

import lombok.RequiredArgsConstructor;



@RestController
@RequiredArgsConstructor
public class MemberController {
    
    @GetMapping("/hello")
    public String getHello(){
        return "hello";
    }

    @GetMapping("/join")
    public String join(@RequestBody JoinRequest joinRequest){
        String id = joinRequest.getId();
        int age = joinRequest.getAge();
        String name = joinRequest.getName();
        String hobby = joinRequest.getHobby();

        
    }


}
