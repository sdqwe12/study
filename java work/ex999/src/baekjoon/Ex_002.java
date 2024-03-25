package baekjoon;

import java.util.Arrays;

public class Ex_002 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int j = 0;
		
		for (int i = 4; i >= 0; i--) {
			arr[j] = i+1;
			j++;
		}
		System.out.println(Arrays.toString(arr));
	}

}
