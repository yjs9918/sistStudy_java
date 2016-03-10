/*
 *   반복문
 *     => for : 반복 횟수가 지정
 *        while : 반복 횟수가 지정이 없는 경우
 *        do~while : 반드시 한번 이상 수행할 때  
 *        
 *     => for
 *        형식)
 *                   1     2    4
 *              for(초기값;조건식;증가식)
 *                  반복 실행문장  3
 *                  
 *              초기값 => 조건 검색 => true : 반복문장 수행
 *                                => 증가식
 *                               false : 종료
 *              1 => 2 => 3 => 4
 *                   2 => 3 => 4
 *                   2 => 3 => 4
 *                   2번에서 false면 종료
 *                   
 *              for(int i=1;i<=10;i++)
 *                        출력
 */
public class 제어문_반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10까지 출력
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");
		
		// for
		System.out.println("for문 이용");
		for(int i=1;i<=10;i++)
			System.out.println(i);
		/*
		 *   for : {}이 없는 경우 => 바로 밑에 있는 문장 한개만 제어
		 *   
		 *   for()
		 *   {
		 *     문장 ==> for문 소속문장
		 *     문장 ==> for문 소속문장
		 *   }
		 *   for()
		 *     문장1 ==> for문 소속문장
		 *     문장2 ==> 별도의 문장
		 *     
		 *   => for(;;) => 무한루프 => break
		 */
		

	}

}










