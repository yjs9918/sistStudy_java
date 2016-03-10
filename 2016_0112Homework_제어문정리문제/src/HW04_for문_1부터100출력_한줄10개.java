/*
 *   이차 for
 *        1    2   4
 *   for(초기값;조건식;증가식)  ==> 줄수
 *   {
 *     ======================= 3
 *          1    2   4
 *          2=> true 문장수행
 *           => false => 1차 for의 4
 *     for(초기값;조건식;증가식) ==> 데이터 반복 수행
 *     {
 *       문장  3
 *     }
 *     ================================
 *   }
 */
public class HW04_for문_1부터100출력_한줄10개 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=0;i<=100;i++)
		{
			System.out.printf("%-4d%-4d%-4d%-4d%-4d%-4d%-4d%-4d%-4d%-4d\n",
								i,i,i,i,i,i,i,i,i,i);
		}*/
		
		/*
		 * 2차 for문
		 *      1    2    7
		 * for(초기값;조건식;증가식)
		 * {       3    4   6
		 *    for(초기값;조건식;증가식)
		 *    {     5
		 *        실행문장
		 *    }
		 * }
		 */ 
		/*for(int i=1;i<=100;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}*/
		
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.print(i+ " ");
			}
			System.out.println();
		}
		 
	}

}

