package com.example.demo.member.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.member.controller.dto.JoinRequest;
import com.example.demo.member.repository.MemberRepository;
import com.example.demo.member.repository.entity.Member;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{
    
    private final MemberRepository memberRepository;

    @Override
    public String Join(@RequestBody JoinRequest joinRequest) throws Exception{
        if(joinRequest.getName() == null|| joinRequest.getName().isEmpty()){
            throw new Exception();
        }
        Member member = Member.builder()
                            .name(joinRequest.getName())
                            .build();

        memberRepository.save(member);
        return "success";
    }
    
    @Override
    public String getMember(){
        return "Hello DEU!";
    }

    @Override
    public Member findById(Long index){
        return memberRepository.findById(index).orElseThrow();
    }
    
    @Override
    public List<Member> findAll(){
        List<Member> list = new ArrayList<>();
        list = memberRepository.findAll();
        return list;
    }
}
