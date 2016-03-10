//UPDOWN게임 
import java.util.Scanner; //Scanner 자리 대신에  *을 쓰면 모든걸 다 가져온다.(여러개 쓸 때 이용)
//패키지 : 관련된 클래스의 집합
public class 제어문_반복문6_for_무한루프 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 난수 발생(1~100)
		int com=(int)(Math.random()*100)+1;
		//Math.random() 0.0 ~ 0.99  => 0~99 => +1 1~100
		Scanner scan=new Scanner(System.in);
		int count=0;
		for(;;)
		{
			System.out.print("1~100까지 정수 입력:");
			int user=scan.nextInt();
			// count++  비정상값부터 입력횟수를 count한다
			// 사용자가 입력한 정수를 받는다
			if(user<1 || user>100)
			{
				System.out.println("잘못된 입력입니다");
				continue;
				/*
				 *   for => 증가식으로 이동
				 *   while => 조건식으로 이동
				 */
			}
			// count++;  정상값부터 입력횟수를 count한다
			// 비교 후에 힌트를 준다
			count++;
			if(com>user)
			{
				System.out.println("입력값보다 큰 값을 입력하세요");
			}
			else if(com<user)
			{
				System.out.println("입력값보다 작은 값을 입력하세요");
			}
			else //같다
			{
				System.out.println("Game Over!!");
				System.out.println("입력횟수:"+count);
				break;
			}
		}

	}

}















