package org.example;

import java.util.List;

public class Main4 {

    public static void doA(Printable prn) {
        prn.Print();
    }
    public static void main(String[] args) {
        doA() ()->{
            System.out.println("함수");
        } );
        List<String> list = list.of("aa", "bb", "cc");

        list.stream().forEach((item)->{
            System.out.println(item);
        });
        System.out.println();

        list.stream()
                .filter( item-> item.contains("aa"))
                .forEach();

    }
}
