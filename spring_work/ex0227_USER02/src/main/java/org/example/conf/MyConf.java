package org.example.conf;

import org.example.component.AABBService;
import org.example.member.MemberDAO;
import org.example.member.MemberService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"org.example.member"})
public class MyConf {

    //굳이 이렇게 만들지않겠지만 팀프중에 같은 이름을 생성하는 경우도 있다고함
//    @Bean
//    @Qualifier("meberservice1")
//    public org.example.user.MemberService memberService1(){
//        return new org.example.user.MemberService();
//    }
//    @Bean
//    @Qualifier("memberservice2")
//    public org.example.member.MemberService memberService2() {
//        return new org.example.member.MemberService();
//    }
//
//    @Bean
//    public MemberDAO memberDAO() {
//        return new MemberDAO();
//    }

    @Bean
    public AABBService aabbService() {
        return new AABBService();
    }
}
