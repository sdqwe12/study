package baekjoon;

import java.util.Scanner;

public class Ex_10810 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] arr = new int[N];
		int M = scan.nextInt();
		
		for (int i = 0; i < M; i++) {
			int I = scan.nextInt();
			int J = scan.nextInt();
			int K = scan.nextInt();
			
			for (int j = I-1; j < J; j++) {
				arr[j] = K; 
			}
			
		}
		for (int K = 0; K < arr.length; K++) {
			System.out.print(arr[K] + " ");
		} 
}
}
