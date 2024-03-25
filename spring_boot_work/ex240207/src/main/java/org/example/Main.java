package org.example;

//enum 제한 정해진 값을
//어노테이션 롬복

//스태틱 메서드 에서는 스태틱 변수만 사용 가능 heap 영역 변수 사용 x
//heap 영역 메서드이면 heal변수와 스태틱 변수 둘다 사용 가능
//메모리 상에 올려놓고 사용해야된다
//스태틱은 처음부터 올라가있고
class outer {
    private static int num = 0;

    public static class Nested1 {
        //static 이 아니면 넘이 공유가 안되는 문제가 발생
        public void add(int n){num+=n;}
    }
    public static class Nested2 {
        public int get() {
            int a = 10;
            return num + a;
        }
        public void doPrint(){
            System.out.println(num);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        outer.Nested1 ns1 = new outer.Nested1();
        outer.Nested2 ns2 = new outer.Nested2();

        ns1.add(100);
        System.out.println(ns2.get());
        ns2.doPrint();
    }
}