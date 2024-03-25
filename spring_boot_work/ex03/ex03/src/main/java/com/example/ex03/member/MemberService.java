package com.example.ex03.member;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.List;

@ToString
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    public void regist(Member member) {
        System.out.println("확인......");

        memberRepository.insert(member);
    }

    public void list() {
//        Collection<Member> collection = memberRepository.select();
        Collection<Member> collection = memberRepository.select();
        collection.stream().forEach(System.out::println);
    }
}
