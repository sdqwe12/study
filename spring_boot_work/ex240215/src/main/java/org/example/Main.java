package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        int[] ar = {1,2,3,4,5}; //배열은 잘안쓰게됨 리스트나 컬렉션 쓰니까
        IntStream is = Arrays.stream(ar);
        is.forEach(System.out::println);
//        is.forEach(s -> System.out.println(s)); 위에랑 같음

        System.out.println();

        List<Integer> list = Arrays.asList(11,22,33,44,55);
        Stream<Integer> is2 = list.stream();
        is2.forEach(System.out::println);

        list.stream().forEach(System.out::println); //보통 이렇게 한줄로 적는다
    }
}