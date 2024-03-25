package ex09;

import java.util.Arrays;
import java.util.Iterator;

//랜덤한 숫자 0~9까지 10개를 배열에 담아 나온수의 갯수를 세주세요

public class Ex06 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int[] cnt_arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = (int) (Math.random() * 10);

		}
		System.out.println(Arrays.toString(arr));

		int counter = 0;
		int tnum = 0;
		for (; tnum < 10; tnum++) {
		for (int i = 0; i < 10; i++) {
			if (tnum == arr[i]) {
				counter++;
			}
		}
		cnt_arr[tnum] = counter;
		counter = 0;
		}
		System.out.println(counter);
		class aa {
			public static void doA() {
				System.out.println("AA.doA() 메서드 입니다.");
			} // m

		}
	}
}