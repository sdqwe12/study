package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Main7 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11,22,33,44,55);
        list.forEach(integer -> System.out.println(integer));

        System.out.println();
        //포문써도됨
        for (int i : list) {
            System.out.println(i);
        }
        System.out.println();
        Consumer<String> consumer = s -> System.out.println(s.length());
        consumer.accept("abcde");
        consumer.accept("123");

        BiConsumer<String,String> biConsumer = (s, s2) -> System.out.println(s+s2); //s,s2가 아니고 s+s2네
        biConsumer.accept("안녕하세요","오늘도 공부하신다고 고생하십니다.");
        biConsumer.accept("저는 솔직히","상대방이 무슨 생각하는지 몰라요.");
    }
}
