package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
// alt +1 왼쪽으로 가고 그상태에서 alt insert 누르면 빠르게 클래스 생성

        AA.doB();
    //    AA.doA(); <-  주석 처리 안하면 오류남
        AA a1 = new AA();
        a1.doA();
        System.out.println(a1.getA());


    }
}