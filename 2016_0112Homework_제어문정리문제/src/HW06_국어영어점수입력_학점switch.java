
import java.util.Scanner;
public class HW06_����������Է�_����switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.print("����:");
		int kor=scan.nextInt();
		System.out.print("����:");
		int eng=scan.nextInt();
		
		int total=(kor+eng);
		double avg=(total/2.0);
		
		char hak='A';
		switch(total/20)
		{
		case 10:
		case 9:
			hak='A';
			break;
		case 8:
			hak='B';
			break;
		case 7:
			hak='C';
			break;
		case 6:
			hak='D';
			break;
		default:		
		}
		
		System.out.print("����:"+kor);
		System.out.println(",����:"+eng);
		System.out.println("����:"+hak);
		
		

	}

}
