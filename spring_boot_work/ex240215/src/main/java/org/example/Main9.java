package org.example;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main9 {
    public static void main(String[] args) {
        Stream.of(11,55,33,22,99)
                .sorted()
                .forEach(System.out::println);

        System.out.println();

        Stream.of(11,55,33,22,99)
                .sorted((o1, o2) -> o2 - o1)
                .forEach(System.out::println);

        IntStream.of(1,3,5,7,9)
                        .peek(System.out::println);
        //피크 루핑은 중간연산이라 최종연산이 없으면 출력되지 않음
        System.out.println();

        IntStream.of(1,3,5,7,9)
                .peek(System.out::println)
                .sum();
//sum이라는 최종연산이 있어서 출력 됨
        System.out.println();
        IntStream.of(1,3,5,7,9)
                .peek(System.out::println)
                .forEach(System.out::println);
    }
}
