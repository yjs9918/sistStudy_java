// 0 ~ 9 ������ ����
public class �ߺ����³��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com=new int[10];
		// ������ �޴� ����
		int su=0;
		// �ߺ�����
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
			//����
			while(bDash)
			{
				su=(int)(Math.random()*10);
				bDash=false;
				for(int j=0;j<i;j++)
				{
					if(com[j]==su) //�ߺ��� ���� ������ while���� �ٽ� ������
					{
						bDash=true;
						break;
					}
				}
			}
			//�ߺ����� ��� ����
			com[i]=su;
		}
		//���
		for(int i=0;i<10;i++)
		{
			System.out.print(com[i]+" ");
		}
			
	}

}
