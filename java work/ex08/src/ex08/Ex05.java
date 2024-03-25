package ex08;

public class Ex05 {
	public static void main(String[] args) {
//		i=0 j=0~9
//		i=1 j=0~9
//		i=5 j=0~9
		//3 6 9일 때 출력 x
		for (int i = 0; i <10; i++) {
			System.out.println("i = "+i);
			for (int j = 0; j <10; j++) {
				if (j==3 || j==6 || j==9) {
					continue;
				}else {
					System.out.println("\t j = "+j);
				}
				
			}
			
		}
	}

}
