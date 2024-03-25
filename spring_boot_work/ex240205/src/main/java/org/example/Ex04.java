package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex04 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Box", "Robot", "Aplle");
        list = new ArrayList<>(list);

        List<String> copylist = new ArrayList<>(list);

        Collections.copy(list, copylist);
        System.out.println(copylist);

        Collections.sort(list);
        System.out.println(list);
        // 바이너리 서치는 정렬 되고 해야함
        int idx = Collections.binarySearch(list, "Robot");
        System.out.println(idx);

        System.out.println(list.get(idx));
    }
}
