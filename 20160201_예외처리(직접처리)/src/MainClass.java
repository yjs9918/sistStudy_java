/*
 *   ����ó��
 *     : ������ ���Ḧ �����ϰ� ���� ���� ���¸� �����ϴ� ���α׷� (����)
 *     ======================================
 *     : ������ ����(������ ������ ����)
 *     1) ������ ���� => �ݵ�� ����ó���� �ؾ� �Ѵ�
 *         = Check Exception (javac) => ������
 *     2) ����� ���� => ������ ����
 *         = Non Check Exception (java) => ����������(���پ� �о �������ִ� ��)
 *         
 *     �ڹ� ����
 *     ����(Error) : ���α׷��Ӱ� ó���� �� �� ���� ����    
 *     ����(Exception) : ���α׷��Ӱ� ó���� ������ ����(*)
 *     �ڹ� �����ϴ� ����
 *       1) ������ (�������� : ����ó���� ������ �ִ�)
 *              Object
 *                |
 *             Throwable
 *                |
 *          ===============
 *          |             |
 *        Error       Exception
 *                  Check    NonCheck
 *                  =====    ========
 *  Check Exception - SQLException (����Ŭ����)
 *                  InterruptedException (������)
 *                  IOException (���� �����)
 *                  ClassNotFoundException (���÷���)
 *                   *** ���÷��� : Ŭ������ ������ �о ����
 *                       =====
 *                       new ������ ���� �޸� �Ҵ�
 *                       �޼ҵ� �̸� ���� �޼ҵ带 ȣ��
 *                  NonCheck
 *                  ========
 *                  RuntimeException
 *                        |
 *                  NumberFormatException
 *                  ArrayIndexOutOfBoundsException
 *                  ArithmeticException
 *                  NullPointerException
 *                  ClassCastException
 *                  
 *       2) ����ó�� ���
 *           = ���� ó�� : try ~ catch ~ finally
 *             ���α׷��Ӱ� ���� ������ ���� ��ó�ϴ� ���α׷�
 *           = ���� ó�� : throws
 *             �ý��ۿ� ���� ó��
 *           = ���� �߻� : throw => �׽���
 *           = ����� ���� : �������� �ʴ� ���� �߻��ÿ� ���α׷��Ӱ� ���� ����
 *       3) ���� ó�� ���
 *          ����
 *             try
 *             {
 *                 ���� ���� ����
 *                    ***** ���α׷� ���� ���߿� ������ �߻��� �� �ִ�
 *             }catch(����ó�� ����)
 *             {
 *                 ���� ���߿� ���� �߻� => ó��
 *             }catch(����ó�� ����)
 *             {
 *                 ���� ���߿� ���� �߻� => ó��
 *             }finally
 *             {
 *                 ���ܳ� ���� ���� ������� ������ �����ϴ� ����
 *                 ������ ���� (������ ����)
 *             }
 *             ***** try ~ catch�� ��ü���� ���, �κ������� ����� ����
 *             ���� 1
 *             ���� 2
 *             try
 *             {
 *             }catch(){}
 *             ���� 3
 *             try
 *             {
 *             }catch(){}
 *             ���� 4
 *             
 *             ����
 *             1 (O)
 *             2 (O)
 *             try
 *             {
 *               3  (O)
 *               4 ==> error (3) try���� �ִ� ������ ������ ���Ѵ�
 *               5
 *               6
 *             }catch(����ó�� ����1)
 *             {
 *               7
 *             }catch(����ó�� ����2)
 *             {
 *               8
 *             }catch(����ó�� ����3)
 *             {
 *               9  (O)
 *             }   
 *             finally
 *             {
 *               10 (O)
 *             }                              
 *               11 (O)
 *               12 (O)
 */
class A
{
	void display()
	{
		System.out.println("A:display() Call");
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1");
		System.out.println("2");
		try
		{
			//int [] arr=new int[2];
			//A a=null;
			//a.display();
			System.out.println("3");
			System.out.println(10/0);
			System.out.println("5");
		}	
		catch(ArithmeticException e)
		{
			System.out.println("6");
			System.out.println(e.getMessage());
			e.printStackTrace(); //�����޼��� ���� (������� ����)
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("7");
		}catch(NumberFormatException e)
		{
			System.out.println("8");
			System.out.println(e.getMessage());
		}
		catch(RuntimeException e) //����Ŭ������ ���� �������� �־��Ѵ�
		{
			System.out.println("15");
		}
		finally
		{
			System.out.println("9");
		}
		System.out.println("10");
		System.out.println("11");
		
	}

}
