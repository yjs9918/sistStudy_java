package com.sist;
/*
 *   Ŭ������ ����
 *     package => �ѹ��� ���
 *     import => ������ ��� ����
 *     class className{
 *       =============
 *         ������� : instance, static
 *       =============
 *         ������ : ������ ����
 *       =============
 *         �޼ҵ� : instance , static
 *       =============
 *     }
 *     
 *     1) ���� ====> �迭(���� ũ��), Ŭ����(�ٸ� ũ��)
 *     2) ��ɹ� ===> �޼ҵ�
 *            int a=10;
 *     3) ���� + �޼ҵ� ===> Ŭ����
 *     4) Ŭ���� + Ŭ���� ==> ��Ű��
 *     ===================================
 *     ��Ű�� ������ ==> lib(jar)
 *     
 *     => ��������
 *        �⺻ �������� => ����� ���� (Ŭ����)
 *        Ŭ������ �뵵
 *          1) �����͸� ��Ƽ� ó�� : ~DTO, ~VO(�����ͺ�)
 *          2) ��� ó�� : ~DAO, ~Manager (�׼Ǻ�)
 *          3) ȥ�� 
 */

import java.util.*;
import java.sql.*;
import java.text.*;
class EmpDTO //�������(component : ��ü) ���ȭ(�������)
{
	int empno;
	String ename;
	String job;
	int mgr;
	java.util.Date hiredate=new java.util.Date(); 
	//���� Ŭ���� �浹�ɶ� �̷������� ���θ����� �������.
	int sal;
	int comm;
	int deptno;
}
public class ĸ��ȭ {

	public static void main(String[] args) 
	throws Exception
	{   //�����̳�
		// TODO Auto-generated method stub
		EmpDTO ed=new EmpDTO(); /* ed -> component -> ������Ʈ�� ���̸� �����̳�*/
		ed.empno=1;
		ed.ename="ȫ�浿";
		System.out.println("���:"+ed.empno);
		System.out.println("�̸�:"+ed.ename);
		System.out.println("�Ի���:"+ed.hiredate);
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy��MM��dd��"); //mm : �� ���� ����
		System.out.println(sdf.format(ed.hiredate));
		
	}

}
