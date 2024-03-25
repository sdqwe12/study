package org.example;

//기본형 타입 매개변수
//참조형 타입 매개변수

class BB{}
interface Inter{
    public void interFunction();
}
public class Main6 {
    public Main6() { //2번 방법
        doA(100, new BB(), ()->{ System.out.println("aaa"); } );
    }
// 선생님이 생각하기에 람다를 만든 이유는 매개변수에 함수를 넣기 위해
    public void doA(int a,BB b, Inter inter){
        inter.interFunction(); //해줘야함
        System.out.println("test");
    }
    public static void main(String[] args) {
        new Main6();

//        Main6 m = new Main6(); 1번방법
//        m.doA();
    }
}
