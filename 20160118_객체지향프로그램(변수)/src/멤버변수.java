/*
 *   ��ü���� ���α׷� (��ü : ���Ǽ����� �繰�� Ư��ȭ,�ܼ�ȭ ��Ű�� �۾�)
 *   = ���� ���θ��� �α����� �Ѵ�.
 *   = ���� ��ǰ�� �˻��Ѵ�
 *   = ���� ��ǰ�� �ֹ��Ѵ� 
 *   = ���� �ſ�ī��� �ֹ��� �����Ѵ�
 *   = ���� �ֹ��� ��ȸ�Ѵ�
 *   = ���� �ֹ��� ��ǰ�� �ݼ��Ѵ�
 *   
 *   ==> �繰 �߽� (�����)
 *       1) �� : �ſ�ī��(�Ӽ�)
 *       2) ���θ� : ��ǰ(�Ӽ�)
 *       3) ��ǰ
 *       4) �ſ�ī�� ====> Ŭ����
 *       ==================
 *       �繰�� Ư¡�� ���� ==> �߻�ȭ(�������� ���)
 *       ���� ==> ��üȭ
 *       ==================
 *       
 *   ��ü���� ����    �м�/����    ��ü���� ���α׷�
 *   ===========================
 *     ��ü                 ��ü                ��ü
 *   ===========================
 *     �Ӽ�          �Ӽ�(������Ƽ)  ������,�������
 *     ����                �޼ҵ�             ����޼ҵ�
 *   ===========================
 *   
 *   1) �����Ϳ� �޼ҵ带 �ϳ��� �׷�ȭ ��Ű�� ��ġ : ĸ��ȭ
 *         => Ŭ�������� ��踦 ����
 *      �����͸� ����ȭ => �޼ҵ带 ���ؼ� ������ ����
 *      *** ������ ��ȣ ����
 *   2) ������ �ִ� ����� �����ϴ� ���� : ���
 *       => ���� (���)
 *       => �ִ� �״�� (����)
 *   3) ����, �߰� : ������
 *   ==================== ��ü������ 3�� Ư��
 *   
 *   1) ��� ����
 *         = ���� ��� ���� (static)
 *         = ��ü���� ��� ���� (instance)
 */
class Card
{
	int number;
	char image;
	static int width;
	static int height;
	/*Card()
	{
		
	}*/ //�ڵ��ν� ��Ŵ
}
public class ������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c1=new Card();
		System.out.println("c1:"+c1);
		//Ŭ���� ����(���� �����ʹ� heap������ ����)
		//c1:number, image, width, height
		c1.number=1;
		c1.image='��';
		c1.width=100;
		c1.height=120;
		Card c2=new Card();
		System.out.println("c2:"+c2);
		c2.number=2;
		c2.image='��';
		c2.width=100;
		c2.height=120;
		//c2:number, image, width, height
		Card c3=new Card();
		System.out.println("c3:"+c3);
		c3.number=3;
		c3.image='��';
		c3.width=100;
		c3.height=120;
		//c3:number, image, width, height
		/*
		 *   new => �޸� ũ�⸦ Ȯ�� �� �޸� ��ġ
		 *          ������ �ּҰ��� �Ѱ��ش�
		 *   ������ => ��������� �ʱ�ȭ
		 *    => 1) �������� ����
		 *       2) class��� �����ϴ�
		 *       3) �ڵ��� ���� ��쿡 �ڵ����� �ν�
		 */
		
		System.out.println("c1.number:"+c1.number);
		System.out.println("c1.image:"+c1.image);
		System.out.println("c1.width:"+c1.width);
		System.out.println("c1.height:"+c1.height);
		
		System.out.println("c2.number:"+c2.number);
		System.out.println("c2.image:"+c2.image);
		System.out.println("c2.width:"+c2.width);
		System.out.println("c2.height:"+c2.height);
		
		System.out.println("c3.number:"+c3.number);
		System.out.println("c3.image:"+c3.image);
		System.out.println("c3.width:"+c3.width);
		System.out.println("c3.height:"+c3.height);
		
		System.out.println("ȭ�� ũ�⸦ ����...");
		c1.width=200;
		c1.height=220;
		System.out.println("c1.width:"+c1.width);
		System.out.println("c1.height:"+c1.height);
		System.out.println("c2.width:"+c2.width);
		System.out.println("c2.height:"+c2.height);
		System.out.println("c3.width:"+c3.width);
		System.out.println("c3.height:"+c3.height);
	}

}















