/*
 *   정수 입력받아서 => 2진법
 *   10
 *   0000 0000 0000 1010
 * 
 */
import java.util.Scanner;
public class 배열4_2진법출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] binary=new int[16];
		int index=15;
		Scanner scan=new Scanner(System.in);
		System.out.print("1~32767사이의 정수 입력:");
		int input=scan.nextInt();
		// System.out.println(Integer.toBinaryString(input)); 실제 2진법 출력 방법
		//이진법 변경
		while(true)
		{
			binary[index]=input%2;
			input=input/2; //나눈 값이 0,1
			if(input==0) break;
			index--;
		}
		//저장된 이진법을 출력
		for(int i=0;i<binary.length;i++)
		{
			if(i%4==0 && i!=0)
				System.out.print(" ");
			
			System.out.print(binary[i]);
		}

	}

}
