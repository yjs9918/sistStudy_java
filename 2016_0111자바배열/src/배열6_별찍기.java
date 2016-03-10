/*
 *   1) for
 *     => 이차원
 *     형식)        1    2   7
 *           for(초기값;조건식;증가식) : 줄수
 *           {
 *                   3    4   6
 *              for(초기값;조건식;증가식) : 데이터
 *              {
 *                 데이터 출력  5
 *              }
 *           }
 *           
 *           *
 *           **
 *           ***
 *           ****
 *            i   j  =>  j=i
 *           줄수     별표
 *            1   1
 *            2   2
 *            3   3
 *            4   4
 *            
 *            
 *            ****
 *            ***
 *            **
 *            *
 *             i  j   =>   i+j=5; ==> j=5-i
 *            줄수   별표
 *             1  4
 *             2  3
 *             3  2
 *             4  1  => 역순이면 더한다
 *             
 *         *
 *        **
 *       ***
 *      ****
 *       i   j   k
 *      줄수    공백     별표
 *       1   3   1
 *       2   2   2
 *       3   1   3
 *       4   0   4    => i와 j의 관계
 *                       i+j=4 => j=4-i
 *                       i와 k의 관계
 *                       k=i
 *                       
 *      ****
 *       ***
 *        **
 *         *
 *         i   j   k
 *        줄수    공백    별표
 *         1   0   4
 *         2   1   3
 *         3   2   2
 *         4   3   1  => i와 j의 관계
 *                       i= j+1 => j=i-1
 *                       i와 k의 관계
 *                       k= 5-i
 */
public class 배열6_별찍기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i-1;j++) //조건식에 j<=5-i 넣으면 역순으로 찍힘
			{
				System.out.print(" ");
			}
						for(int k=1;k<=5-i;k++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
