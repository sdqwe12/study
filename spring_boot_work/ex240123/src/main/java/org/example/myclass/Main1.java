package org.example.myclass;

class SuperCls {
    public void doA() {
        System.out.println("SuperCls doA");
    }
}

class Subcls extends SuperCls {

    public int b = 20;
    //오버로딩 매개변수가 다른 함수명이 동일해도 된다.
//    public void doA() {
//        System.out.println("subCls doA");
//    }
}

public class Main1 {
    public static void main(String[] args) {
        SuperCls sc = new SuperCls();
        sc.doA();

        Subcls subcls = new Subcls();
        subcls.doA();
    }

}
