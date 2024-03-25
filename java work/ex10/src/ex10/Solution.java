package ex10;
//프로그래머스 day 8 의 9로 나눈 나머지
public class Solution {
	// 프로그램 시작과 동시에 메모리에 상자된다
	public Solution() {
		String num = "787206422647352489";
		solution(num);
	}

	public int solution(String number) {
		int answer = 0;
		
			char[] arr = number.toCharArray();
			
			int[] brr = new int[arr.length];
			int sum = 0;
			
			for (int i = 0; i < arr.length; i++) {
				brr[i] =arr[i] - 48;
			}
			for (int i = 0; i < arr.length; i++) {
				brr[i] =arr[i];
			}
			answer = sum %9;
		System.out.println(answer);
			
		return answer;
	}

	public static void main(String[] args) {

		new Solution(); // heap 영역
	}

}
