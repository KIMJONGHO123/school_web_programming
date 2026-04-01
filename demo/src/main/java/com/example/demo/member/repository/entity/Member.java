package com.example.demo.member.repository.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructorructor(access=AccessLevel.PRIVATE)
@Getter
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int index;

    String name;




}
