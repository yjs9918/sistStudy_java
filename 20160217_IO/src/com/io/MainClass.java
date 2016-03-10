package com.io;
/*
 *   IO : (input,output)
 *   ====== �����
 *   = �޸� �����
 *   = ���� �����(�ٿ�ε�, ���ε�)   web: html,oracle
 *   = ��Ʈ��ũ �����
 *   
 *   �ڹٿ��� �����ϴ� Ŭ����
 *   8bit(1byte)                   16bit(2byte)
 *   ===========                   ============
 *   InputStream,OutputStream      Reader,Writer
 *    (interface)
 *   1) �޸� �����
 *      InputStream, OutputStream
 *      BufferedInputStream
 *      BufferedOutputStream
 *      
 *   2) ���� ���� �����
 *      FileInputStream
 *      FileOutputStream
 *      ================ 1byte
 *      FileReader
 *      FileWriter
 *      ================ 2byte
 *      
 *   3) ��Ʈ��ũ
 *      ���� : byte�� ����
 *      �о� �ö� : char�� �޴´�
 *   ====================================================
 *   ��ü������ ����
 *   ObjectInputStream
 *   ObjectOutputStream
 *   ==> ����ȭ (���� �޾ƿö��� �ٽ� ��ü������ �޾ƾ� �ϱ� ������ ������ȭ)
 *       class A
 *       {
 *       	String name;
 *       	String sex;
 *       	String addr;
 *       }
 *       
 *       A a= new A();
 *       
 *       =============
 *           name
 *       =============
 *           sex
 *       =============
 *           addr       ����ȭ
 *       =============  ===> ===================
 *                             name  sex  addr
 *                           ===================
 *                      <=== ������ȭ
 *                      
 *       ���� : csv,xml,json �� ���� �̿�
 *       
 *       �о���� ���
 *        1) �޸� �б�
 *        2) ���� �б�
 *        3) web �б�
 *        4) ��Ʈ��ũ �б�
 *        
 *        BufferedReader in= 
 *          new BufferedReader(new InputStreamReader(***))
 *                                 =================
 *                                   8bit => 16bit��ȯ
 *          (***) �ȿ� ���� ���
 *          �޸� �б� => System.in
 *          ���� �б� => new FileInputStream(file��)
 *          Web �б� => url.openConnection().getInputStream()
 *          Network => socket.getInputStream()
 *      
 */
import java.io.*;
import java.net.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ű���� �Է°� �ޱ�
		try
		{	//�޸𸮿��� �б�
			/*BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
			System.out.print("�ѱ��� �Է��ϼ���:");
			String msg=in.readLine(); //���� ��ü�� �о�� �� �� \n�� ������ �� �о����
			System.out.println("���� ��: "+msg);*/ 
			
			//���Ͽ��� �б�
			/*FileInputStream fis=new FileInputStream("C:\\javaDev\\javaStudy2\\20160217_IO\\src\\com\\io\\MainClass.java");
			BufferedReader in= new BufferedReader(new InputStreamReader(fis));
			while(true)
			{
				String msg=in.readLine();
				if(msg==null) //�� �̻� ���� ���� ������
				{
					break;
				}
				System.out.println(msg);
			}*/
			//���Ͽ��� �ѱ۱��� Ȯ��(FileInputStream)
			//FileReader fis=new FileReader �� ������ �ѱ� ����������
			/*int i=0;
			//-1 : EOF (End Of File => ������ ������ ������)
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
			}*/
			
			//web���� �б�
			URL url=new URL("http://wwww.daum.net");
			HttpURLConnection conn=(HttpURLConnection)url.openConnection(); //conn => ���������� ����
			//BufferedReader in= new BufferedReader(new InputStreamReader(conn.getInputStream()));//�ѱ� ����
			BufferedReader in= new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
			//getInputStream:������ ��� ���� , UTF-8: �����ڵ� (������ �����ö� ���=>�������� ������Ʈ�� �����ڵ带 �־�����Ѵ� )
			while(true)
			{
				String msg=in.readLine();
				if(msg==null) break;
				System.out.println(msg);
			}
			
			
		}catch(Exception ex){}
	}

}
