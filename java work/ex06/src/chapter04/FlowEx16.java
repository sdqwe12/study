package chapter04;
class FlowEx16 {
	public static void main(String[] args) { 
		// i=1 1부터 시작 j= 1~10
		//i=2 j= 1~10
		//i=5 일 때 j = j= 1~10
		for(int i=1;i<=5;i++) { 
			//System.err.println("i = " + i);
			for(int j=1;j<=10;j++) {
				//System.out.println("j = " + j);
				System.out.print("*");			
			}
			System.out.println();
		}
	} // main�� ��
}
