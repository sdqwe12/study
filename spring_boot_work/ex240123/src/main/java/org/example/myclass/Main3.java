package org.example.myclass;

class Cake {
    public  void yummy() {
        System.out.println("ACake yummy");
    }
}
class ACake extends Cake {
    public  void yummy () {
        System.out.println("BCake yummy");
    }
}

class BCake extends Cake {
    public void yummy(){
        super.yummy();
        System.out.println("ACake yummy");
    }
}
public class Main3 {
    public static void main(String[] args) {
        Cake cb = new BCake();
        Cake ca = new ACake();
        cb.yummy();
        ca.yummy();

        System.out.println("=================");
        System.out.println(cb instanceof BCake);
        System.out.println(cb instanceof ACake);
        System.out.println("=================");

        System.out.println("=================");
        System.out.println(ca instanceof BCake);
        System.out.println(ca instanceof ACake);
        System.out.println("=================");

    }
}
