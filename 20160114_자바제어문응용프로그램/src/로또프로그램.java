/*
 *   1) ���� �߻� ==> �޼ҵ�
 *   2) �Է� ==> �޼ҵ�
 *   3) �� ==> �޼ҵ�
 *   4) ����� ==> �޼ҵ�
 *   
 *   ==> sort : �ݺ� 
 *   
 *   ����� ���� ���� -> �� �� ���� ����
 */
import java.util.Scanner;
public class �ζ����α׷� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� �߻�
		int[] com=new int[7];
		int[] user=new int[6];
		int su=0; // �߻��� ���� ����
		//�ߺ�üũ
		boolean bDash=false;
		//true: �ߺ�, false: �ߺ��� ����
		/*
		 *   true => ������ �ٽ� �߻�
		 *   false => com�迭�� ����
		 */
		for(int i=0;i<7;i++)
		{
			bDash=true;
			while(bDash) // �ߺ��� ���� ���¿��� ����
			{
				// ���� �߻�
				su=(int)(Math.random()*45)+1;
				bDash=false;
				// �ߺ� üũ
				for(int j=0;j<i;j++)
				{
					if(com[j]==su)
					{
						bDash=true;
						break; // while�� �̵� (true�� ������ �̵���)
					}
				}
			}
			com[i]=su;
		}
		//���
		/*
		 *   0 1 2 3 4 5 (6)
		 *   = =
		 *   =   =
		 *   =     =
		 *   =       =
		 *   =         =
		 *   0 1 2 3 4 5
		 *     = =
		 *     =   =
		 *     =     =
		 *     =       =
		 *   0 1 2 3 4 5
		 *       = =
		 *       =   =
		 *       =     =
		 *   0 1 2 3 4 5
		 *         = =
		 *         =   =
		 *   0 1 2 3 4 5
		 *           = =  
		 */
		for(int i=0;i<com.length-2;i++)
		{
			for(int j=i+1;j<com.length-1;j++)
			{
				if(com[i]>com[j])
				{
					int temp= com[i];
					com[i]=com[j];
					com[j]=temp;
				}
			}
		}
		// ���
		for(int i=0;i<com.length;i++)
		{
			System.out.print(com[i]+" ");
		}
		//����� �Է�
		System.out.println();
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<user.length;i++)
		{
			System.out.print("1~45���� ���� �Է�:");
			int value=scan.nextInt();
			if(value<1 || value>45)
			{
				System.out.println("�߸��� �Է��Դϴ�.");
				i--;
				continue; // for(���������� �̵�)-> ���� ������ ���� i--; // while(���ǽ�)
			}
			int a=0;
			for(int j=0;j<i;j++)
			{
				if(user[j]==value)
				{
					a=1;
					break;
				}
			}
			if(a==0)
			{
				user[i]=value;
			}
			else
			{
				System.out.print("�ߺ��� ���� ����� �� �����ϴ�.");
				i--;
				continue;
			}
		}
		for(int i=0;i<user.length-1;i++)
		{
			for(int j=i+1;j<user.length;j++)
			{
				if(user[i]>user[j])
				{
					int temp= user[i];
					user[i]=user[j];
					user[j]=temp;
				}
			}
		}
		// ���
		for(int i=0;i<user.length;i++)
		{
			System.out.print(user[i]+" ");
		}
		System.out.println();
		//�����
		int count=0;
		for(int i=0;i<com.length-1;i++)
		{
			for(int j=0;j<user.length;j++)
			{
				if(com[i]==user[j])
				{
					count++;
				}
			}
		}
		int b=0;
		if(count==5)
		{
			for(int i=0;i<user.length;i++)
			{
				if(user[i]==com[6])
				{
					b=1;
					System.out.println("2�� ��÷");
					break;
				}
			}
		}
		
		/*int[] result={5,4,3,1,0};
		System.out.println(result[count-3]+"��");*/ //switch~case�� �迭�� �ٲ㼭 ����ϸ� ���ϴ�
		
		switch(count)
		{
		case 3:
			System.out.println("5���÷!!");
			break;
		case 4:
			System.out.println("4���÷!!");
			break;
		case 5:
			if(b!=1)
			System.out.println("3���÷!!");
			break;
		case 6:
			System.out.println("1���÷!!");
			break;
		default:
			System.out.println("��÷~~");
		}
	}

}
















