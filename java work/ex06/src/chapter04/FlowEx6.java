package chapter04;
import java.util.*;

class FlowEx6 {
	public static void main(String[] args) { 
		int month = 0;

		

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // ȭ���� ���� �Է¹��� ������ tmp�� ����
		month = Integer.parseInt(tmp);   // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ

		/* Math.random()
		 * 0<x1
		 * 0<x<3
		 * 0.000000003 -> 0 -> 1
		 * 2.999999999 -> 2 -> 3
 * 
 */
		
		
		switch(month) {
			case 3: 
			case 4: 
			case 5:
				System.out.println("������ ������ ���Դϴ�.");
				break;
			case 6: case 7: case 8:
				System.out.println("������ ������ �����Դϴ�.");
				break;
			case 9: case 10: case 11:
				System.out.println("������ ������ �����Դϴ�.");
				break;
			default:
	//		case 12:	case 1: case 2:
				System.out.println("������ ������ �ܿ��Դϴ�.");
		}
	} // main�� ��
}
