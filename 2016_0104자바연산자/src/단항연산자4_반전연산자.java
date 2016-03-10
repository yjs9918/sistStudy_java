/*
 *   반전연산자 ( ~ )
 *     => 음수표현 (보수)
 *   10
 *     =>  00001010
 *      => 11110101 (1의 보수)
 *        +       1
 *        ==========
 *         11110110 ==> 10에 대한 음수 표현 (2의 보수)
 *        ========== => -11 
 */
public class 단항연산자4_반전연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=~a;
		System.out.println("a="+a);
		System.out.println("b="+b);
		

	}

}
