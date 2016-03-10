/*
 *   ����ó��
 *     = ���� ���� (try~catch) => �� ���� ���
 *     = ���� ȸ�� (throws)
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
//Check Exception
public class MainClass3 extends JFrame implements ActionListener{
	JButton b1,b2,b3; //�ڵ����� null���� ������ (���
	public MainClass3() {
		b1=new JButton("�޸���");
		b2=new JButton("�׸���");
		b3=new JButton("����");
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(b3);
		setSize(350,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass3();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			try {
				Runtime.getRuntime().exec("c:\\windows\\system32\\notepad.exe");
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}
		}
		if(e.getSource()==b2)
		{
			try {
				Runtime.getRuntime().exec("c:\\windows\\system32\\mspaint.exe");
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}
		}
		if(e.getSource()==b3)
		{
			try {
				Runtime.getRuntime().exec("c:\\windows\\system32\\calc.exe");
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}

}
