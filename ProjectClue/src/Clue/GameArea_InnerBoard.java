package Clue;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class GameArea_InnerBoard extends JPanel implements KeyListener{
	static final int SIZE=27;
	static final int ARR_SIZE=13; //배열크기
	static int[][] arrBoard;
	Image board;
	
	Game game;
	GamePlayer gp;
	public GameArea_InnerBoard(Game game, GamePlayer gp){
		this.game = game;
		this.gp=gp;
		setFocusable(true);
		board = Toolkit.getDefaultToolkit().getImage("/image/woodboard.jpg");
		//보드 초기화
				//보드판 테두리=>1
				//입구 =>-1
				//말 =>1;
		arrBoard= new int[ARR_SIZE][ARR_SIZE];
		for(int i=0;i<ARR_SIZE;i++){
			for(int j=0;j<ARR_SIZE;j++){
				/*if(i==0 || i==ARR_SIZE-1 || j==0 || j==ARR_SIZE-1)
					arrBoard[i][j]=1;*/
				if(isReached(i,j))
					arrBoard[i][j]=-1;					
				}
			}
	}
	
	
	
	


	public void paint(Graphics g){
		super.paint(g);
		Graphics g2 = g;
		g2.drawImage(board, 0, 0, getWidth(), getHeight(), this);
		
		//기본 보드판
		for(int i=0;i<ARR_SIZE;i++){
			for(int j=0;j<ARR_SIZE;j++){
				
				if(arrBoard[i][j]==-1){
					g2.setColor(Color.pink);
					g2.fillRect(i*SIZE, j*SIZE, SIZE, SIZE);
					g2.setColor(Color.BLACK);
				}
				
			}
		}
		//여기까지
				
		
		g.fillRect(gp.getCrrX()*(GameView.SIZE), gp.getCrrY()*(GameView.SIZE), GameView.SIZE, GameView.SIZE);
		
		
	}
	
	
	
	public boolean isReached(int x, int y){
		boolean room=false;
		
		//방1~3
		if(y==0){
			if(x==1){
				room=true;
			}else if(x==8)
				room=true;
			else if(x==12)
				room=true;
		}else if(x==12){
			if(y==4)
				room=true;
			else if(y==10)
				room=true;
		}else if(y==12){
			if(x==9)
				room=true;
			else if(x==1)
				room=true;
			
		}else if(x==0){
			if(y==9)
				room=true;
			else if(y==3)
				room=true;
		}
		
		return room;
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		gp.keyPressed(e);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
