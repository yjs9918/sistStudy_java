/*
 *   if
 *    ����)
 *        if(���ǹ�)
 *           ���� ==> ���ǹ��� true�� ��쿡 �����ϴ� ����
 *        ������ ���� ���� => {} �̿�
 *        
 *        if(���ǹ�)
 *          ���� => ���ǹ��� true
 *        else
 *          ���� => ���ǹ��� false
 *          
 *   ����������
 *     1) ��ǻ�Ͱ� ������������ ���� (����)
 *     2) ����ڰ� �Է�
 *     3) ��
 *         com       user
 *          0(����)   
 *                    0(����)
 *                    1(����)
 *                    2(��)
 *          1(����)
 *                    0(����)
 *                    1(����)
 *                    2(��)
 *          2(��)
 *                    0(����)
 *                    1(����)
 *                    2(��)
 *     4) ��� ���
 *           
 */
import java.util.Scanner; // �Է�(�����)
public class ���_���ǹ�1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com = (int)(Math.random()*3);
		// 0.0 ~ 0.99 ==> 0.0 ~ 2.9... => 0~2
		// ����� �Է�
		Scanner scan=new Scanner(System.in);
		/*
		 *   System.in : Ű���� �Է°��� ����
		 *   System.out : ����� �����͸� ȭ�� ���
		 *   =============================
		 *   �ڹ� ǥ�� �����
		 */
		System.out.print("����(0),����(1),��(2) �Է�:");
		int user=scan.nextInt();
		// ��
/*		if (com==0)
			System.out.println("��ǻ��:����");
		if (com==1)
			System.out.println("��ǻ��:����");
		if (com==2)
			System.out.println("��ǻ��:��");
		
		if (user==0)
			System.out.println("�����:����");
		if (user==1)
			System.out.println("�����:����");
		if (user==2)
			System.out.println("�����:��");
		
		//�� => ��ø ���ǹ�
		if (com==0)//����
		{
			if(user==0)//����
				System.out.println("���:����");
			if(user==1)//����
				System.out.println("���:����ڰ� �̰��");
			if(user==2)//��
				System.out.println("���:��ǻ�Ͱ� �̰��");
		}
		if (com==1)//����
		{
			if(user==0)//����
				System.out.println("���:��ǻ�Ͱ� �̰��");
			if(user==1)//����
				System.out.println("���:����");
			if(user==2)//��
				System.out.println("���:����ڰ� �̰��");
		}
		if (com==2)//��
		{
			if(user==0)//����
				System.out.println("���:����ڰ� �̰��");
			if(user==1)//����
				System.out.println("���:��ǻ�Ͱ� �̰��");
			if(user==2)//��
				System.out.println("���:����");
		}*/
		/*
		 *   0(com)  user  ==> com-user
		 *     0  => S   0
		 *     1  => P  -1
		 *     2  => C  -2
		 *   1
		 *     0  => C   1
		 *     1  => S   0
		 *     2  => P  -1
		 *   2
		 *     0  => P   2
		 *     1  => C   1
		 *     2  => S   0
		 *     
		 *     => s => 0
		 *        p => -1,2
		 *        c => 1,-2
		 */
		int res=com-user;
		if(res==1 || res==-2)
		{
			System.out.println("��ǻ�Ͱ� �̰��");
		}
		if(res==-1 || res==2)
		{
			System.out.println("����ڰ� �̰��");
		}
		if(res==0)
		{
			System.out.println("����");
		}
		
	}

}















