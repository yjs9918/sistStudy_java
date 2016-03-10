/*
 *  20160113 HW
 *  1) 1~45까지 중복없는 난수 발생 => 7개 발생
 *  2) 사용자가 6개 입력
 *  3) 비교 => 3(5등)
 *           4(4등)
 *           5(3등)
 *           6(2등) ==> 마지막 숫자가 포함
 *           6(1등)
 *  ================================*/

import java.util.Scanner;
public class HW_20160113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com=new int[7];
		int[] user=new int[6];
		boolean bDash=true;
		int jumsu=0;
		int lastjumsu=0;
		
		//난수발생
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*45)+1;
			bDash=true;
			while(bDash) //중복처리
			{
				com[i]=(int)(Math.random()*45)+1;
				bDash=false;
				for(int j=0;j<i;j++)
				{
					if(com[i]==com[j])
					{
						bDash=true;
						break;
					}
				}
			}
		}
		for(int k=0;k<com.length;k++)
		{
			System.out.print(com[k]+" ");
		}
		//정수값 받기
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<user.length;i++)
		{
			System.out.print("\n1~45사이의 정수를 입력하세요:");
			user[i]=scan.nextInt();
			//예외처리
			if(user[i]<1 || user[i]>45)
			{
				System.out.printf("%d번째 수를 다시 입력해 주세요.",i+1);
				i--;
				continue;
			}
			//중복처리
			bDash=true;
			while(bDash)
			{
				bDash=false;
				for(int j=0;j<i;j++)
				{
					if(user[i]==user[j])
					{
						System.out.println("중복된 값이 입력되었습니다.");
						System.out.printf("%d번째 수를 다시 입력해주세요.",i+1);
						user[i]=scan.nextInt();
						j--;
						break;
					}
				}
			}
		}
					
		for(int i=0;i<user.length;i++)
		{
			for(int j=0;j<user.length;j++)
			{
				if(user[j]==com[6])
				{
					lastjumsu=1;
				}
				if(user[j]==com[i])
				{				
					jumsu+=1;
				}

			}

		}
		
		System.out.print("컴퓨터의 수 : ");
		for(int i=0;i<com.length;i++)
		{
			System.out.print(com[i]+" ");
		}
		System.out.println();
		System.out.print("사용자의 수 : ");
		for(int i=0;i<user.length;i++)
		{
			System.out.print(user[i]+" ");
		}
		System.out.println();
		
		if(jumsu==1){
			System.out.printf("%d개를 맞추셔서 탈락입니다",jumsu);
		}
		else if(jumsu==2){
			System.out.printf("%d개를 맞추셔서 탈락입니다",jumsu);
		}
		else if(jumsu==3){
			System.out.printf("%d개를 맞추셔서 5등입니다",jumsu);
		}
		else if(jumsu==4){
			System.out.printf("%d개를 맞추셔서 4등입니다",jumsu);
		}
		else if(jumsu==5){
			System.out.printf("%d개를 맞추셔서 3등입니다",jumsu);
		}
		else if(jumsu+lastjumsu==6){
			System.out.printf("보너스 점수 포함 %d개를 맞추셔서 2등입니다",jumsu+lastjumsu);
		}
		else if(jumsu==6){
			System.out.printf("%d개를 맞추셔서 1등입니다",jumsu);
		}
		else
		{System.out.print("하나도 맞추지 못했습니다.");
		
	}
}
}
		
		