package org.example;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Friend[] f = new Friend[5];

//        System.out.println(f[0]);
//        System.out.println(f[1]);
//        System.out.println(f[2]);
//
//        f[0] = new UniFriend(" hong", "comp", "010");
//        f[0] = new ComFriend("comff", "devel", "011");
//
//        System.out.println(f[0]);
//        System.out.println(f[0]);

        List<Friend> list = new ArrayList<>();
        list.add(new UniFriend("홍길동", "컴공", "010"));
    }
}