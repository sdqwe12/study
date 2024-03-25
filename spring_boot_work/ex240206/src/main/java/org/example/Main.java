package org.example;

enum Person{
    MAN(10, "김길동"),WOMAN(20, "이순자");

    private int age;
    private String name;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("생송자 호출");
    }

    @Override //오버라이드 = 어노테이션 문법 적어도 돠고 안적어도 돠고
    public String toString() {
        return "Person age " + age + "Person name " + name;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println(Person.MAN);
        System.out.println(Person.WOMAN);


    }
}