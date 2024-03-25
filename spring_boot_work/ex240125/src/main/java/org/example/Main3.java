package org.example;

interface Upper{
default public String doUpper(String con){ return con.toUpperCase();}
}

interface Lower{
default public String doLower(String con){return  con.toLowerCase();}
}

interface Printa{
    void doA(String con);
}

class MYPrinter implements Printa, Upper{

    @Override
    public void doA(String con) {
        System.out.println(con);
    }
}
public class Main3 {
    public static void main(String[] args) {
        MYPrinter mp = new MYPrinter();
        mp.doA("abcdefg");

        System.out.println(mp instanceof Upper);
        //다형성
        //자식은 부모 객체를 담을 수 있다.
        //부모 객체는 자식개체를 참조할 수 있다.
        if (mp instanceof Upper) {
            Upper up = mp;
        }
        try {
            Lower lower = (Lower) mp;
            System.out.println("여기는 실행안됨");
        }catch (ClassCastException cce){
            System.out.println("형변환예외");
        }
      
        System.out.println(mp instanceof Lower);
    }
}
