import java.util.Scanner;
import javax.swing.JOptionPane;

import jdk.nashorn.internal.scripts.JO;
public class 메소드_숫자야구게임 {
	// 난수 발생
	static void getRand(int[] com)
	{
		int su=0;
		boolean bDash=false;
		for(int i=0;i<com.length;i++)
		{
			bDash=true;
			while(bDash) //중복없는 난수를 발생
			{
				//난수 발생
				su=(int)(Math.random()*9)+1;
				//1~9사이의 난수 발생 (double Math.random())=> 0.0~0.99
				//중복여부확인 bDash:true=> while 다시 수행
				bDash=false;
				//false : while종료
				for(int j=0;j<i;j++)
				{
					if(com[j]==su)
					{
						bDash=true;
						break;
					}
				}
			}
			com[i]=su;
		}
	}
	//사용자 입력
	static void userInput(int[] user)
	{
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.print("세자리 정수 입력:");
			int input=scan.nextInt();
			if(input<100 ||input>999)
			{
				System.out.println("잘못된입력입니다.");
				continue;//while (조건식 이동)
			}
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			if(user[0]==user[1]||user[1]==user[2]||user[0]==user[2])
			{
				System.out.println("중복된 수는 사용 금지");
				continue;
			}
			break;
		}
	}
	static int compare(int[] com,int[] user)
	{
		int s=0;
		int b=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(com[i]==user[j])
				{
					if(i==j)
						s++;
					else
						b++;
				}
			}
		}
		hint(user,s,b);
		return s;
	}
	static void hint(int[] user,int s,int b)
	{
		System.out.printf("Input Number:%d-%d-%d,Result:%dS-%dB\n",
							user[0],user[1],user[2],s,b);
	}
	static boolean isEnd(int s)
	{
		boolean bCheck=false;
		if(s==3)
		{
			bCheck=true;
		}
		return bCheck;
	}
	//메소드를 모아서 한개 프로그램이 실행(메소드 조립)
	static void process()
	{
		// 난수 발생
		int[] com=new int[3];
		getRand(com);
		/*for(int i=0;i<com.length;i++)
		{
			System.out.print(com[i]+" ");
		}
		System.out.println();*/
		int[] user=new int[3];
		while(true)
		{
			userInput(user);
			int s=compare(com, user);
			if(isEnd(s))
			{
				int a= JOptionPane.showConfirmDialog(null, "게임을 종료할까요","선택",
											JOptionPane.YES_NO_CANCEL_OPTION);
				if(a==JOptionPane.YES_OPTION)
				{
					JOptionPane.showConfirmDialog(null, "새 게임이 시작되었습니다!!");
					process();
				}
				else
				{
					JOptionPane.showConfirmDialog(null, "Game Over!!");
					System.exit(0);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
