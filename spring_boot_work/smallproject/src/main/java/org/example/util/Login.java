package org.example.util;

import org.example.member.Member;

public class Login {
    //DBmember 객체 담고
    public static Member member;
    // 로그인 여부를 저장
    public static boolean login = false;

    public static String getRole(){
        return member.getRole();
    }
}
