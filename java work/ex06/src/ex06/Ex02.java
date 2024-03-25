package ex06;

public class Ex02 {
	public static void main(String[] args) {
		int x = 0;

		if (x == 0) {
			System.out.println((x == 0) + "입니다.");
		} if (x != 0) {
			System.out.println("실행이 안됩니다.");
		} if (x != 1) {
			System.out.println("실행이 안됩니다.");
		}
		// (x==0) 먼저 괄호 해줘야함 트루로 만드는 것 아니면 오류뜸
	}

}
