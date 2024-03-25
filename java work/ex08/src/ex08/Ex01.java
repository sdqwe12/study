//package ex08;
//
////길이가 같은 두 문자열 str1 str2
////두 문자열의 같 문자가 앞에서부터 서로 번갈아가며
////한 번씩 등장하는 문자열을 만들어 return하는 solution 함수 완성
//
//public class Ex01 {
//	public static void main(String[] args) {
//		String answer = "";
//		String a = "abcdef";
//		String b = "bbbbb";
//		char [] ac =a.toCharArray();
//		char [] bc =a.toCharArray();
//		
//		int [] ints = {1, 2, 3, 4, 5, 6, 7,};
//		
//		//ac[0] = a ac[1] = b ac[2]=c
//		//i=0 6전까지 반복해라
//		
//		for (int i = 0; i <ac.length; i++) {
//			// ac0 ...ac[5]
//			System.out.println(ac[i]);
//			// bc0 bc1 bc5
//			System.out.println(bc[i]);
//			answer = answer + ac[i] + bc[i];
//		}
//		
////		for (char temp : a.toCharArray())
////			System.out.println(temp);
//		System.out.println();
//		System.out.println("answer = "+ answer);
//		return answer;
//	}
//
//}
