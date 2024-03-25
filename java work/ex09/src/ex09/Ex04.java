package ex09;

public class Ex04 {
	public static void main(String[] args) {
		int[] arr= {100, 90, 60, 40, 120};
		
		for (int i = 0; i < 5-i; i++) {
			for (int j = 1; j < 5-j; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		
		
	}

}
