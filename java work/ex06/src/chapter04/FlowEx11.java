package chapter04;
import java.util.*;

class FlowEx11 {
	public static void main(String[] args) { 
		char gender;
		String regNo = "";

		Scanner scanner = new Scanner(System.in);
		regNo = scanner.nextLine();

		gender = regNo.charAt(7); // �Է¹��� ��ȣ�� 8��° ���ڸ� gender�� ����

//		if (gender =='1' || gender =="3") {
//			if (gender =='1') {
//				System.out.println("2000년 전애 태어난 남자입니다.");
//			}else {
//				System.out.println("2000년 이후에");
//			}
//			
//		}
		
		switch(gender) {
			case '1':
			case '3':
				switch(gender) {
					case '1':
					System.out.println("2000년 이저에 태어난 남자입니다.");
						break;
					case '3':
					System.out.println("2000년 이후에 태어난 남자입니다.");
				}
				break;    // �� break���� ������ �ʵ��� ����
			case '2':
			case '4':
				switch(gender) {
					case '2':
					System.out.println("2000년 이전에 태어난 여자입니다.");
						break;
					case '4':
					System.out.println("2000년 이후에 태어난 여자입니다.");
						break;
				}
				break;
			default:
				System.out.println("아무것도 아닙니다.");
		}
	} // main�� ��
}
