package clue;
import javax.swing.*;  
public class Loading extends JFrame{  
	JProgressBar jb;  
	int i=0,num=0;  
	  
	Loading(){  
		jb=new JProgressBar(0,500);  
	      
		jb.setValue(0);  
		jb.setStringPainted(true);  
	      
		add(jb);  
		setSize(1200,900);  
		
		setLayout(null);  
		jb.setBounds(80,800,1000,30);  
	}  
	  
	public void iterate(){  
	while(i<=500){  
	  jb.setValue(i);  
	  i=i+20;  
	  try{Thread.sleep(150);}catch(Exception e){}  
	}  
	}  
	public static void main(String[] args) {  
	    Loading m=new Loading();  
	    m.setVisible(true);  
	    m.iterate();  
	}  
}  
