package com.example.demo3.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo3.dto.MemberDto;
import com.example.demo3.entity.MemberInfo;
import com.example.demo3.service.MemberService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
@CrossOrigin(origins = "*") // HTML 파일에서 비동기(Fetch) 요청을 보낼 때 발생하는 CORS 에러 방지
public class MemberController {
    
    private final MemberService memberservice;

    @PostMapping
    public ResponseEntity<MemberInfo> createMember(@RequestBody MemberDto mapping){
        if(mapping.getName().isEmpty() || mapping.getAge()<=0 || mapping.getEmail().isEmpty()){
            return ResponseEntity.status(201).build();
        }
        MemberInfo info = memberservice.create(mapping.getName(),mapping.getAge(),mapping.getEmail(),mapping.getPassword());
        // if(info==null){
        //     return ResponseEntity.status(201).build();
        // }

        return ResponseEntity.status(200).body(info);
    }

    @GetMapping
    public List<MemberDto> getMethodName() {
        List<MemberDto> li = memberservice.findALL();
        return li;
    }

    @GetMapping("/{id}")
    public ResponseEntity<MemberDto> getMethodName(@PathVariable("id") Long id) {
        MemberDto dto =  memberservice.getOne(id);
        return ResponseEntity.ok(dto);
    }
    
    

}
