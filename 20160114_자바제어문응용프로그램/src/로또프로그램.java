/*
 *   1) 난수 발생 ==> 메소드
 *   2) 입력 ==> 메소드
 *   3) 비교 ==> 메소드
 *   4) 결과값 ==> 메소드
 *   
 *   ==> sort : 반복 
 *   
 *   기능을 먼저 생각 -> 그 후 변수 설정
 */
import java.util.Scanner;
public class 로또프로그램 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//난수 발생
		int[] com=new int[7];
		int[] user=new int[6];
		int su=0; // 발생된 난수 저장
		//중복체크
		boolean bDash=false;
		//true: 중복, false: 중복이 없다
		/*
		 *   true => 난수를 다시 발생
		 *   false => com배열에 저장
		 */
		for(int i=0;i<7;i++)
		{
			bDash=true;
			while(bDash) // 중복이 없는 상태에서 종료
			{
				// 난수 발생
				su=(int)(Math.random()*45)+1;
				bDash=false;
				// 중복 체크
				for(int j=0;j<i;j++)
				{
					if(com[j]==su)
					{
						bDash=true;
						break; // while로 이동 (true를 가지고 이동함)
					}
				}
			}
			com[i]=su;
		}
		//출력
		/*
		 *   0 1 2 3 4 5 (6)
		 *   = =
		 *   =   =
		 *   =     =
		 *   =       =
		 *   =         =
		 *   0 1 2 3 4 5
		 *     = =
		 *     =   =
		 *     =     =
		 *     =       =
		 *   0 1 2 3 4 5
		 *       = =
		 *       =   =
		 *       =     =
		 *   0 1 2 3 4 5
		 *         = =
		 *         =   =
		 *   0 1 2 3 4 5
		 *           = =  
		 */
		for(int i=0;i<com.length-2;i++)
		{
			for(int j=i+1;j<com.length-1;j++)
			{
				if(com[i]>com[j])
				{
					int temp= com[i];
					com[i]=com[j];
					com[j]=temp;
				}
			}
		}
		// 출력
		for(int i=0;i<com.length;i++)
		{
			System.out.print(com[i]+" ");
		}
		//사용자 입력
		System.out.println();
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<user.length;i++)
		{
			System.out.print("1~45까지 정수 입력:");
			int value=scan.nextInt();
			if(value<1 || value>45)
			{
				System.out.println("잘못된 입력입니다.");
				i--;
				continue; // for(증가식으로 이동)-> 갯수 재정비 위한 i--; // while(조건식)
			}
			int a=0;
			for(int j=0;j<i;j++)
			{
				if(user[j]==value)
				{
					a=1;
					break;
				}
			}
			if(a==0)
			{
				user[i]=value;
			}
			else
			{
				System.out.print("중복된 수는 사용할 수 없습니다.");
				i--;
				continue;
			}
		}
		for(int i=0;i<user.length-1;i++)
		{
			for(int j=i+1;j<user.length;j++)
			{
				if(user[i]>user[j])
				{
					int temp= user[i];
					user[i]=user[j];
					user[j]=temp;
				}
			}
		}
		// 출력
		for(int i=0;i<user.length;i++)
		{
			System.out.print(user[i]+" ");
		}
		System.out.println();
		//결과값
		int count=0;
		for(int i=0;i<com.length-1;i++)
		{
			for(int j=0;j<user.length;j++)
			{
				if(com[i]==user[j])
				{
					count++;
				}
			}
		}
		int b=0;
		if(count==5)
		{
			for(int i=0;i<user.length;i++)
			{
				if(user[i]==com[6])
				{
					b=1;
					System.out.println("2등 당첨");
					break;
				}
			}
		}
		
		/*int[] result={5,4,3,1,0};
		System.out.println(result[count-3]+"등");*/ //switch~case는 배열로 바꿔서 출력하면 편하다
		
		switch(count)
		{
		case 3:
			System.out.println("5등당첨!!");
			break;
		case 4:
			System.out.println("4등당첨!!");
			break;
		case 5:
			if(b!=1)
			System.out.println("3등당첨!!");
			break;
		case 6:
			System.out.println("1등당첨!!");
			break;
		default:
			System.out.println("낙첨~~");
		}
	}

}
















