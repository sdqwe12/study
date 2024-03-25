package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Person p1 = new Person("Park");
            Person p2 = new Person("Yoon");

            p1 = null;
            p2 = null;

            //오라클에서 쓰지말라고 함 파이널라이즈
            System.gc(); //뭐임 //가비지 콜렉션 작동해서 힙영역 직접 삭제해라
            System.runFinalization(); //? //소멸시에 호출되는 함수 실행해라

        System.out.println("End of program");

    }
}