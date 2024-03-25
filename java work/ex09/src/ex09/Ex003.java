package ex09;

import java.util.Scanner;

public class Ex003 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String blank = "";
		String star = "";

		for (int i = 1; i <= N; i++) {
			//star += "*";
			//System.out.println(star);
			{
				for (int j = N - 1; j < 0; j--) {
					blank += "1";
					//System.out.println(blank);
				}
				for (int j = N; j > i; j--) {
					//blank += "1";
					System.out.print("1");
				}
				System.out.println("");
			}
		}
	}
}