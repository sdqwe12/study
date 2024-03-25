package ex09;

import java.util.Scanner;

public class Ex005 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// int T = scan.nextInt();

		for (int i = 0;; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();

			if (A == 0 && B == 0) {
				break;
			}
			System.out.println(A + B);
		}
	}

}
