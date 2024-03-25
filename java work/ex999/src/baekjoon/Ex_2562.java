package baekjoon;

import java.util.Scanner;

public class Ex_2562 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[9];
		
		int max = arr[0]; // 최댓값
		int index = 0; //최댓값의 위치
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			if (max < arr[i]) {
				max = arr[i];
				index = i+1;
			}
		}
		System.out.println(max);
		System.out.println(index);
		
		



	}

}
