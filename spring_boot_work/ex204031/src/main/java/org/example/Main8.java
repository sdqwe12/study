package org.example;

import java.util.StringTokenizer;

public class Main8 {
    public static void main(String[] args) {
        String a = "오후 : 08 :22";

        StringTokenizer st = new StringTokenizer(a,":");
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            System.out.println(temp);
        }
        String[] arr = a.split(":");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //스트링토크나이저 써도 되고 스플릿 써도 됨
        // :가 있으면 줄바꾸주는 나누서 잘라주는? 그런 거인듯
    }
}
