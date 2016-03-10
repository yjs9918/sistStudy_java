/*
 *   조건문
 *     형식)
 *         단일조건문:
 *            if(조건문)    조건문: true(문장수행), false(문장수행X)
 *               문장
 *            *****  자바에서 지원하는 모든 제어문은 
 *                   {}이 없는 경우에 바로 밑에 있는 문장만 제어한다
 *            여러개의 문장을 동시에 제어 할 때 {}을 사용한다
 *            if(조건문)
 *            {
 *               문장1;
 *               문장2..
 *            }
 */
public class 제어문_조건문_단일조건문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='z';
		//조건문 => 관계연산자, 부정연산자, 논리연산자
		if( c>='A' && c<='Z')
			System.out.println(c+"는(은) 대문자");
		if(c>='a' && c<='z')
			System.out.println(c+"는(은) 소문자");

	}

}
