package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
@FunctionalInterface //메서드 하나 들어 있는 거라고 알려주는 뜻?
interface  AA{
    int gen();
}
public class Main3 {
    public static void main(String[] args) {
    //for문으로 쓰면 이거보다 훨씬 길게 20줄 가까이 나오는데 람다 쓰니까 많이 줄인거임
        AA aa = () -> {
          return new Random().nextInt(50);
        };
        System.out.println(aa.gen());

        List<Integer> list = Arrays.asList(aa.gen(),aa.gen(),aa.gen());
        System.out.println(list);
    }
}
