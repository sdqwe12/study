package org.example;

import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = ""; // 처음에는 공백을 넣어줘서 꼭 초기화 해야함 없으면 그냥 이상한게 들어갈 수도 있음
        // string answer; <-


        System.out.println(answer);
        System.out.println("문자열 입력");
        String str = scan.next();

        System.out.println("숫자 입력");
        int n = scan.nextInt();


        //System.out.println(n);

        for (int i = 0; i < n; i++) {
        answer = answer + str;
        }
        System.out.println(answer);
    }
}
