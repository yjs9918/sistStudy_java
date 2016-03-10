/*
 *   예외처리
 *     : 비정상 종료를 방지하고 정상 실행 상태를 유지하는 프로그램 (목적)
 *     ======================================
 *     : 가벼운 에러(수정이 가능한 에러)
 *     1) 컴파일 예외 => 반드시 예외처리를 해야 한다
 *         = Check Exception (javac) => 컴파일
 *     2) 실행시 예외 => 생략이 가능
 *         = Non Check Exception (java) => 인터프리터(한줄씩 읽어서 번역해주는 것)
 *         
 *     자바 에러
 *     에러(Error) : 프로그래머가 처리를 할 수 없는 에러    
 *     예외(Exception) : 프로그래머가 처리가 가능한 에러(*)
 *     자바 제공하는 예외
 *       1) 순서도 (계층구조 : 예외처리에 순서가 있다)
 *              Object
 *                |
 *             Throwable
 *                |
 *          ===============
 *          |             |
 *        Error       Exception
 *                  Check    NonCheck
 *                  =====    ========
 *  Check Exception - SQLException (오라클관련)
 *                  InterruptedException (쓰레드)
 *                  IOException (파일 입출력)
 *                  ClassNotFoundException (리플렉션)
 *                   *** 리플렉션 : 클래스의 정보를 읽어서 제어
 *                       =====
 *                       new 연산자 없이 메모리 할당
 *                       메소드 이름 없이 메소드를 호출
 *                  NonCheck
 *                  ========
 *                  RuntimeException
 *                        |
 *                  NumberFormatException
 *                  ArrayIndexOutOfBoundsException
 *                  ArithmeticException
 *                  NullPointerException
 *                  ClassCastException
 *                  
 *       2) 예외처리 방법
 *           = 직접 처리 : try ~ catch ~ finally
 *             프로그래머가 직접 에러에 대한 대처하는 프로그램
 *           = 간접 처리 : throws
 *             시스템에 의해 처리
 *           = 임의 발생 : throw => 테스팅
 *           = 사용자 정의 : 지원하지 않는 예외 발생시에 프로그래머가 직접 제작
 *       3) 직접 처리 방법
 *          형식
 *             try
 *             {
 *                 정상 실행 문장
 *                    ***** 프로그램 실행 도중에 에러가 발생할 수 있다
 *             }catch(예외처리 종류)
 *             {
 *                 실행 도중에 에러 발생 => 처리
 *             }catch(예외처리 종류)
 *             {
 *                 실행 도중에 에러 발생 => 처리
 *             }finally
 *             {
 *                 예외나 정상 실행 관계없이 무조건 실행하는 문장
 *                 생략이 가능 (서버와 관련)
 *             }
 *             ***** try ~ catch은 전체에서 사용, 부분적으로 사용이 가능
 *             문장 1
 *             문장 2
 *             try
 *             {
 *             }catch(){}
 *             문장 3
 *             try
 *             {
 *             }catch(){}
 *             문장 4
 *             
 *             실행
 *             1 (O)
 *             2 (O)
 *             try
 *             {
 *               3  (O)
 *               4 ==> error (3) try절에 있는 문장은 실행을 못한다
 *               5
 *               6
 *             }catch(예외처리 종류1)
 *             {
 *               7
 *             }catch(예외처리 종류2)
 *             {
 *               8
 *             }catch(예외처리 종류3)
 *             {
 *               9  (O)
 *             }   
 *             finally
 *             {
 *               10 (O)
 *             }                              
 *               11 (O)
 *               12 (O)
 */
class A
{
	void display()
	{
		System.out.println("A:display() Call");
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1");
		System.out.println("2");
		try
		{
			//int [] arr=new int[2];
			//A a=null;
			//a.display();
			System.out.println("3");
			System.out.println(10/0);
			System.out.println("5");
		}	
		catch(ArithmeticException e)
		{
			System.out.println("6");
			System.out.println(e.getMessage());
			e.printStackTrace(); //에러메세지 띄우기 (에러잡기 편함)
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("7");
		}catch(NumberFormatException e)
		{
			System.out.println("8");
			System.out.println(e.getMessage());
		}
		catch(RuntimeException e) //상위클래스라 가장 마지막에 둬야한다
		{
			System.out.println("15");
		}
		finally
		{
			System.out.println("9");
		}
		System.out.println("10");
		System.out.println("11");
		
	}

}
