package com.sist;
import java.awt.*;
import javax.swing.*;
public class GameView extends JPanel{
     Image img0,img1,img21,img31,img22,img32;
     int backNo=0;
     int type=0;
     Graphics gg;
     Image[] front = new Image[4];
     int humanNo=0;
     int x=153,y=350;
     int move=0;
     
     public GameView()
     {
    	 img0=Toolkit.getDefaultToolkit().getImage("c:\\image\\img0.png");
    	 img1=Toolkit.getDefaultToolkit().getImage("c:\\image\\img1.png");
    	 
    	 img21=Toolkit.getDefaultToolkit().getImage("c:\\image\\img21.png");
    	 img31=Toolkit.getDefaultToolkit().getImage("c:\\image\\img31.png");
    	 img22=Toolkit.getDefaultToolkit().getImage("c:\\image\\img22.png");
    	 img32=Toolkit.getDefaultToolkit().getImage("c:\\image\\img32.png");
    	 for(int i=0;i<4;i++)
    	 {
    		 front[i]=Toolkit.getDefaultToolkit().getImage("c:\\image\\front0"+(i+1)+".png");
    	 }
         new BackThread().start();
         new HumanThread().start();
     }
     public void paint(Graphics g)
     {
    	 gg=g;
    	 g.drawImage(img0, 0, 0, this);
    	 g.drawImage(img1, 0, 90, this);
    	 if(type==0)
		 {
		   g.drawImage(img21, 0, 190, this);
    	   g.drawImage(img31, 0, 310, this);
		 }
		 else
		 {
		   g.drawImage(img22, 0, 190, this);
    	   g.drawImage(img32, 0, 310, this);
		 }
    	 g.drawImage(front[move], x, y, this);
     }
     class BackThread extends Thread
     {
    	 public void run()
    	 {
    		 while(true)
    		 {
    			 try
    			 {
    				 backNo=backNo%2;
    				 if(backNo==0)
    				 {
    				   type=0;
    				 }
    				 else
    				 {
    				   type=1;
    				 }
    					 
    				 backNo++;
    				 Thread.sleep(100);
    				 repaint();
    			 }catch(Exception ex){}
    		 }
    	 }
    	 
     }
     class HumanThread extends Thread
	 {
		 @Override
		public void run() 
		 {
			 while(true)
			 {
				 try 
				 {
					 humanNo=humanNo%2;
					 move=move%4;
					 if(humanNo==0)
					 {
						 x-=5;
					 }
					 else
					 {
						 x+=5;
					 }
					 Thread.sleep(100);
					 repaint();
					 humanNo++;
					 move++;
				 } catch (Exception ex) {}
			 }
		 }
	 }
}




