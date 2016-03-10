/*
 *    생성자
 *     => 멤버변수의 초기화
 *        ==========
 *        1) 직접 처리
 *           class A
 *           {
 *             int a=10;
 *             클래스 영역: 선언(구현을 할 수 없다)
 *           }
 *        =======================
 *        2) 생성자 이용
 *        3) 초기화 블럭
 *        ======================= 구현 후에 값 대입
 *        
 *        add(int a,int b, int c)
 *        add(char c, int b, double d)
 *        add(char c, float f, double d)
 *        ***add(double d1, double d2, double d3)
 *        
 *        add('a',10.5,10)
 *            char double int (4번째껄로 받음) 1. 같은걸 찾는다 -> 2. 전체를 받을 수 있는 데이터를 찾는다.(데이터 큰것)
 *            
 *        add(double)
 *        
 *        add(10) add('a')
 *        
 *        int a='A'; a=65
 *        double d=10;
 *        
 *        2. 초기화 : 입력을 받아서 처리
 *           => 생성자는 매개변수를 가지고 있다
 *           => 생성자는 여러개를 만들어서 사용할 수 있다
 *              ===============
 *                 오버로딩 : 중복함수 정의
 *                 =====
 *                 특징 : 1) 같은 클래스
 *                      2) 같은 이름의 메소드
 *                      3) 매개변수가 다르다
 *                      4) 리턴형이 다르다
 *                 생성자 :
 *                   특징 : 리턴형이 없다.
 *                        클래스 명과 동일 
 *            
 */
public class Student {
	int hakbun=1;
	int kor=90;
	int eng=50;
	int math=70;
	Student() // defualt 생성자(매개변수 없는 생성자)
	{ 
		hakbun=2;
		kor=70;
		eng=80;
		math=80;
	}
	Student(int h, int k, int e, int m) //오버로딩
	{
		hakbun=h;
		kor=k;
		eng=e;
		math=m;
	}
	Student(int h) //오버로딩
	{
		hakbun=3;
	}
	Student(int k, int e, int m) //오버로딩
	{
		kor=k;
		eng=e;
		math=m;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		// 자동 생성(JVM) (생성자가 아예 없을때만 defualt 생성자 사용할 수 있다)
		// s=> hakbun, kor, eng, math
		System.out.println("s:"+s);
		System.out.println("학번:"+s.hakbun);
		System.out.println("국어:"+s.kor);
		System.out.println("영어:"+s.eng);
		System.out.println("수학:"+s.math);
		
		System.out.println();
		System.out.println("s:"+s);
		s=new Student(3);
		System.out.println("학번:"+s.hakbun);
		System.out.println("국어:"+s.kor);
		System.out.println("영어:"+s.eng);
		System.out.println("수학:"+s.math);
		
		System.out.println();
		System.out.println("s:"+s);
		s=new Student(70,60,90);
		System.out.println("학번:"+s.hakbun);
		System.out.println("국어:"+s.kor);
		System.out.println("영어:"+s.eng);
		System.out.println("수학:"+s.math);
		
		System.out.println();
		s=new Student(5,88,99,77);
		Student s1=s; //대입해서 쓸 수 있다(주소값)
		System.out.println("s:"+s);
		System.out.println("학번:"+s1.hakbun);
		System.out.println("국어:"+s1.kor);
		System.out.println("영어:"+s1.eng);
		System.out.println("수학:"+s1.math);
	}

}
