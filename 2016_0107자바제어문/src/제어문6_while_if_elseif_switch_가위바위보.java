/*
 *   while ==> if
 *   10번 ==> 컴퓨터와 사용자가 가위 바위 보
 *      => 10전 4승 5패 1무
 */
import java.util.Scanner;
public class 제어문6_while_if_elseif_switch_가위바위보 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력
		Scanner scan=new Scanner(System.in);
		int win=0;
		int lose=0;
		int same=0;
		//루프
		int i=1;
		while(i<=10)
		{
			//컴퓨터 => 가위바위보
			int com=(int)(Math.random()*3);
			//사용자 => 가위바위보
			System.out.print("가위(0),바위(1),보(2):");
			int user=scan.nextInt();
			if(user<0 || user>2)
			{
				System.out.println("가위바위보를 입력하세요");
				continue;
			}
			// 출력
			if(com==0)
			{
				System.out.println("컴퓨터:가위");
			}
			else if(com==1)
			{
				System.out.println("컴퓨터:바위");
			}
			else
			{
				System.out.println("컴퓨터:보");
			}
			//사용자
			if(user==0)
			{
				System.out.println("사용자:가위");
			}
			else if(user==1)
			{
				System.out.println("사용자:바위");
			}
			else
			{
				System.out.println("사용자:보");
			}
			//결과
			switch(com-user)
			{
			case -1: //if(a==-1 || a==2)
			case 2:
				System.out.println("사용자가 이겼다");
				win++;
				break;
			case 1:
			case -2:
				System.out.println("컴퓨터가 이겼다");
				lose++;
				break;
			case 0:
				System.out.println("비겼다");
				same++;
			}
			i++;
		}
		// 10게임이 종료
		System.out.printf("전적:%d승 %d패 %d무\n", win,lose,same);
		

	}

}
