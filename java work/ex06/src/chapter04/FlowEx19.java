package chapter04;
class FlowEx19 {
	public static void main(String[] args) { 
		//i=1일때 j=1일때 k는 1~3
		// i=1 j=2 k=1~3
		//i=1 j=3 k=1~3
		//i=2 j=1 k=1~3
		for(int i=1;i<=3;i++)  
			for(int j=1;j<=3;j++) 
				for(int k=1;k<=3;k++) 
					System.out.println(""+i+j+k);	
	} // main�� ��
}
