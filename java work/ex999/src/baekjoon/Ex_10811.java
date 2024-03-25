package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_10811 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); // 바구니 개수
		int M = scan.nextInt(); // 역순 몇번 하는지
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = i + 1; // 바구니에 1번부터 번호

		}
		for (int j = 0; j < M; j++) { // m개의 줄 입력
			int left = scan.nextInt() -1;
			int right = scan.nextInt() -1;

			for (int i = left; i <= right; i++) {
				for (int k = right; k > left; k--) {
					int tmp;
					tmp = arr[k];
					arr[k] = arr[i];
					arr[i] = tmp;
					right--;
					left++;
					
				}
				System.out.println(Arrays.toString(arr));
			}

		} // for

	} // main
} // class
