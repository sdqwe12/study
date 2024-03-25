package org.example;

import org.example.Member.MemberDB;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MenuPrint menu = new MenuPrint();
        MemberDB md = new MemberDB();
        menu.wellcome();
            while (true) {
                int select = 0;
            int menuNumber = menu.mainMenu();
            switch (menuNumber) {
                case 1:
                case 2:
                default:
                    System.out.println("메뉴 외의 번호를 입력하셨습니다. 다시 입력해주세요!");
            }
             }

    }
}