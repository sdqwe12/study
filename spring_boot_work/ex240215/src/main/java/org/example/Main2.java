package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {

        int[] ar = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(ar);
        IntStream intStream1 = intStream.filter(n -> n % 2 == 1);
        int sum = intStream1.sum();
        System.out.println(sum);
        // 이건 좀 길게 적은거


        System.out.println( Arrays.stream(ar).filter(n -> n % 2 == 1).sum());
        // 더 줄여서 한줄로

        // 이렇게 쓰는 방법도 있는데 어려움
        Stream.of(1,2,3,4,5)
                .filter(n->n%2==1)
                .reduce(0, ((integer, integer2) -> integer += integer2));

        System.out.println(sum);
    }
}
