import java.util.Scanner;
//switch
/*
 *   ���ù�
 *   ����)
 *       ==> 4 => default
 *       ==> ���� ���ǹ����� ��ȯ
 *       **** break�� ���� ���� break�� �����ϴ�
 *            case ������� ������ ����
 *       ==> 2 => 2��,3�� �������
 *       switch(����/����/���ڿ�)
 *       {
 *         case ����/����/���ڿ�(1):
 *               ���๮��
 *               break; ==> ������ �����ϰ� ����
 *         case ����/����/���ڿ�(2):
 *               ���๮��
 *               
 *         case ����/����/���ڿ�(3):
 *               ���๮��
 *               break;
 *         default:  ==> ������ ����
 *               ���๮��
 *       }
 */
public class ���4_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=4;
		switch(i)
		{
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default:
			System.out.println("default");
		}

	}

}











