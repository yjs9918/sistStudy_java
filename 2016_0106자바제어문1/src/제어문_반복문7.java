/*
 *   for(;;) : ���ѷ��� => while(true)
 *     ==> break
 *   for(�ʱⰪ;���ǽ�;������)
 *       ���๮�� => ���๮���� �������� => {}���
 *       
 *       for  ===> 2�� for
 *       while ==> 1��
 *       do~while => 1��(���� ���X)
 *       
 *       �����ϴ� ���
 *          => break : �ݺ��� �ߴ�
 *          => continue : Ư���κ��� ����
 */
// => break, continue => �ڽ��� �ݺ����� ����
/*
 *   for(int i=o;i<3;i++) //1�� for
 *   {
 *      for(int j=0;j<3;j++) //2�� for
 *      {
 *         if(j==1) contiue; //2�� for���� �ۿ�
 *      }
 *      break; //1�� for���� �ۿ�
 *   }
 *   
 *   ���� => �������� {}
 *   main()
 *   {
 *      int a=0;
 *      if(a==0)
 *      {
 *         int b=1;
 *         if(b==1)
 *         {
 *            int c=2;
 *         } //c
 *      } //b
 *   } //a   ==> ��������
 *   �������� => {}�� ������ �������
 *            ���������� �ݵ�� �ʱⰪ�� �ο�
 */
public class ���_�ݺ���7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			if(i%2==0) continue; // i++
			System.out.println("i="+i);
		}

	}

}
