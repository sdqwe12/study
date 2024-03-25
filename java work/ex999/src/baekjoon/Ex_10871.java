package baekjoon;

import java.util.Scanner;

public class Ex_10871 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int N = scan.nextInt();
	int[] arr = new int[N]; 
	int X = scan.nextInt();
	
	for (int i = 0; i < N; i++) {
		arr[i] = scan.nextInt();
	}
	scan.close();
	
	for (int i = 0; i < N; i++) {
		if (arr[i] < X) {
			System.out.print(arr[i] + " ");
		}
	}
	

}
}