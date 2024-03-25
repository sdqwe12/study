package org.example;

public class Main3 {
    public static void main(String[] args) {
        String str1 = new String("so simple");
        String str2 = new String("so simple");

        String str3 = "so simple";
        String str4 = "so simple"; //이렇게 적어버리면 힙영역에 같이

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2)); //이꼴 쓰면 같은거라 판단함
        System.out.println(str3 == str4);

    }
}
