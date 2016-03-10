import java.util.Scanner;
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
public class ���ھ߱�����_�޼ҵ�_���� {
	//�����߻�
	static int[] nansu(int su)
	{
		int[] ranSu=new int[su];
		for(int i=0;i<ranSu.length;i++)
		{
			boolean bDash=false;
			ranSu[i]=(int)(Math.random()*9)+1;
			//�ߺ�üũ
			for(int j=0;j<i;j++)			
			{
				if(ranSu[i]==ranSu[j])
				{
					bDash=true;
				}
			}
			
			if(bDash==true)
			{
				System.out.println("�ߺ��� ���� �Է��Ͽ����ϴ�");
				i--;
				continue;
			}
		}
		return ranSu;
	}
	//���� �Է°�
	static int input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("���ڸ� ���� �Է�:");
		return scan.nextInt();
	}
	//�Է°� �ʰ� Ȯ��
	static boolean userSu(int input)
	{
		boolean b=false;
		if(input<100 || input>999)
		{
			System.out.println("�߸��� �Է��Դϴ�");
			b=true;
		}
		
		return b;
	}
	
	// input �迭�濡 ���
	static int[] splitData(int input)
	{
		int[] user=new int[3];
		user[0]=input/100; //100�� �ڸ��� ��������
		user[1]=(input%100)/10; //10�� �ڸ��� ��������
		user[2]=input%10; //1�� �ڸ��� ��������
		return user;
	}
	
	//user �ߺ� �� Ȯ��
	static boolean checkDuplicate(int[] user) {
		boolean b=false;
		if(user[0]==user[1] || user[1]== user[2] || user[0]==user[2])
		{
			System.out.println("�ߺ��� ���� ����� �� ����");
			b=true;
		}
		return b;
	}
	
	//�� ��
	static int[] compare(int[] com,int[] user)
	{
		int comLength=com.length;
		int userLength=user.length;
		int[] check=new int[2];
		for(int i=0;i<comLength;i++)
		{
			for(int j=0;j<userLength;j++)
			{
				if(com[i]==user[j])
				{
					if(i==j)
						check[0]++;
					else
						check[1]++;
				}
				
			}
		}
		return check;
	}
	
	//���� ��Ʈ strike,ball
	static void printing(int input,int s,int b)
	{
		System.out.printf("Input Number:%d,Result:%dS-%dB\n",input,s,b);
	}
	
	//���� ���� Ȯ��
	static boolean game(int s)
	{
		boolean b = false;
		if(s==3)
		{
			System.out.print("Game Over!");
			b=true;
		}
		return b;
	}
	
	static void process()
	{
		int[] com=nansu(3);
		int[] user=new int[3];
		while(true) 
		{
			int input = input();
			if(userSu(input)) 
			{
				continue;
			}
			user=splitData(input);
			// �ߺ� üũ
			if(checkDuplicate(user)) 
			{
				continue;
			}
			int[] check=compare(com,user);
			printing(input, check[0],check[1]);
			if(game(check[0]))
			{
				break;
			}
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
