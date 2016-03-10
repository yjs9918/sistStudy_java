package com.sist;
/*
 *   ���� Ŭ����
 *   1) ���Ŭ���� : Ŭ������ Ŭ������ �����ؾ� �ϴ� ������
 *   class A
 *   {
 *   
 *      �� �� �� ==> instance ����
 *      class B
 *      {
 *         �� �� �� ����
 *      }
 *   }
 *   2) �͸��� Ŭ���� : ��Ӿ��� �������̵��� �����ϴ� (extends ���� ���ͼ� �͸��� Ŭ������ �Ѵ� == anonymous)
 *      => 1.8 ���ٽ��� ���� �͸��� Ŭ������ �̿��ϰ� �ִ�.
 *   Class A
 *   {
 *      B b=newB()
 *      {
 *         void display(){}
 *      }
 *   }
 *   class B
 *   {
 *      void display(){}
 *   }
 *   
 *   ���� Ŭ����
 *   public final class className
 *      ����� �� �� ����(String, Math, System)
 */
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
interface I
{
	void aaa();
	void bbb();
}
class A /*implements I*/ //interface�� �����ڸ� ������ �ֱ��ϴ�
{
	public void kkk() //�͸��� Ŭ���� anonymous class
	{
		I i=new I(){

			@Override
			public void aaa() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void bbb() {
				// TODO Auto-generated method stub
				
			}};
	}
}
public class MainClass_���̺� extends JFrame{
	JTable table; // table ��� ����
	DefaultTableModel model; // ������ ���� M-V ���� (Model-View)
	TableColumn column;
	public MainClass_���̺�() 
	{
		
		// ���̺� Ÿ��Ʋ
		String[] col={"�̸�","����","��ȭ"};
		// ������
		Object[][] row=new String[0][3]; //�����͸� ������ Object�� ���� (�̹���...)
		// ��Ƽ� ==> ���̺�� ����
		model=new DefaultTableModel(row, col)
		{

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Class getColumnClass(int columnIndex) {
				// TODO Auto-generated method stub
				return getValueAt(0, columnIndex).getClass(); //���ڸ� �׸����� �ٲܶ� ���
			}
			
		};
		table=new JTable(model);
		table.setRowHeight(30); //row�� ���̸� �÷���
		table.setShowVerticalLines(false); //���� ���μ� ����
		table.getTableHeader().setReorderingAllowed(false); // �̵� ���� ��Ŵ(����)
		table.getTableHeader().setResizingAllowed(false); // ũ�� ���� ���� ��Ŵ(����)
		JScrollPane js=new JScrollPane(table);
		add("Center",js);
		setSize(500,350);
		setVisible(true);
		Object[] data={"ȫ�浿",new ImageIcon("c:\\image\\man.gif"),new Boolean(true)};//boolean : üũ�ڽ�
		model.addRow(data); // ������ ����ֱ�
		Object[] data1={"��û��",new ImageIcon("c:\\image\\woman.gif"),new Boolean(false)};
		model.addRow(data1); // ������ ����ֱ�
		
		for(int i=0;i<col.length;i++)
		{
			column=table.getColumnModel().getColumn(i);
			DefaultTableCellRenderer rnd= new DefaultTableCellRenderer(); //���� ��� ����
			if(i==0)
			{
				rnd.setHorizontalAlignment(JLabel.CENTER); // ���� ��� ���� but �̹����� �ҷ����� ����..
				column.setPreferredWidth(300);
			}
			else if(i==1)
				column.setPreferredWidth(100);
			else if(i==2)
				column.setPreferredWidth(80); //���̺� ��� �� ������ ����
			column.setCellRenderer(rnd);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MainClass m=new MainClass();
		new MainClass_���̺�();
		
	}

}
