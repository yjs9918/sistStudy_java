package com.sist;
/*
 *   내부 클래스
 *   1) 멤버클래스 : 클래스와 클래스가 공유해야 하는 데이터
 *   class A
 *   {
 *   
 *      ○ ★ ♣ ==> instance 공유
 *      class B
 *      {
 *         ○ ★ ♣ 공유
 *      }
 *   }
 *   2) 익명의 클래스 : 상속없이 오버라이딩이 가능하다 (extends 없이 들어와서 익명의 클래스라 한다 == anonymous)
 *      => 1.8 람다식은 전부 익명의 클래스를 이용하고 있다.
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
 *   종단 클래스
 *   public final class className
 *      상속을 할 수 없다(String, Math, System)
 */
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
interface I
{
	void aaa();
	void bbb();
}
class A /*implements I*/ //interface도 생성자를 가지고 있긴하다
{
	public void kkk() //익명의 클래스 anonymous class
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
public class MainClass_테이블 extends JFrame{
	JTable table; // table 모양 제어
	DefaultTableModel model; // 데이터 제어 M-V 패턴 (Model-View)
	TableColumn column;
	public MainClass_테이블() 
	{
		
		// 테이블 타이틀
		String[] col={"이름","성별","전화"};
		// 데이터
		Object[][] row=new String[0][3]; //데이터를 받을때 Object로 받음 (이미지...)
		// 모아서 ==> 테이블로 전송
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
				return getValueAt(0, columnIndex).getClass(); //문자를 그림으로 바꿀때 사용
			}
			
		};
		table=new JTable(model);
		table.setRowHeight(30); //row의 길이를 늘려라
		table.setShowVerticalLines(false); //세로 라인선 제거
		table.getTableHeader().setReorderingAllowed(false); // 이동 금지 시킴(고정)
		table.getTableHeader().setResizingAllowed(false); // 크기 변동 금지 시킴(고정)
		JScrollPane js=new JScrollPane(table);
		add("Center",js);
		setSize(500,350);
		setVisible(true);
		Object[] data={"홍길동",new ImageIcon("c:\\image\\man.gif"),new Boolean(true)};//boolean : 체크박스
		model.addRow(data); // 데이터 집어넣기
		Object[] data1={"심청이",new ImageIcon("c:\\image\\woman.gif"),new Boolean(false)};
		model.addRow(data1); // 데이터 집어넣기
		
		for(int i=0;i<col.length;i++)
		{
			column=table.getColumnModel().getColumn(i);
			DefaultTableCellRenderer rnd= new DefaultTableCellRenderer(); //문자 가운데 정렬
			if(i==0)
			{
				rnd.setHorizontalAlignment(JLabel.CENTER); // 문자 가운데 정렬 but 이미지를 불러오지 못함..
				column.setPreferredWidth(300);
			}
			else if(i==1)
				column.setPreferredWidth(100);
			else if(i==2)
				column.setPreferredWidth(80); //테이블 헤드 바 사이즈 조정
			column.setCellRenderer(rnd);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MainClass m=new MainClass();
		new MainClass_테이블();
		
	}

}
