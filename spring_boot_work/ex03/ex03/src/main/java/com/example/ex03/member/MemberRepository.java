package com.example.ex03.member;

import java.util.*;

public class MemberRepository {
    Map<String, Member> map = new HashMap<>();

    public void insert(Member member) {
        map.put(member.getEmail(), member);
        System.out.println("확인..."  );
    }

    public Collection<Member> select() {

        return map.values();
//        Set<String> keys = map.keySet();
//        return map.values();

    }
}
