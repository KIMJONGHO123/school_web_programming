package com.example.demo.member.service;


import org.springframework.stereotype.Service;

import com.example.demo.member.repository.MemberRepository;
import com.example.demo.member.repository.entity.Member;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    
    private final MemberRepository memberRepository;

    @Override
    public void Join(String id, String name, int age, String hobby){
        if(id==null ||id.isEmpty() || name == null||  name.isEmpty()|| age <=0|| hobby ==null || hobby.isEmpty()){
            throw new IllegalArgumentException("값이 없습니다.");
        }
        Member member = Member.builder()
                            .id(id)
                            .name(name)
                            .age(age)
                            .hobby(hobby)
                            .build();

        memberRepository.save(member);
    }
    
    
}
