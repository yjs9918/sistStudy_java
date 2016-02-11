package Clue;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
public class WaitRoom extends JPanel {
	Image back;
	JTable table1,table2;
	DefaultTableModel model1,model2;

	JTextPane ta;
	JTextField tf;
	JComboBox box;
	JPanel movie;
	JButton b1,b2,b3,b4,b5,b6;
	
	public WaitRoom() {
		back=Toolkit.getDefaultToolkit().getImage("image/gwrback.jpg");
		String[] col1={"���̸�","����/�����","�ο�"};
		String[][] row1=new String[0][3];
		model1=new DefaultTableModel(row1, col1);
		table1=new JTable(model1);
		JScrollPane js1=new JScrollPane(table1);
		
		
		String[] col2={"ID","��ȭ��","����","��ġ"};
		String[][] row2=new String[0][4];
		model2=new DefaultTableModel(row2, col2);
		table2=new JTable(model2);
		JScrollPane js2=new JScrollPane(table2);
		
		//ä��
		ta=new JTextPane();
		ta.setEditable(false);
		JScrollPane js3=new JScrollPane(ta);
		tf=new JTextField();
		box=new JComboBox();
		box.addItem("white");
		box.addItem("blue");
		box.addItem("pink");
		box.addItem("green");
		box.addItem("cyan");
		
		movie=new JPanel();
		movie.setBackground(Color.black);
		
		b1=new JButton("�游���");
		b2=new JButton("�����");
		b3=new JButton("���ӽ�û");
		b4=new JButton("����������");
		b5=new JButton("��������");
		b6=new JButton("������");
		
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(3, 2, 5, 5));
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.setOpaque(false);
		
		setLayout(null);
		js1.setBounds(30, 30, 700, 450);
		js2.setBounds(30, 490,700, 350);
		js3.setBounds(740, 30, 420, 300);
		tf.setBounds(740, 335, 310, 40);
		box.setBounds(1055, 335, 105, 40);
		movie.setBounds(740, 385, 420, 250);
		p.setBounds(740, 645, 420, 195);

		add(js1);
		add(js2);
		add(js3);
		add(tf);
		add(box);
		add(movie);
		add(p);
	}
	@Override
	//paint, paintComponent => �ڵ�ȣ��
	protected void paintComponent(Graphics g) {
		g.drawImage(back, 0, 0, getWidth(),getHeight(),this);

	}
}
