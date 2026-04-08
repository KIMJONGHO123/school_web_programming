package com.example.demo.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.member.repository.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member,String> {
    
}
