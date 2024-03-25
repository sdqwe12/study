package org.example;

import aa.bb.AA;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        AA a = new AA();
        Scanner scan = new Scanner(System.in);
        //Integer i = Integer.valueOf(10);
        Integer i = new Integer(10);
        String binString = Integer.toBinaryString(i);
        System.out.println(binString);
    }
}
