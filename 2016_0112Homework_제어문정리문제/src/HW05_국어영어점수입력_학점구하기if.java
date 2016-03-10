
import java.util.Scanner;
public class HW05_국어영어점수입력_학점구하기if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.print("국어:");
		int kor=scan.nextInt();
		System.out.print("영어:");
		int eng=scan.nextInt();
		
		//총점
		int total=(kor+eng);
		//평균
		double avg=(total/2.0);
		//학점
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
		
		System.out.print("국어:"+kor);
		System.out.println(",영어:"+eng);
		System.out.print("학점:"+hak);
		
		
		
		
		
				

	}

}
