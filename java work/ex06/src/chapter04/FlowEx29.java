package chapter04;
class FlowEx29 {
	public static void main(String[] args) { 
		// i= 1~100까지 반복구문 수행
		//
		for(int i=1;i<=100;i++) {
			System.out.printf("i=%d ", i);

			int tmp = i;

			do {
				if(tmp%10%3==0 && tmp%10!=0) { //
					System.out.print("¦");
			} 
				tmp = tmp / 10;
				System.out.println("tmp = "+tmp);
			}
				while(tmp !=0);  //

			System.out.println();
		
	} // main
}
}