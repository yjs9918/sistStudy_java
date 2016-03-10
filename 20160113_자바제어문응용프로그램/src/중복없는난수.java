// 0 ~ 9 사이의 난수
public class 중복없는난수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com=new int[10];
		// 난수값 받는 변수
		int su=0;
		// 중복여부
		/*
		 *   com[0]=8
		 *   com[1]=7
		 *   
		 *   su=7
		 *    
		 */
		boolean bDash=true;
		for(int i=0;i<10;i++)
		{
			bDash=true;
			//난수
			while(bDash)
			{
				su=(int)(Math.random()*10);
				bDash=false;
				for(int j=0;j<i;j++)
				{
					if(com[j]==su) //중복된 수가 있으면 while문을 다시 돌려라
					{
						bDash=true;
						break;
					}
				}
			}
			//중복없는 경우 저장
			com[i]=su;
		}
		//출력
		for(int i=0;i<10;i++)
		{
			System.out.print(com[i]+" ");
		}
			
	}

}
