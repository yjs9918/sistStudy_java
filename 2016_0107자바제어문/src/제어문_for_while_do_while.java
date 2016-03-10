/*
 *   반복문
 *     for
 *       형식)
 *                1    2   4=>2
 *           for(초기값;조건문;증가식)
 *               반복 실행문장  3
 *     while
 *       형식)
 *           초기값    ====> 1
 *           while(조건식) => 2 (true=>3, false=>종료
 *           {
 *             반복 실행문장 => 3
 *             증가식 => 4 ==> 2번으로 이동
 *           }
 *     do~while
 *       형식)
 *           초기 값=> 1
 *           do
 *           {
 *             반복 수행문장  => 2
 *             증가식 => 3
 *           }while(조건식);  => 4 ==>2번으로 이동
 *               true=>2번 이동, false=>종료
 */
public class 제어문_for_while_do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("for이용");
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("\nwhile이용");
		int i=1; //변수값을 다시 지정
		while(i<=10)
		{
			System.out.print((i+" "));
			i++;
		}
		System.out.println("\ndo~while이용");
		i=1; //변수값을 다시 지정
		do
		{
			System.out.print(i+" ");
			i++;
		}while(i<=10);
		

	}

}

















