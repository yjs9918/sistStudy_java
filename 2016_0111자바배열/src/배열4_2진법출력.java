/*
 *   ���� �Է¹޾Ƽ� => 2����
 *   10
 *   0000 0000 0000 1010
 * 
 */
import java.util.Scanner;
public class �迭4_2������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] binary=new int[16];
		int index=15;
		Scanner scan=new Scanner(System.in);
		System.out.print("1~32767������ ���� �Է�:");
		int input=scan.nextInt();
		// System.out.println(Integer.toBinaryString(input)); ���� 2���� ��� ���
		//������ ����
		while(true)
		{
			binary[index]=input%2;
			input=input/2; //���� ���� 0,1
			if(input==0) break;
			index--;
		}
		//����� �������� ���
		for(int i=0;i<binary.length;i++)
		{
			if(i%4==0 && i!=0)
				System.out.print(" ");
			
			System.out.print(binary[i]);
		}

	}

}
