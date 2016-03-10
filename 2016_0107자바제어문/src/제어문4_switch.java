import java.util.Scanner;
//switch
/*
 *   선택문
 *   형식)
 *       ==> 4 => default
 *       ==> 다중 조건문으로 변환
 *       **** break가 없는 경우는 break가 존재하는
 *            case 문장까지 문장을 수행
 *       ==> 2 => 2번,3번 문장수행
 *       switch(문자/정수/문자열)
 *       {
 *         case 정수/문자/문자열(1):
 *               실행문장
 *               break; ==> 문장을 수행하고 종료
 *         case 정수/문자/문자열(2):
 *               실행문장
 *               
 *         case 정수/문자/문자열(3):
 *               실행문장
 *               break;
 *         default:  ==> 생략이 가능
 *               실행문장
 *       }
 */
public class 제어문4_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=4;
		switch(i)
		{
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default:
			System.out.println("default");
		}

	}

}











