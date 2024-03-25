package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        List<String> list = new LinkedList<>();
        list.add("test");
        String item = list.get(0);
        //리스트에서는 0번째 가져와라 이런게 되는데
        System.out.println(new String("box").hashCode());
        System.out.println(new String("box").hashCode());
        //셋은 그런게 없음
        set.add(new String("BOX"));
        set.add("ROBOT");
        set.add("BOX");
        set.add("TOY");

        System.out.println(set);

        Iterator<String> itr = set.iterator();
        while(itr.hasNext()) {
            String temp = itr.next();
            System.out.println(temp);
        }
        System.out.println();
        for (String temp : set) {
            System.out.println(temp);
        }
    }
}