// �⵵, ��, �� �Է��� �޾Ƽ� ==> ������ ���
/*
 *   1�⵵ 1�� 1�� ~~ �Է��� ������ (�� ������ ���ϰ�)
 *     �� ����%7 ==> ������ ���ϱ� ���� (0 ~6)
 *     
 *   => ���⵵���� ���� 2016 ~~ 2015*365
 *   => ���ޱ��� ���� 2015*265+31+...
 *   => �Է��� ��       1
 *   =============== +
 *   => ����
 *      1) 4�⸶��
 *      2) 100�⸶�� ����
 *      3) 400�⸶�� ����
 */
import java.util.Scanner;
public class �迭5_�޷¸���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("�⵵ �Է�");
		int year=scan.nextInt();
		
		System.out.print("�� �Է�");
		int month=scan.nextInt();
		
		/*System.out.print("�� �Է�");
		int day=scan.nextInt();*/
		
		// �� ����
		// �� �⵵ ���� �� ������ ���Ѵ�
		int total=(year-1)*365
				 +(year-1)/4
				 -(year-1)/100
				 +(year-1)/400;
		//���ޱ��� ��
		int[] lastDay={31,28,31,30,31,30,
				31,31,30,31,30,31};
		if((year%4==0 && year%100!=0 || (year%400==0)))
			//�����̸�
		{
			lastDay[1]=29;
		}
		else
		{
			lastDay[1]=28;
		}
		for(int i=0;i<month-1;i++)
		{
			total+=lastDay[i];
		}
//		total+=day;
		total++; // �� ���� 1����
		char[] strWeek={'��','��','ȭ','��','��','��','��'};
		// ���� ���ϱ�
		int week=total%7; // ���� (1�⵵ 1�� 1�� =>��)
		//���
		/*System.out.printf("%d�⵵ %d�� %d���� %c�����Դϴ�",year,month,day,strWeek[week]);*/
		System.out.println(year+"�⵵ "+month+"��");
		for(int i=0;i<strWeek.length;i++)
		{
			System.out.print(strWeek[i]+"\t");
		}
		System.out.println();
		for(int i=1;i<=lastDay[month-1];i++)
		{
			if(i==1)
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");
				}
			}// ���� ������ ����(����)
			System.out.printf("%2d\t",i);
			week++; //���� Ȯ�� => �Ͽ����̸�
			if(week>6)
			{
				System.out.println(); // �����ٿ� ���
				week=0;
			}
		}

	}

}
