/*
 *   1) ���� �߻�(3�ڸ�)
 *   =============================
 *   2) ����� �Է�
 *   3) ���� / �Է°� ��
 *   4) ����� => ��Ʈ�� ����
 *   5) ���Ῡ�� Ȯ�� ==> ����� �Է�
 *   ============================= ����
 *   1. ���Ƿ� ���Ѵ� 367 => �迭
 *      => ����� �Է� 678
 *      =>  �ٸ� �ڸ� 2�ڸ� => 0S-2B
 *      =>        376 => 1S-2B
 */
import java.util.Scanner;
public class ���ھ߱����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com={5,9,3};
		int[] user=new int[3];
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
				for(int i=0;i<3;i++)
				{
					bDash=true;
					//����
					while(bDash)
					{
						su=(int)(Math.random()*9)+1;
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
		// �Է� �䱸
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.print("���ڸ� ���� �Է�:");
			int input=scan.nextInt();
			if(input<100 || input>999)
			{
				System.out.println("�߸��� �Է��Դϴ�");
				continue; // while�� ���ǽ����� �̵�
			}
			//���������� �Է� �Ϸ� 678/100 => 6
			user[0]=input/100; //100�� �ڸ��� ��������
			user[1]=(input%100)/10; //10�� �ڸ��� ��������
			user[2]=input%10; //1�� �ڸ��� ��������
			if(user[0]==user[1] || user[1]== user[2] || user[0]==user[2])
			{
				System.out.println("�ߺ��� ���� ����� �� ����");
				continue;
			}
			//�� i=com j=user
			int s=0;
			int b=0;
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(com[i]==user[j])
					{
						if(i==j)
							s++;
						else
							b++;
					}
				}
			}
			//��Ʈ
			System.out.printf("Input Number:%d,Result:%dS-%dB\n",input,s,b);
			if(s==3)
			{
				System.out.println("Game Over!!");
				break;
			}
		}

	}

}


















