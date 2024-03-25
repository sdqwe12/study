package com.example.ex03.conf;

import com.example.ex03.member.MemberRepository;
import com.example.ex03.member.MemberService;
import com.example.ex03.myanno.ManualBean;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

// mcontrol
// mservice ->
// repository ->
//member
/* regist ->
list->
 */
@Configuration
@ComponentScan(value = "aa.bb.cc",
                excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = ManualBean.class)
                }
)
public class MyConf {
    @Bean
    public MemberService memberService(){
        return new MemberService();
    }
    @Bean
    public MemberRepository memberRepository(){
        return new MemberRepository();
    }


}
