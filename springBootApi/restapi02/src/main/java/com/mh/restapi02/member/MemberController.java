package com.mh.restapi02.member;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {
    // 셀렉트랑 인설트 해보자
//    @Autowired
    private final MemberRepository memberRepository;

    @GetMapping("member")
    public List<Member> allMember() {
        //셀렉트 구문 실행되는 것
        List<Member> list = memberRepository.findAll();
        System.out.println(list);
        return list;
    }

    @PostMapping("member")
    public Member memberSave(String username, String email) {
        System.out.println(username);
        System.out.println(email);
        //인설트 구문 실행 되는 것
        Member member = Member.builder()

                .username(username)
                .email(email)
                .build();
        Member dbMember = memberRepository.save(member);
        return dbMember;
    }
    @PutMapping("member")
    public Member update(Long id, String username, String email){
        Member member = Member.builder()
                .id(id)
                .username(username)
                .email(email)
                .build();
        Member dbMember = memberRepository.save(member);
        return dbMember;
    }
    @DeleteMapping("member")
    public String update(Long id){

        memberRepository.deleteById(id);
        return "deleted id = " + id;
    }
}
