/*
 *   ���ѷ��� => while(true)
 */
import java.util.Scanner;
public class ���3_while_���ѷ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int kor=0;
		while(true)
		{
			System.out.print("���� ����(0~100):");
			kor=scan.nextInt();
			if(kor<0 || kor>100)
			{
				System.out.println("�߸��� �Է��Դϴ�");
				continue;// while���� ���ǹ����� �̵�
			}
			break; // while���� ���� (�������)
		}
		
		int eng=0;
		while(true)
		{
			System.out.print("���� ����(0~100):");
			eng=scan.nextInt();
			if(eng<0 || eng>100)
			{
				System.out.println("�߸��� �Է��Դϴ�");
				continue;
			}
			break;
		}
			
			int math=0;
			while(true)
			{
				System.out.print("���� ����(0~100):");
				math=scan.nextInt();
				if(math<0 || math>100)
				{
					System.out.println("�߸��� �Է��Դϴ�");
					continue;
				}
				break;
			}
			System.out.println("��������:"+kor);
			System.out.println("��������:"+eng);
			System.out.println("��������:"+math);
			System.out.println("����:"+(kor+eng+math));
			System.out.printf("���:%.2f\n",(kor+eng+math)/3.0);
			
		}

	}


