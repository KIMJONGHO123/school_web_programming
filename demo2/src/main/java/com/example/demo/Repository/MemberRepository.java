package com.shop.repository;

import com.shop.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemberRepository {

    private final List<Member> members = new ArrayList<>();

    public MemberRepository() {

        members.add(new Member("유재석", 53, "남"));
        members.add(new Member("하하", 46, "남"));
        members.add(new Member("이수지", 19, "여"));
    }

    public List<Member> findAll() {
        return members;
    }
}