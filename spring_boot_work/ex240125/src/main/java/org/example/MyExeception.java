package org.example;

public class MyExeception extends Exception{
    public  MyExeception(String con) {
        super("내예외");
    }
}

class MyExeception2 extends Exception{
    public MyExeception2(String con) {
        super(con);
    }
}
