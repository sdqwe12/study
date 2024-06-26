package org.example;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main10 {
    public static void main(String[] args) {
        System.out.println(
        IntStream.of(1,3,5,7,9)
                .sum()
        );

        System.out.println(
                IntStream.of(1,3,5,7,9)
                        .count()
        );

        IntStream.of(1,3,5,7,9)
                .average().ifPresent(System.out::println);

        // 이렇게 하면 스트림 끝나고 그냥 끝나기에 평균값을 어디에 담아서 쓰려면

        IntStream.of(1,3,5,7,9)
                .max().ifPresent(System.out::println);

        IntStream.of(1,3,5,7,9)
                .min().ifPresent(System.out::println);

        double avg = IntStream.of(1,3,5,7,9)
                .average().orElse(0);
        System.out.println(avg);
        // avg에 평균값을 담아줘서
    }
}
