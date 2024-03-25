package org.example;

public class Main3 {

    public static void showAll(String ... aa) {
        for (String temp:aa) {
            System.out.println(temp);
        }
    }
    public static void main(String[] args) {
        showAll("Box");
        System.out.println();
        showAll("Box","Show");
        System.out.println();
        showAll("Box","Show","All");
    }
}
