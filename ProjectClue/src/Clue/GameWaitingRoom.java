package Clue;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
public class GameWaitingRoom extends JPanel {
	Image back3;
	JPanel title,user1,user2,user3,user4,chr1,chr2,qcard;
	JTextArea chat;
	JTextField chatInput;
	
	JButton btnReady,btnExit,insert;//160211 정선 수정 (JComboBox삭제->JButton insert추가/하위box관련항목 수정)
	
    JTextField t1=new JTextField();
    JTextField t2=new JTextField();
    JTextField t3=new JTextField();
    JTextField t4=new JTextField();

	
	JTextField[] idtf={t1,t2,t3,t4};
	boolean[] sw=new boolean[4];
	
	public GameWaitingRoom(){
		back3=Toolkit.getDefaultToolkit().getImage("image/back/gwrback.jpg");
		//게임 유저
		title=new JPanel();
		title.setBackground(Color.darkGray);
		user1=new GWR_userPanel();
		
		user2=new GWR_userPanel();
		//user2.setBackground(Color.gray);
		user3=new GWR_userPanel();
		//user3.setBackground(Color.gray);
		user4=new GWR_userPanel();
		//user4.setBackground(Color.gray);
		
		
		
		//캐릭터 고르기
		chr1=new JPanel();
		chr1.setBackground(Color.black);
		
		chr2=new JPanel();
		chr2.setBackground(Color.lightGray);
		
		//채팅창
		chat=new JTextArea();
		chat.setEditable(false);
		JScrollPane js1=new JScrollPane(chat);
		chatInput=new JTextField();
		insert=new JButton("입력");
		
		
		//레디,나가기
		btnReady=new JButton("READY");
		btnExit=new JButton("EXIT");
		
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(2,1,5,5));
		p.add(btnReady);
		p.add(btnExit);
		p.setOpaque(false);
		
		setLayout(null);
		title.setBounds(5, 5, 1185, 35);
		/*user1.setBounds(5, 45, 450, 300);
		user2.setBounds(457, 45, 449, 300);
		user3.setBounds(5, 347, 450, 300);
		user4.setBounds(457, 347, 449, 300);*/
		
		user1.setBounds(5, 45, 225, 300);
		user2.setBounds(457, 45, 225, 300);
		user3.setBounds(5, 347, 225, 300);
		user4.setBounds(457, 347, 225, 300);
		
		
  		  
  		idtf[0].setBounds(235,45,225, 50);
  		idtf[1].setBounds(690,45,225, 50);
  		idtf[2].setBounds(235,347,225, 50);
  		idtf[3].setBounds(690,347,225, 50);
  		  
  		add(idtf[0]);
  		add(idtf[1]);
  		add(idtf[2]);
  		add(idtf[3]);
  		
  		
		
		
		js1.setBounds(5, 652, 902, 180);
		chatInput.setBounds(5, 837, 795, 30);
		insert.setBounds(805,837,102,30);
		chr1.setBounds(912, 75, 278, 572);
		chr2.setBounds(912, 45, 278, 30);
		p.setBounds(912, 652, 278, 215);
		
		
		add(title);
		add(user1);
		add(user2);
		add(user3);
		add(user4);
		add(js1);
		add(chatInput);
		add(insert);
		add(chr1);
		add(chr2);
		add(p);
		
		
	/*	캐릭터 이미지 바꿀때
	 * gwr.pan[i].removeAll();
		  gwr.pan[i].setLayout(new BorderLayout());
		  gwr.pan[i].add("Center",
				  new JLabel(new ImageIcon("c:\\image\\"+s+avata+".gif")));
		  gwr.pan[i].validate();//panel재배치
*/
		
	}
	@Override
	//paint, paintComponent => 자동호출
	protected void paintComponent(Graphics g) {
		g.drawImage(back3, 0, 0, getWidth(),getHeight(),this);
}
}
