// 점수,학점
/*
 *   난수 ==> O O O O O X O X O X O X
 */
import java.util.Scanner;
public class 성적처리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] dap=new char[10];
		char[] user=new char[10];
		for(int i=0;i<dap.length;i++)
		{
			int rnd=(int)(Math.random()*2);
			if(rnd==0)
				dap[i]='O';
			else
				dap[i]='X';
		}
		//사용자 입력
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<user.length;i++)
		{
			System.out.print("O(0),X(1) 입력:");
			int input=scan.nextInt();
			if(input<0 || input>1)
			{
				System.out.println("0,1을 입력하세요");
				i--;
				continue; //증가식으로 이동
			}
			if(input==0)
				user[i]='O';
			else
				user[i]='X';
		}
		System.out.println("정답:");
		//출력
		for(int i=0;i<dap.length;i++)
		{
			System.out.print(dap[i]+" ");
		}
		System.out.println();
		System.out.println("사용자 입력값:");
		for(int i=0;i<user.length;i++)
		{
			System.out.print(user[i]+" ");
		}
		//비교
		int count=0;
		for(int i=0;i<user.length;i++)
		{
			if(dap[i]==user[i])
			{
				count++;
			}
		}
		System.out.println();
		System.out.println("점수:"+(count*10)+"점");

	}

}














