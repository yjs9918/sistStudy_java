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
import java.util.Scanner;
public class 숫자야구게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com={5,9,3};
		int[] user=new int[3];
		// 난수값 받는 변수
				int su=0;
				// 중복여부
				/*
				 *   com[0]=8
				 *   com[1]=7
				 *   
				 *   su=7
				 *    
				 */
				boolean bDash=true;
				for(int i=0;i<3;i++)
				{
					bDash=true;
					//난수
					while(bDash)
					{
						su=(int)(Math.random()*9)+1;
						bDash=false;
						for(int j=0;j<i;j++)
						{
							if(com[j]==su) //중복된 수가 있으면 while문을 다시 돌려라
							{
								bDash=true;
								break;
							}
						}
					}
					//중복없는 경우 저장
					com[i]=su;
				}
		// 입력 요구
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.print("세자리 정수 입력:");
			int input=scan.nextInt();
			if(input<100 || input>999)
			{
				System.out.println("잘못된 입력입니다");
				continue; // while의 조건식으로 이동
			}
			//정상적으로 입력 완료 678/100 => 6
			user[0]=input/100; //100의 자리수 가져오기
			user[1]=(input%100)/10; //10의 자리수 가져오기
			user[2]=input%10; //1의 자리수 가져오기
			if(user[0]==user[1] || user[1]== user[2] || user[0]==user[2])
			{
				System.out.println("중복된 수는 사용할 수 없다");
				continue;
			}
			//비교 i=com j=user
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
			//힌트
			System.out.printf("Input Number:%d,Result:%dS-%dB\n",input,s,b);
			if(s==3)
			{
				System.out.println("Game Over!!");
				break;
			}
		}

	}

}


















