package org.example;

interface Calcu {
    void cal(int a, int b);
}

interface ReCalcu {
    int cal(int a, int b);
}

public class Main2 {

    public static void doA(Calcu cc, int... a) { //가변인자 사용한거임 사용법 알아야함
        cc.cal(a[0], a[1]);
    }

    //인텔리제이 정렬 ctrl + alt + l
    public static void main(String[] args) {

        ReCalcu rcc = (a, b) -> a + b;
//        ReCalcu rcc = (a, b) -> { return  a + b; }; 중괄호와 리턴 생략 가능

        int result = rcc.cal(5, 5);
        System.out.println(result);
        System.out.println(rcc.cal(5,5));

        doA((a, b) -> System.out.println(a + b), 10, 20);
        doA((a, b) -> System.out.println(a - b), 10, 20);
//        Calcu cc1 = (a, b) -> System.out.println(a+b);
//        cc1.cal(10,20);
//
//        Calcu cc2 = (a, b) -> System.out.println(a-b);
//        cc2.cal(10,20);
    }
}
