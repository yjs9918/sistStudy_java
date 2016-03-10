
import java.util.Scanner;
public class HW06_국어영어점수입력_학점switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.print("국어:");
		int kor=scan.nextInt();
		System.out.print("영어:");
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
		
		System.out.print("국어:"+kor);
		System.out.println(",영어:"+eng);
		System.out.println("학점:"+hak);
		
		

	}

}
