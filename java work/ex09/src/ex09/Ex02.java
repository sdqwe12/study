package ex09;
//원소들의 곱과 합
public class Ex02 {
	
	public static int solution(int[] num_list) {
	int answer = 0;
	
	int multi = num_list[0];
	int sum = num_list[0];
	for (int i = 1; i < num_list.length; i++) {
		multi = multi * num_list[i];
		sum += num_list[i];
	}
	if (multi > sum*sum) 
		answer = 0;
	else 
		answer = 1;
	
	
	System.out.println(answer);
	return answer;
	}
	public static void main(String[] args) {
		int[] num_list = {3,4,5,2,1};
//		int[] num_list = {5, 7, 8, 3,};
		solution(num_list);
		
//		System.out.println(3*4*5*2*1);
//		System.out.println((3+4+5+2+1)*(3+4+5+2+1));
//		
//		System.out.println(5*7*8*3);
//		System.out.println((5+7+8+3)*(5+7+8+3));
	}

}