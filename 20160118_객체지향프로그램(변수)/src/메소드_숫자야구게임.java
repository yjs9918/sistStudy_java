import java.util.Scanner;
import javax.swing.JOptionPane;

import jdk.nashorn.internal.scripts.JO;
public class �޼ҵ�_���ھ߱����� {
	// ���� �߻�
	static void getRand(int[] com)
	{
		int su=0;
		boolean bDash=false;
		for(int i=0;i<com.length;i++)
		{
			bDash=true;
			while(bDash) //�ߺ����� ������ �߻�
			{
				//���� �߻�
				su=(int)(Math.random()*9)+1;
				//1~9������ ���� �߻� (double Math.random())=> 0.0~0.99
				//�ߺ�����Ȯ�� bDash:true=> while �ٽ� ����
				bDash=false;
				//false : while����
				for(int j=0;j<i;j++)
				{
					if(com[j]==su)
					{
						bDash=true;
						break;
					}
				}
			}
			com[i]=su;
		}
	}
	//����� �Է�
	static void userInput(int[] user)
	{
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.print("���ڸ� ���� �Է�:");
			int input=scan.nextInt();
			if(input<100 ||input>999)
			{
				System.out.println("�߸����Է��Դϴ�.");
				continue;//while (���ǽ� �̵�)
			}
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			if(user[0]==user[1]||user[1]==user[2]||user[0]==user[2])
			{
				System.out.println("�ߺ��� ���� ��� ����");
				continue;
			}
			break;
		}
	}
	static int compare(int[] com,int[] user)
	{
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
		hint(user,s,b);
		return s;
	}
	static void hint(int[] user,int s,int b)
	{
		System.out.printf("Input Number:%d-%d-%d,Result:%dS-%dB\n",
							user[0],user[1],user[2],s,b);
	}
	static boolean isEnd(int s)
	{
		boolean bCheck=false;
		if(s==3)
		{
			bCheck=true;
		}
		return bCheck;
	}
	//�޼ҵ带 ��Ƽ� �Ѱ� ���α׷��� ����(�޼ҵ� ����)
	static void process()
	{
		// ���� �߻�
		int[] com=new int[3];
		getRand(com);
		/*for(int i=0;i<com.length;i++)
		{
			System.out.print(com[i]+" ");
		}
		System.out.println();*/
		int[] user=new int[3];
		while(true)
		{
			userInput(user);
			int s=compare(com, user);
			if(isEnd(s))
			{
				int a= JOptionPane.showConfirmDialog(null, "������ �����ұ��","����",
											JOptionPane.YES_NO_CANCEL_OPTION);
				if(a==JOptionPane.YES_OPTION)
				{
					JOptionPane.showConfirmDialog(null, "�� ������ ���۵Ǿ����ϴ�!!");
					process();
				}
				else
				{
					JOptionPane.showConfirmDialog(null, "Game Over!!");
					System.exit(0);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
