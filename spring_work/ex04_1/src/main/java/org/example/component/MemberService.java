package org.example.component;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService implements InitializingBean, DisposableBean {
    @Autowired
    private  MemberRepository memberRepository;

    private String str = "jdbc";

    @Override
    public void afterPropertiesSet() throws Exception {
        str = "jdbc:mysql://....";
        System.out.println("IOC컨테이너에 들어갈 때...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("IOC컨테이너에서 없어질 때...");
    }

    public void regist() {
        memberRepository.insert();
    }
}
