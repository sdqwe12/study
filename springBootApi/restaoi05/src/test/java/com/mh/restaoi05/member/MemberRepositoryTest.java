package com.mh.restaoi05.member;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    //테스트 하기전 디비 내용 다 삭제하기
    @BeforeEach
    public void init(){
        System.out.println("delete all");
        memberRepository.deleteAll();
    }

    @Test
    public void savetest(){
        System.out.println("여기오나");
        Member member = Member.builder()
                .username("user")
                .password("1234")
                .email("aaa.@naver.com")
                .build();
        Member dbMember = memberRepository.save(member);

        //맞는지 확인하는 작업
        assertEquals("aaa@naver.com",dbMember.getUsername());
        assertEquals("1234",dbMember.getPassword());

    }
    @Test
    public void selecttest(){
        List<Member> list = memberRepository.findAll();

        for (Member member : list){
            System.out.println(member);
        }

    }

}