package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main4 {

        public void doA() { //스태틱함수가 아니라 생성자나 객체생성 필요
 //           try {
                int[] arr = new int[10];
                arr[11] = 10;

                Scanner scan = new Scanner(System.in);

                System.out.println("숫자 입력하세요");
                int a = scan.nextInt();

                System.out.println("숫자 입력하세요");
                int b = scan.nextInt();

                System.out.println("a/b = " + a / b);
                return; //리턴이 있으면 함수종료인데 들렸다간다고함
//            } catch (ArithmeticException e) {
//                System.out.println("0으로 나눌 수 없습니다.");
//            } catch (InputMismatchException ie) {
//                System.out.println("문자 입력 하시면 안돼요.");
//            }
//
//            finally { //파이널리 하고 중괄호 안에는 무조건 실행해주는듯?
//                System.out.println("Good bye");
//            }
        }
    public static void main(String[] args){
                Main4 main4 = new Main4();
                try {
                    main4.doA();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                System.out.println("강제 종료되어 여기 실행 안됨");
            }
    }

