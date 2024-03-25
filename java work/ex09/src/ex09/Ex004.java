package ex09;

import java.util.Scanner;

public class Ex004 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		for (int i = N; i > 0; i--) {
			for (int j = 0; j < i-1; j++) {
				System.out.print(" ");
			}
			for (int k = N; k > i-1; k--) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}
}
