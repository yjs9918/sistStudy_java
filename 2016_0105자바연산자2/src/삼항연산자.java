/*
 *   삼항연산자 : 피연산자 3개
 *     형식) 조건 ? 값1 : 값2
 *       조건 => true : 값1
 *             false : 값2
 *             
 *         int a=10;
 *         int b=10;
 *         char r= (a==b ? 'O' : 'X')
 *                  a==b ? 1 : 0
 *         int a=10;
 *            a%2==0 ? "짝수" : "홀수"
 *        ===> if ~ else
 */
public class 삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=10;
		char c= (a!=b? 'O':'X');
		System.out.println("c="+c);
		

	}

}
