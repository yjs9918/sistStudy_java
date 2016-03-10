
import java.util.Scanner;
public class HW08_단입력_for문_구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan=new Scanner(System.in);
		System.out.print("단 입력:");
		int num=scan.nextInt();
		
		for(int i=1;i<=9;i++)
		System.out.printf("%d*%d=%d\n",num,i,num*i);*/
		
		int a=(int)(Math.random()*8)+2;
		for(int i=1;i<=9;i++)
		{
			System.out.printf("%d*%d=%d\n",a,i,a*i); //printf - 가변데이터형
		}
		
	}

}
