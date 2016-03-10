package com.sist;
/*
 *   예외처리 : 예방하는 프로그램
 *          프로그래머, 사용자의 실수가 있는 경우
 *          비정상종료 방지하고 정상 상태를 유지하는 프로그램
 *   = 직접 처리
 *     형식)
 *         정수를 문자열로 입력을 받아서
 *         배열에 저장 후
 *         두 정수를 나누기를 한다
 *         try
 *         {
 *           정상으로 실행 가능한 문장
 *           =>
 *           =>
 *         }catch(예외처리의 종류)
 *         {
 *           조치 (에러에 대한 조치)
 *         }
 *         catch(예외처리의 종류)
 *         {
 *           조치(에러에 대한 조치)
 *         }
 *         catch(예외처리의 종류)
 *         {
 *           조치(에러에 대한 조치)
 *         }
 *         finally //여러개의 예외처리 가능
 *         {
 *           정상수행이나 에러와 관련없이 무조건 수행
 *           => 네트워크, 쓰레드, 데이터베이스
 *           => 서버연결
 *         }
 *   = 간접 처리
 *   = 사용자 정의
 *   = 임의 발생
 *   
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int[] arr=new int[2];
			arr[0]=10;
			arr[2]=5; //실행시 에러
		}catch(Exception ex){}
	}

}
