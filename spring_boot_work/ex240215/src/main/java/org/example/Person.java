package org.example;

//나이가 20살인 것만 필터링 출력하고 싶다
class Person {
    private String name;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }



    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
