package com.sist;
/*
 *   �÷��� Ŭ����
 *     List    Set    Map ==> interface
 *     List => ArrayList, Vector, LinkedList, Queue, Stack
 *             =========  ======
 *         = ������ �����ϰ� �ִ� (�� �����͸��� index�� ������ �ִ�)
 *         = �ߺ� ����Ѵ�
 *         = �����ͺ��̽� ���α׷�
 *     Set => TreeSet, HashSet
 *         = ������ ����
 *         = �ߺ�������� �ʴ´�
 *         = XML���α׷�
 *     Map => Hashtable, HashMap
 *         = ������ �ִ�
 *         = �ߺ���� (Value), �ߺ����X(Key)
 *         = Key, Value�� ���ÿ� ����
 *         = Ŭ���� ����, �����ȣ..(Spring)
 *         = ������ (MapReduce)
 *         �� ==> 
 *         a.jsp ==> b.jsp : id,pwd => jsp ������ ��������� ����
 *         b b=new b(); (X)
 *         b.jsp?id=aaa&pwd=1234 (Map ��� : id&pwd - Key/ aaa&1234 - Value)
 *         
 *         �Ϲ� ���α׷� => �����͸� ������ �� �޼ҵ��� �Ű�����
 *         class A
 *         {
 *            public void disp(
 *            {
 *               B b=new B("hong");
 *               b.setName("shim");
 *            }
 *         }
 *         class B
 *         {
 *            String name;
 *            public B(String n)
 *            {
 *               name=n;
 *            }
 *            public void setName(String n)
 *            {
 *               name=n;
 *            }
 *         }
 *         
 *         ArrayList => Ŭ������ ������ ����(���������, ���̺귯�� ����)
 *           = add(��ü��) ���� => �ڿ� �ٴ´�
 *             add(index,��ü��) => ���ϴ� ��ġ�� �� ����
 *             INSERT INTO ~~
 *               insert()
 *           = remove(index) => ������ ����
 *             DELETE FROM ~~
 *               delete()
 *           = set(index, ��ü��) => ������ ����
 *             UPDATE ~ SET
 *               update()
 *           = get(index) => ������ �˻�
 *             SELECT ~ FROM
 *               find()
 *           = size() => ���� ����
 *             SELECT COUNT(*) FROM ~
 *               count()
 *               
 *           A a=new A();
 *           add(a)
 *           =======
 *              a  ====> 100����
 *           =======
 *           
 *           A b=new A();
 *           add(b)
 *           =======   =======
 *              a         b
 *           =======   =======
 *              0         1
 *              
 *           A c=new A();
 *           add(1,c)
 *           =======   =======   =======
 *              a         c         b
 *           =======   =======   =======
 *              0         1         2
 *              
 *           remove(1)
 *           =======   =======
 *              a         b
 *           =======   =======
 *              0         1      (index��ȣ�� ���������� �����ϰ��ִ�)
 *              
 *           ***** ������ �����ϴ� ����� ���������� ������ �ؾ� �Ѵ�
 *                              =========
 *                              ���׸�(�Ϲ�ȭ)
 *                              
 *           class A<T>   T: �ӽõ�������
 *           {
 *              T t
 *              public void setA(T t)
 *              {
 *                 this.t=t;
 *              }
 *              public T getA()
 *              {
 *                 return t;
 *              }
 *           }
 *           
 *           
 *           A<Integer> a=new A<integer>();
 *           
 *           ==> T ==> Integer�� ����
 *           
 *           ==> ���׸��� ������� �ʴ� ��� ==> Object
 *              
 */
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		//integer i=10; AutoBoxing
		list.add(10); //Integer   ==> 0
		list.add(15.5); // Double ==> 1  => 2
		list.add("ȫ�浿"); //String ==> 2  => 3
		list.add(1,'A'); // ==> 1
		System.out.println("���� ����:"+list.size());
		int a=(int)list.get(0); //UnBoxing
		double b=(Double)list.get(2);
		String c=(String)list.get(3);
		char d=(char)list.get(1);
		System.out.println("Index:0=>"+a);
		System.out.println("Index:1=>"+d);
		System.out.println("Index:2=>"+b);
		System.out.println("Index:3=>"+c);
		
		ArrayList<String> list2= new ArrayList<String>();
		//Object => String
		list2.add("ȫ�浿"); // 0
		list2.add("��û��"); // 1
		list2.add("�̼���"); // 2
		list2.add("������"); // 3
		list2.add("�ڹ���"); // 4
		
		for(int i=0;i<list2.size();i++)
		{
			String name=list2.get(i);
			System.out.println("Index:"+(i)+"=>"+name);
		}
		//for=each (�迭, �÷���)
		for(String name:list2)
		{
			System.out.println(name);
		}
		
		

	}

}
