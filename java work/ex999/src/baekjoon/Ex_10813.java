package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_10813 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] arr = new int[N];
		int M = scan.nextInt();
		int temp;

		for (int i = 0; i < N; i++) {
			arr[i] = i + 1;
		}

		for (int j = 0; j < M; j++) {
			int I = scan.nextInt()-1;
			int J = scan.nextInt()-1;

			for(int k = I; k < J;k++) {
				temp = arr[I];
				arr[I] = arr[J];
				arr[J] = temp;
				J--;
				I++;
				
			}
			System.out.println(Arrays.toString(arr));
		}
		
		//scan.close();
	}
}
