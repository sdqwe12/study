package org.example.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class MemberService {

    @Autowired
    MemberDAO memberDAO;

    // Member map 등록하러.. 가야함.
    public void Regist(Member member){
        memberDAO.insert(member);

        //내용을 출력
    }
    public void list(){
        Collection<Member> collection = memberDAO.select();
        collection.forEach(System.out::println);

    }
}
