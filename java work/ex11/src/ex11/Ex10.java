package ex11;
// 재귀함수 거의 안씀 for문 쓰지 본적 없음
public class Ex10 {
public static void main(String[] args) {
	
	int result = fact(5);
	
//	 fact(5)
//		5*fact(4)
//		5*4*fact(3)
//		5*4*3*fact(2)
//		5*4*3*2*fact(1)
	System.out.println(result);
	
	// 재귀함수 사용해서 doA(5)
	// 2*2*2*2*2했는 결과 나오도록 재귀함수 만드세요.
	
}

//	public static int fact(int num) {
//		  if (num > 0) {
//			return num * fact(num - 1);
//		} else {
//			return 1;
//		}
//		
//	}
	
	public static int fact(int num) {
		  if (num > 0) {
			return 2 * fact(num - 1);
		} else {
			return 1;
		}
		
	}
	
	
	
	
	
	
	
	

}
