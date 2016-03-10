//매개변수의 갯수는 무한정 but 3개 이상은 추가하지 말것. class로 묶어서 추가.
//결과값은 1개만 넘어올 수 있음 (따라서 데이터가 많을 때는 묶어서 넘김 - 배열, 클래스 등등...)
/*
 *   메소드: 한가지 기능을 수행한다
 *        입력값(사용자)을 받아서 처리 후 결과 값을 돌려주는 기능
 *        => 기능별로 분리, 반복 수행시
 *        => 메소드 사용 ==> 재사용 목적
 *   메소드 : 연산자 + 제어문
 *   데이터 : 변수(지역,전역) + 
 *   ==================== 클래스
 *   형식)
 *       결과값(데이터형) 메소드명(매개변수...)
 *       {
 *          처리
 *          결과값 전송
 *          return ==> void 일때는 생략 가능
 *          return 결과값  (위의 데이터형이 return결과값과 크거나 같아야 한다)
 *          ㄴ  10을 넘길경우 결과값(데이터형)은 int,double,float,long 가능 but 데이터형을 맞춰주는 것이 좋음.
 *       }
 *       double random() => 0.0 ~ 0.99
 *       int scan.nextInt()\
 *       void println()
 *       
 *       ==> 메소드명 제작
 *       1) 알파벳, 한글로 시작한다
 *          (알파벳은 대소문자 구분)
 *       2) 숫자 사용이 가능 (맨 앞에 사용 금지)
 *       3) 특수문자 사용 가능($,_)
 *       4) 예약어 사용 금지
 *          ==> 2개 이상 단어
 *          첫번째 : 소문자
 *          두번째 단어의 첫글자 : 대문자
 *          ex) nextInt (클래스는 대문자로 시작)
 *      ===================================
 *      메소드: 연산자 + 제어문
 *           (리턴형, 매개변수)
 *      ===================================
 *        리턴형            매개변수
 *      ===================================
 *         O        O
 *                  => 사용자가 2개의 정수 보내고
 *                     더한 값을 요청
 *                     int plus(int a,int b)
 *      ===================================
 *         O        X
 *                  => 임의의 수를 넘겨 달라
 *                     double random()
 *      ===================================
 *         X        O
 *                  => 단을 입력을 받아서
 *                     구구단을 출력
 *                     void gugudan(int dan)
 *      ===================================
 *         X        X
 *                  => 다음줄에 출력한다
 *                     void println()
 *      ===================================
 *      
 *      메소드 호출 방식
 *      class A
 *      {
 *          void abc1(){} => instance 메소드
 *          static void abc2(){} => class 메소드
 *      }
 *      *** static => 컴파일시 자동으로 저장
 *          static이 없는 경우에는
 *            new사용해서 클래스를 저장한 후 사용 (자동저장x => 메모리를 만든 후 저장해야 한다)
 *      ==> main() ==> abc2
 *      
 *      ==> Scanner scan=new Scanner()
 *          scan.nextInt() -> Instance 메소드
 *          
 *          Math.random() -> Static 메소드(class 메소드)
 *          
 *      1) 기능별로 메소드를 제작
 *      2) 순서대로 조립한다
 *      
 *      static void plus(int a, int b)
 *      ==> plus(10,20) a=10,b=20
 *      
 *      static void a()
 *      {
 *          while(true)
 *          {
 *          }
 *      }
 *      static void b()
 *      {
 *      }
 *      
 *      main()
 *      {
 *          a();
 *          b(); -> b는 호출되지 못한다( a에서 무한루프 -> 문장하나를 다 수행 한 후 넘어온다)
 *      }
 *      
 *      =========
 *         b()
 *      =========
 *         a()
 *      =========
 *        main()  ===> =====
 *                      b()
 *      =========      =====
 *                      a()  ==> ======
 *                                 b()
 *                     =====     ======
 *                     call stack
 */
public class 메소드 {
	static void a() //선언부
	{
		//구현부
		System.out.println("1.a() start");
		b(); //메소드 명만으로 불러온다(메소드 호출)
		System.out.println("2.a() end");
		// return; ==> void일때는 return을 생략할 수 있다
	}
	static void b() //선언부
	{
		//구현부
		System.out.println("3.b() start");
		c();
		System.out.println("4.b() end");
	}
	static void c() //선언부
	{
		//구현부
		System.out.println("5.c() start");
		d();
		System.out.println("6.c() end");
	}
	static void d() //선언부
	{
		//구현부
		System.out.println("7.d() start");
		System.out.println("8.d() end");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a();
	}

}

















