/*
 *   객체지향 프로그램 (객체 : 현실세계의 사물을 특성화,단순화 시키는 작업)
 *   = 고객이 쇼핑몰에 로그인을 한다.
 *   = 고객이 상품을 검색한다
 *   = 고객이 상품을 주문한다 
 *   = 고객이 신용카드로 주문을 결재한다
 *   = 고객이 주문을 조회한다
 *   = 고객이 주문한 상품을 반송한다
 *   
 *   ==> 사물 중심 (명사형)
 *       1) 고객 : 신용카드(속성)
 *       2) 쇼핑몰 : 상품(속성)
 *       3) 상품
 *       4) 신용카드 ====> 클래스
 *       ==================
 *       사물의 특징을 설계 ==> 추상화(공통적인 요소)
 *       구현 ==> 구체화
 *       ==================
 *       
 *   객체지향 개념    분석/설계    객체지향 프로그램
 *   ===========================
 *     객체                 객체                객체
 *   ===========================
 *     속성          속성(프로퍼티)  데이터,멤버변수
 *     행위                메소드             멤버메소드
 *   ===========================
 *   
 *   1) 데이터와 메소드를 하나의 그룹화 시키는 장치 : 캡슐화
 *         => 클래스마다 경계를 구분
 *      데이터를 은닉화 => 메소드를 통해서 접근이 가능
 *      *** 데이터 보호 목적
 *   2) 기존에 있는 기능을 재사용하는 목적 : 상속
 *       => 변경 (상속)
 *       => 있는 그대로 (포함)
 *   3) 변경, 추가 : 다형성
 *   ==================== 객체지향의 3대 특성
 *   
 *   1) 멤버 변수
 *         = 공통 사용 변수 (static)
 *         = 객체마다 사용 변수 (instance)
 */
class Card
{
	int number;
	char image;
	static int width;
	static int height;
	/*Card()
	{
		
	}*/ //자동인식 시킴
}
public class 멤버변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c1=new Card();
		System.out.println("c1:"+c1);
		//클래스 저장(실제 데이터는 heap영역에 저장)
		//c1:number, image, width, height
		c1.number=1;
		c1.image='♠';
		c1.width=100;
		c1.height=120;
		Card c2=new Card();
		System.out.println("c2:"+c2);
		c2.number=2;
		c2.image='♥';
		c2.width=100;
		c2.height=120;
		//c2:number, image, width, height
		Card c3=new Card();
		System.out.println("c3:"+c3);
		c3.number=3;
		c3.image='♣';
		c3.width=100;
		c3.height=120;
		//c3:number, image, width, height
		/*
		 *   new => 메모리 크기를 확인 후 메모리 배치
		 *          변수에 주소값을 넘겨준다
		 *   생성자 => 멤버변수의 초기화
		 *    => 1) 리턴형이 없다
		 *       2) class명과 동일하다
		 *       3) 코딩이 없는 경우에 자동으로 인식
		 */
		
		System.out.println("c1.number:"+c1.number);
		System.out.println("c1.image:"+c1.image);
		System.out.println("c1.width:"+c1.width);
		System.out.println("c1.height:"+c1.height);
		
		System.out.println("c2.number:"+c2.number);
		System.out.println("c2.image:"+c2.image);
		System.out.println("c2.width:"+c2.width);
		System.out.println("c2.height:"+c2.height);
		
		System.out.println("c3.number:"+c3.number);
		System.out.println("c3.image:"+c3.image);
		System.out.println("c3.width:"+c3.width);
		System.out.println("c3.height:"+c3.height);
		
		System.out.println("화면 크기를 변경...");
		c1.width=200;
		c1.height=220;
		System.out.println("c1.width:"+c1.width);
		System.out.println("c1.height:"+c1.height);
		System.out.println("c2.width:"+c2.width);
		System.out.println("c2.height:"+c2.height);
		System.out.println("c3.width:"+c3.width);
		System.out.println("c3.height:"+c3.height);
	}

}















