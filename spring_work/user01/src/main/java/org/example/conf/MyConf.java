package org.example.conf;

import org.example.member.MemberRepository;
import org.example.member.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConf {
    @Bean
    public MemberRepository memberRepository(){
        MemberRepository md = new MemberRepository();
        return md;
    }
    @Bean
    public MemberService memberService(){
        MemberService ms = new MemberService(memberRepository());
        return ms;
    }
}
