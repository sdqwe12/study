package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Robot","Toy","Box","Weapon");
                list = new ArrayList<>(list);



        Collections.sort(list);
        System.out.println();


    }
}
