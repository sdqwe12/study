package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(11, 22, 33, 44, 55);
        list1 = new ArrayList<>(list1);

        List<String> list2 = Arrays.asList("aa", "ab", "ac", "ad", "ae");
        list2 = new ArrayList<>(list2);

//        Predicate<Integer> predicate = (item)->{return item<33; };
//        list1.removeIf(predicate); //인테자로 프레디케이트 선언해서 문자열 들어오면 에러남 그래서 꼭 외울 필요 없음 콘슈머 프레디케이트 같은거

        list1.removeIf(integer -> integer<33);
        System.out.println(list1);

        list2.removeIf(s -> !s.equals("aa"));
        System.out.println(list2);
    }
}
