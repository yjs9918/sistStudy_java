/*
 *   for(;;) : 무한루프 => while(true)
 *     ==> break
 *   for(초기값;조건식;증가식)
 *       실행문장 => 실행문장이 여러개면 => {}사용
 *       
 *       for  ===> 2차 for
 *       while ==> 1차
 *       do~while => 1차(거의 사용X)
 *       
 *       제어하는 방법
 *          => break : 반복을 중단
 *          => continue : 특정부분을 제외
 */
// => break, continue => 자신의 반복문만 제어
/*
 *   for(int i=o;i<3;i++) //1번 for
 *   {
 *      for(int j=0;j<3;j++) //2번 for
 *      {
 *         if(j==1) contiue; //2번 for에서 작용
 *      }
 *      break; //1번 for에서 작용
 *   }
 *   
 *   변수 => 사용범위가 {}
 *   main()
 *   {
 *      int a=0;
 *      if(a==0)
 *      {
 *         int b=1;
 *         if(b==1)
 *         {
 *            int c=2;
 *         } //c
 *      } //b
 *   } //a   ==> 지연변수
 *   지역변수 => {}이 끝나면 사라진다
 *            지역변수는 반드시 초기값을 부여
 */
public class 제어문_반복문7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			if(i%2==0) continue; // i++
			System.out.println("i="+i);
		}

	}

}
