package ex05;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
//입력 받는거
 String result = n % 2 == 0 ? "n is even" : "n is odd";
	 System.out.println(result);
		}

}
