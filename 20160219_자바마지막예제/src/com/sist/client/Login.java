package com.sist.client;
import javax.swing.*;
import java.awt.*;
public class Login extends JPanel{
    Image back;
    JLabel la1,la2;
    JTextField tf;
    JPasswordField pf;
    JButton b1,b2;
    // 저장 (초기화)
    /*
     *   JPanel => 로딩 
     *            1) 생성자 호출 
     *            2) update() => clearRect()
     *               paint() => paintComponent()
     *            ==> 화면 변경 
     */
    public Login() 
    {
		back=Toolkit.getDefaultToolkit().getImage("c:\\image\\back.jpg");
	    la1=new JLabel("ID");
	    la2=new JLabel("PW");
	    
	    tf=new JTextField();
	    pf=new JPasswordField();
	    b1=new JButton("로그인");
	    b2=new JButton("취소");
	    
	    // 배치
	    setLayout(null);
	    la1.setBounds(10, 15, 40, 30);
	    tf.setBounds(55, 15, 150, 30);
	    la2.setBounds(10, 50, 40, 30);
	    pf.setBounds(55, 50, 150, 30);
	    JPanel p=new JPanel();// FlowLayout
	    p.add(b1);
	    p.add(b2);
	    p.setBounds(10, 85,195 , 35);
	    p.setOpaque(false);
	    // 추가
	    add(la1); add(tf);
	    add(la2); add(pf);
	    add(p);
	    
    }
	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(back, 0, 0, getWidth(),getHeight(),this);
	}
   
}




