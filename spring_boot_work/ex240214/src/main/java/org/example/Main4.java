package org.example;

import java.util.function.Function;

public class Main4 {
    public static void main(String[] args) {

        Function<char[], String> fn = chars -> {
            return new String(chars);
        };

        //중괄호 삭제 한 것 위에꺼 익숙해지면 한번 해보자
        Function<char[], String> fn1 = chars -> new String(chars);

        String str = fn.apply(new char[]{'R','O','B','O','T'});
        System.out.println(str);

        String str1 = fn1.apply(new char[]{'B','A','N','A','N','A'});
        System.out.println(str1);
    }
}
