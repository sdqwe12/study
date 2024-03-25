package org.example;

class Supercls {
    static int count = 0;
}

class SubCls extends Supercls {
    public static void setCount() {
        count = 100;
    }
}

public class Main3 {
    // 변수든 메서드든 메모리상에 올려 놓고 써야한다.
    public static void main(String[] args) {
        System.out.println(Supercls.count);
        System.out.println(SubCls.count);

        Supercls.count = 200;

        System.out.println(Supercls.count);
        System.out.println(SubCls.count);

        SubCls.setCount();
        System.out.println(Supercls.count);
        System.out.println(SubCls.count);

    }
}
