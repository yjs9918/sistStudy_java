//substring: ���ڸ� ����
import java.io.*;
//java.lang(������)

public class ���ڿ�Ŭ����5_substring {

	public static void main(String[] args) 
	throws Exception
	{
		// TODO Auto-generated method stub
		File dir=new File("C:\\javaDev\\javaStudy\\2016_0112Homework_�����������\\src");
		File[] files=dir.listFiles();
		int count=0;
		for(int i=0;i<files.length;i++)
		{
			System.out.println(files[i].getName());
			String name=files[i].getName();
			String ext=name.substring(name.lastIndexOf('.'+1));
			if(ext.equals("java"))
				count++;
		}
		System.out.println("java����:"+count);
	}

}
