package org.example.Member;

import java.util.Scanner;

public class MemberCLI {
    Scanner scan = new Scanner(System.in);
    MemberDB md = new MemberDB();
    static boolean re = true;
    public Member signupInput() {
        System.out.println("이메일을 입력 하세요.");
        while (re) {
            re = false;
            String email = scan.next();
            md.findByEmail()
        }

        System.out.println("패스워드를 입력 하세요.");
        String password = scan.next();
        System.out.println("이름을 입력 하세요.");
        String name = scan.next();

//      return new Member(email, password, name, null,null);
        return Member.builder()
                .email(email)
                .password(password)
                .name(name)
                .build();
    }
    public Member loginInput() {
        System.out.println("이메일을 입력 하세요.");
        String email = scan.next();
        System.out.println("패스워드를 입력 하세요.");
        String password = scan.next();

        return Member.builder()
                .email(email)
                .password(password)
                .build();
    }
}
