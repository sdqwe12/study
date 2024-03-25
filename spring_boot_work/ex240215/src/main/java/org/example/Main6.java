package org.example;

import java.util.Arrays;
import java.util.List;

class Toy {
    private String name;
    private int price;

    public Toy(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
public class Main6 {
    public static void main(String[] args) {
        List<Toy> list = Arrays.asList(new Toy("로봇",3000),
                                       new Toy("총",5000),
                                       new Toy("인형",10000));

        int sum = list.stream().filter(toy -> toy.getPrice()<10000)
                               .mapToInt(value -> value.getPrice())
//                             .sum(); // 섬이 모든 곳에서 제공해주지 않아 차라리 리듀스를 써라
                               .reduce(0,(left, right) -> left +right);

        System.out.println(sum);
    }
}
