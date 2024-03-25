package chapter04;
class FlowEx20 {
	public static void main(String[] args) { 
		// i=1 j1~5
		// i=2 j=1~5
		for(int i=1;i<=5;i++) { 
			for(int j=1;j<=5;j=j+2) {
		//		System.out.print("[%d,%d]", i, j);	
				System.out.print("["+i+","+j+"]");
			}
			System.out.println();
		}
	} // main�� ��
}
