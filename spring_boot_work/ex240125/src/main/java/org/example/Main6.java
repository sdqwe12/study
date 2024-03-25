package org.example;

public class Main6 {
    public static void main(String[] args) {

        System.out.println("시작");
        try {
            // 강제로 내가 예외 발생 시킴
            throw new MyExeception2("새로운예외"); //쓰로우하면 강제로 내가만든 예외 발생 시킴
        } catch (MyExeception2 e) {
            e.printStackTrace();
        }
        System.out.println("끝");
    }
}
