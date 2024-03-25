package ex12;

class Accumlator {
	
	static int sum = 0;
	
	public static void add(int i) {
		sum += i;
	}
	public static void showResult() {
		System.out.println("sum = "+sum);
	}
}

public class Ex07 {
public static void main(String[] args) {
	
	for (int i = 0; i < 10; i++) {
		Accumlator.add(i);
	}
		Accumlator.showResult();
}
}
