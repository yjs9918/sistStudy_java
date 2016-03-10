//substring: 문자를 분해
import java.io.*;
//java.lang(생략됨)

public class 문자열클래스5_substring {

	public static void main(String[] args) 
	throws Exception
	{
		// TODO Auto-generated method stub
		File dir=new File("C:\\javaDev\\javaStudy\\2016_0112Homework_제어문정리문제\\src");
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
		System.out.println("java갯수:"+count);
	}

}
