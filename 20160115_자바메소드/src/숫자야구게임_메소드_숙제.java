import java.util.Scanner;
/*
 *   1) 난수 발생(3자리)
 *   =============================
 *   2) 사용자 입력
 *   3) 난수 / 입력값 비교
 *   4) 결과값 => 힌트로 제공
 *   5) 종료여부 확인 ==> 사용자 입력
 *   ============================= 루프
 *   1. 임의로 정한다 367 => 배열
 *      => 사용자 입력 678
 *      =>  다른 자리 2자리 => 0S-2B
 *      =>        376 => 1S-2B
 */
public class 숫자야구게임_메소드_숙제 {
	//난수발생
	static int[] nansu(int su)
	{
		int[] ranSu=new int[su];
		for(int i=0;i<ranSu.length;i++)
		{
			boolean bDash=false;
			ranSu[i]=(int)(Math.random()*9)+1;
			//중복체크
			for(int j=0;j<i;j++)			
			{
				if(ranSu[i]==ranSu[j])
				{
					bDash=true;
				}
			}
			
			if(bDash==true)
			{
				System.out.println("중복된 수를 입력하였습니다");
				i--;
				continue;
			}
		}
		return ranSu;
	}
	//유저 입력값
	static int input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("세자리 정수 입력:");
		return scan.nextInt();
	}
	//입력값 초과 확인
	static boolean userSu(int input)
	{
		boolean b=false;
		if(input<100 || input>999)
		{
			System.out.println("잘못된 입력입니다");
			b=true;
		}
		
		return b;
	}
	
	// input 배열방에 담기
	static int[] splitData(int input)
	{
		int[] user=new int[3];
		user[0]=input/100; //100의 자리수 가져오기
		user[1]=(input%100)/10; //10의 자리수 가져오기
		user[2]=input%10; //1의 자리수 가져오기
		return user;
	}
	
	//user 중복 수 확인
	static boolean checkDuplicate(int[] user) {
		boolean b=false;
		if(user[0]==user[1] || user[1]== user[2] || user[0]==user[2])
		{
			System.out.println("중복된 수는 사용할 수 없다");
			b=true;
		}
		return b;
	}
	
	//수 비교
	static int[] compare(int[] com,int[] user)
	{
		int comLength=com.length;
		int userLength=user.length;
		int[] check=new int[2];
		for(int i=0;i<comLength;i++)
		{
			for(int j=0;j<userLength;j++)
			{
				if(com[i]==user[j])
				{
					if(i==j)
						check[0]++;
					else
						check[1]++;
				}
				
			}
		}
		return check;
	}
	
	//게임 힌트 strike,ball
	static void printing(int input,int s,int b)
	{
		System.out.printf("Input Number:%d,Result:%dS-%dB\n",input,s,b);
	}
	
	//게임 종료 확인
	static boolean game(int s)
	{
		boolean b = false;
		if(s==3)
		{
			System.out.print("Game Over!");
			b=true;
		}
		return b;
	}
	
	static void process()
	{
		int[] com=nansu(3);
		int[] user=new int[3];
		while(true) 
		{
			int input = input();
			if(userSu(input)) 
			{
				continue;
			}
			user=splitData(input);
			// 중복 체크
			if(checkDuplicate(user)) 
			{
				continue;
			}
			int[] check=compare(com,user);
			printing(input, check[0],check[1]);
			if(game(check[0]))
			{
				break;
			}
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
