package com.example.demo3.dto;

import com.example.demo3.entity.MemberInfo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDto {
    private Long id;
    private String name;
    private int age;
    private String email;
    private String password;


    public MemberDto(MemberInfo info){
        this.id = info.getId();
        this.name = info.getName();
        this.age  = info.getAge();
        this.email = info.getEmail();
        this.password = info.getPassword();
    }
}
