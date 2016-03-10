package com.sist;
/*
 *   Vector : List
 *   
 *   ArrayList : �񵿱�ȭ, �����ͺ��̽�(Vector�� ������ Ŭ����)
 *   Vector : ����ȭ, ��Ʈ��ũ
 *     = size()
 *     = add(Object), addElement(Object)
 *     = remove(index), removeElementAt(index)
 *       removeAllElements(), clear()
 *     = set(index,Object)
 *     = get(index), elementAt(index)
 *     = �ڷᱸ�� => �����͸� �����ؼ� ���� => ����
 *                ===============
 *                  ���׸�
 *       Vector<String> vec=new Vector<String>();
 *          => ���� ������ 10�� ����� ���� (default 10��)
 *          new Vector<String>(5); <- ��������� 5�� ����� ����
 *     = java.util�� ����
 */
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vec=new Vector<String>(5);
		System.out.println("String ���� ���� : "+vec.size());
		System.out.println("������� ũ�� : "+vec.capacity());
		// ����
		vec.addElement("ȫ�浿1"); // 0
		vec.addElement("ȫ�浿2"); // 1
		vec.addElement("ȫ�浿3"); // 2
		//ȫ�浿7 �߰� => 3
		vec.addElement("ȫ�浿4"); // 3 => 4
		vec.addElement("ȫ�浿5"); // 4 => 5
		vec.addElement("ȫ�浿6"); // 5 => 6
		// ������ �ִ�, �����ʹ� �ߺ��� ���
		vec.add(3,"ȫ�浿7");
		System.out.println("���� ���� Ȯ�� : "+vec.size());
		System.out.println("Capacity : "+vec.capacity());
		for(int i=0;i<vec.size();i++)
		{
			String name=vec.elementAt(i);// ==vec.get(i)
			System.out.println(name); 
		}
		System.out.println("����");
		vec.removeElementAt(2);
		for(int i=0;i<vec.size();i++)
		{
			String name=vec.elementAt(i);// ==vec.get(i)
			System.out.println(name); 
		}
		System.out.println("����");
		vec.setElementAt("ȫ�浿8", 3);
		for(int i=0;i<vec.size();i++)
		{
			String name=vec.elementAt(i);// ==vec.get(i)
			System.out.println(name); 
		}
		//��ü ����
		vec.removeAllElements();
		//vec.clear();
		for(int i=0;i<vec.size();i++)
		{
			String name=vec.elementAt(i);// ==vec.get(i)
			System.out.println(name); 
		}
		System.out.println("���� ���� Ȯ�� : "+vec.size());
		System.out.println("Capacity : "+vec.capacity());
		
	}

}
