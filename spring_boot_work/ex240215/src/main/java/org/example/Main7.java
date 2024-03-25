package org.example;

import java.util.Arrays;
import java.util.List;

public class Main7 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("BOX","ROBOT","COMPLEX","SIMPLE");

        String result = list.stream()
                // 0이나 ""공백이 아니라 아이덴티티에 재일긴 문장을 적어주면 비교에 아이덴티티도 같이 진행
                .reduce("AAAAAAAAA",(s, s2) -> {
                    if (s.length() > s2.length())
                        return s;
                    else
                        return s2;
                });
        System.out.println(result);
    }
}
