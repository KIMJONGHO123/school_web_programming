package com.example.demo3.service;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo3.dto.MemberDto;
import com.example.demo3.entity.MemberInfo;
import com.example.demo3.repository.MemeberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemeberRepository memberrepository;

    

    // 회원 등록 - join
    public MemberInfo create(String name, int age, String email,String password) {
        MemberInfo info = MemberInfo.builder()
                        .name(name)
                        .age(age)
                        .email(email)
                        .password(password)
                        .build();

        
        return memberrepository.save(info);
    }



    public List<MemberDto> findALL() {
        List<MemberInfo> li = memberrepository.findAll();
        List<MemberDto> list = new ArrayList<>();

        for (MemberInfo memberInfo : li) {
            MemberDto dto = new MemberDto();
            dto.setId(memberInfo.getId());
            dto.setName(memberInfo.getName());
            dto.setAge(memberInfo.getAge());
            dto.setEmail(memberInfo.getEmail());
            dto.setPassword(memberInfo.getPassword());

            list.add(dto);
        }
        return list;
    }



    
    // 회원 수정 - update

    // 회원 삭제 - delete

    // 회원 조회 (전체) - findALL


    // 회원 조회 (개인) - findById - Getmapping{id}

    public MemberDto getOne(Long id) {
        Optional<MemberInfo> meminfo = memberrepository.findById(id);
        // meminfo가 있으면 .get역할 수행. 없으면 해당 에러 메시지 반환
        MemberInfo info = meminfo.orElseThrow(()->new IllegalArgumentException("해당 회원이 존재하지 않습니다."));
        MemberDto dto = new MemberDto(info);
        return dto;
    }
}
