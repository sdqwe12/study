package org.example;

import java.util.Comparator;
import java.util.TreeSet;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


}



public class Main4 {
    public static void main(String[] args) {
        TreeSet<Person> ts = new TreeSet<>();
        ts.add(new Person("홍길동",100));
        ts.add(new Person("김길동",20));
        ts.add(new Person("이길동",30));
        System.out.println(ts);

    }
}
