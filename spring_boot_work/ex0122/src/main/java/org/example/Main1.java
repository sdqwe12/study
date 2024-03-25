package org.example;

class  man {
    private  String name;
    man() {
        System.out.println("man 부모 생성자");
    }
    man(String name) {
        this.name = name;
    }
    public void yourName() {
        System.out.println("name = "+name);
    }
}

class Businessman extends man {
    private String company;
    private String position;

    Businessman() {
        System.out.println("기본생성자");
    }

    Businessman(String name) {
        super(name);
    }
    
    Businessman(String company, String position, String name){
        this(name);
        this.company = company;
        this.position = position;

    }
    public void  yourInfo(){
        System.out.println("company = " + company);
        System.out.println("position = " + position);
        yourName();
    }
}

public class Main1 {
    // setter
    // 생성자 초기화
    public static void main(String[] args) {
        Businessman bu1 = new Businessman("그린컴퓨터학원", "강사", "홍길동");
        bu1.yourInfo();
    }
}
