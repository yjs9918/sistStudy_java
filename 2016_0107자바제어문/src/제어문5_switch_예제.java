import java.util.Scanner;
// �ΰ� ���� => ������ ==> ó��
public class ���5_switch_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.print("1' ���� �Է�:");
		int num1=scan.nextInt();
		System.out.print("2' �����Է�:");
		int num2=scan.nextInt();
		
		System.out.print("������(+,-,*,/):");
		// ó��
		switch(scan.next())  //next:���� ������ ��   nextInt:������ ������ ��
		{
		case "+" :
			System.out.printf("%d+%d=%d\n", num1,num2,num1+num2);
			break;
		case "-" :
			System.out.printf("%d-%d=%d\n", num1,num2,num1-num2);
			break;
		case "*" :
			System.out.printf("%d*%d=%d\n", num1,num2,num1*num2);
			break;
		case "/" :
			if(num2==0)
				System.out.println("0���� ���� �� ����");
			else
			System.out.printf("%d/%d=%d\n", num1,num2,num1/num2);
			break;
		default : 
			System.out.println("�߸��� �������Դϴ�");
			
		
		}

	}

}
