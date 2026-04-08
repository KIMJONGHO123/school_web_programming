package com.example.demo.member.service;

import java.lang.reflect.Member;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.member.controller.dto.JoinRequest;

public interface MemberService {
    

    String Join(@RequestBody JoinRequest joinRequest) throws Exception;

    String getMember();

    Member findById(Long index);

    List<com.example.demo.member.repository.entity.Member> findAll();
}
