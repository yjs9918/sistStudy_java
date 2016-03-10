/*
 *   반복문
 *     for    : 반복횟수가 지정
 *     while  : 반복횟수가 지정이 없는 경우
 *     do~while : 조건을 나중에 검색한다
 *     			     반드시 한 문장은 실행을 한다
 *     
 *     => 형식)
 *              1    2    4
 *         for(초기값;조건식;증가식)
 *             문장  3
 *             
 *             1->2->true->3->4->2...
 *                 ->false : 종료
 *                 
 *         초기값 ========> 1
 *         while(조건식)==> 2 (true=>문장, false=>종료)
 *         {
 *           문장  3
 *           증가식  4 ==> 2
 *         }
 *         
 *         초기값
 *         do ===>1
 *         {
 *           문장 =>2
 *           증가식 =>3
 *         }while(조건식); =>4 (true=>2, false=>종료)
 *         
 *         => 다중 (한개의 문장), 단일(여러개를 동시에 수행)
 *         ==========
 *         if(조건문)
 *           문장
 *         ========== 단독
 *         if(조건문)
 *           문장
 *         ========== 단독
 *         if(조건문)
 *           문장
 *         ========== 단독
 *         
 *         ==========
 *         if(조건문)
 *           문장
 *           
 *         else if(조건문)
 *           문장
 *           
 *         else if(조건문)
 *           문장
 *         ==========
 */
public class HW03_for문_1부터100_짝수합홀수합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even=0; //짝수
		int odd=0; //홀수
		for(int i=1;i<=100;i++)
		{
			if(i%2!=0)
				odd+=i;
			else
				even+=i;
		}
		
		System.out.println("홀수의 합은 : "+odd);
		System.out.println("짝수의 합은 : "+even);
		
		

	}

}
