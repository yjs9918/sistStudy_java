
import java.util.Scanner;
public class HW05_����������Է�_�������ϱ�if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.print("����:");
		int kor=scan.nextInt();
		System.out.print("����:");
		int eng=scan.nextInt();
		
		//����
		int total=(kor+eng);
		//���
		double avg=(total/2.0);
		//����
		char hak='A';
		if((int)avg>=90)
			hak='A';
		else if((int)avg>=80)
			hak='B';
		else if((int)avg>=70)
			hak='C';
		else if((int)avg>=60)
			hak='D';
		else
			hak='F';
		
		System.out.print("����:"+kor);
		System.out.println(",����:"+eng);
		System.out.print("����:"+hak);
		
		
		
		
		
				

	}

}
