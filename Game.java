
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JPanel{
	static final int SIZE=30;
	static final int X_ORG=7,Y_ORG=7; //배열 좌표
	int x=X_ORG,y=Y_ORG;
	int inputX=0,inputY=0;
	//int[][] arr=new int[13][13];
	
	Game game;
	public Game(){
		addKeyListener( new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				switch(e.getKeyCode()){
				case KeyEvent.VK_UP:
					inputY=-1;
					break;
				case KeyEvent.VK_DOWN:
					inputY=1;
					break;
				case KeyEvent.VK_LEFT:
					inputX=-1;
					break;
				case KeyEvent.VK_RIGHT:
					inputX=1;
					break;
				}
				
			}
		});
		setFocusable(true);
		
	}
	
	public void paint(Graphics g){
		super.paint(g);
		Graphics g2 = g;
		for(int i=1;i<=13;i++){
			for(int j=1;j<=13;j++){
				g2.drawRect(i*SIZE, j*SIZE, SIZE, SIZE);
			}
		}
		g2.fillRect(x*SIZE, y*SIZE, SIZE, SIZE);
		
	}
	
	public void move(){
		if(x+inputX>0 && x+inputX<=13){
			x=x+inputX;
		}
		if(y+inputY>0 && y+inputY<=13){
			y=y+inputY;
		}
		inputX=0;
		inputY=0;
		
	}

	public static void main(String args[]) throws InterruptedException{
		JFrame frame = new JFrame("움직이기 연습");
		Game game = new Game();
		frame.add(game);
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		while(true){
			game.move();
			game.repaint();
			Thread.sleep(10);
		}
		
	}
}
