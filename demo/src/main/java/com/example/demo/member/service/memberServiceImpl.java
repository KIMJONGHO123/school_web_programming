package com.example.demo.member.service;

import java.lang.reflect.Member;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class memberServiceImpl implements memberService {
    
    @Override
    public String Join(String id, String name, int age, String hobby){
        Member member = Member.build()
                            .id(id)
                            .name(name)
                            .age(age)
                            .hobby(hobby)
                            .build();

        
    }
}
