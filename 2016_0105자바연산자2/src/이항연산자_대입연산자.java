/*
 *   ���Կ�����: ������ ����� ���� (�켱���� => ������ ����)
 *     ***** =
 *     ***** +=
 *     int a=10;
 *     a += 1 ========> a= a+1
 *     ***** -=
 *     int a=10;
 *     a -= 1 ========> a= a-1
 *     *=
 *     int a=10;
 *     a *= 5 ========> a= a*5
 *     /=
 *     int a=10;
 *     a /= 2 ========> a= a/2
 *     %=
 *     int a=10;
 *     a %= 2 ========> a= a%2
 *     
 *     <<=
 *     int a=10;
 *     a <<= 3 =======> a= a<<3
 *     >>=
 *     int a=10;
 *     a >>= 3 =======> a= a>>3
 *     
 *     &=
 *     int a=10;
 *     a &= 5 ========> a= a&5
 *     |=
 *     ^=
 *     
 *     ===> ���� 1�� ����
 *     a++
 *     ++a
 *     a=a+1
 *     a+=1
 */
public class ���׿�����_���Կ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		a++; // a=10
		++a; // a=12
		a=a+1; // a=13
		a+=1; // a=14
		System.out.println("a="+a);
		int b=10;
		b-=5; //b=b-5
		System.out.println("b="+b);
		int c=10;
		c*=3; // c= c*3
		System.out.println("c="+c);
	}

}
