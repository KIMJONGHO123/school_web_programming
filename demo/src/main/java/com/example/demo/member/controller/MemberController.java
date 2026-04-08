package com.example.demo.member.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.member.controller.dto.JoinRequest;
import com.example.demo.member.repository.entity.Member;
import com.example.demo.member.service.MemberService;

import lombok.RequiredArgsConstructor;



@RestController
@RequiredArgsConstructor
public class MemberController {
    
    private final MemberService memberService;

    @GetMapping("/hello")
    public String getHello(){
        
        return "안녕하세요 동의대 학생 여러분";
    }




    @PostMapping("/join")
    public ResponseEntity<String> join(@RequestBody JoinRequest joinRequest) throws Exception{
        // String id = joinRequest.getId();
        // int age = joinRequest.getAge();
        // String name = joinRequest.getName();
        // String hobby = joinRequest.getHobby();
        
        String status = memberService.Join(joinRequest);
        if("success".equals(status)){
            return ResponseEntity.ok("회원가입 완료");
        }else{
            return ResponseEntity.ok("회원가입 실패");
        }

        
    }

    // @GetMapping("/members/hello")
    // public String getMember(){
    //     return memberService.getMember();
    // }

    @GetMapping("/members/{index}")
    public Member getMethodName(@PathVariable Long index){
        return memberService.findById(index);
    }

    @GetMapping("/members")
    public List<Member> findByAllMember(){
        return memberService.findAll();
    }

}
