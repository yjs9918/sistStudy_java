package Clue;

import java.util.Random;
import javax.swing.*;
import javax.swing.JFrame;


public class Game{
	
	//GamePlayer gp=new GamePlayer(this);
	GameArea gv;
	int[] answerCard =new int[3];
	int[][] pCard= new int[4][5];
	static int dice1=1,dice2=1;
	PlayerDTO pMain;
	PlayerDTO[] p;
	static int crrPlayer; 
	JFrame frTurn;
	private Random random;
	
	private int myNum, myAva;
	private int crrX=6,crrY=6;
	private int inputX=0,inputY=0;
	private int count=0;
	
	public Game(){
		//answerCard=selectAnswerCard();	//정답카드
		//distributeCard(answerCard, pCard); //플레이어카드
		/*p=new PlayerDTO[4];
		p[0]= new PlayerDTO("신민아",pCard[0]);
		p[1]= new PlayerDTO("오달수",pCard[1]);
		p[2]= new PlayerDTO("길태미",pCard[2]);
		p[3]= new PlayerDTO("고현정",pCard[3]);
		
		crrPlayer=0;*/
	}
	
	
	public Game(GameArea gv, JFrame fr){
		p=new PlayerDTO[4];
		
		this.gv=gv;
		frTurn=fr;
		pMain=p[0];
		crrPlayer=0;
		
		/*this.gv=gv;
		frTurn=fr;
		answerCard=selectAnswerCard();	//정답카드
		distributeCard(answerCard, pCard); //플레이어카드
*/		
		
		/*//플레이어 초기화 수정필요=> 대기실에서 데이터 가져와야함.
		p[0]= new PlayerDTO(0,pCard[0]);
		p[1]= new PlayerDTO(1,pCard[1]);
		p[2]= new PlayerDTO(2,pCard[2]);
		p[3]= new PlayerDTO(3,pCard[3]);
		
		pMain=new PlayerDTO(p[0].getCharIndex(),pCard[0]);
		
		crrPlayer=0;
		
		setGamePlayer(crrPlayer,runDice());
		*/
	}
	public void setPlayer(int pnum, String avata){
		p[pnum-1]= new PlayerDTO(avata,pCard[pnum-1]);
		
	}
	
	   public int runDice() {
		      // TODO Auto-generated method stub
		      
		      random= new Random(System.currentTimeMillis());
		      
		      dice1=random.nextInt(6)+1;
		      dice2=random.nextInt(6)+1;

		      try {
		         Thread.sleep(100);
		      } catch (InterruptedException e) {
		         // TODO Auto-generated catch block
		         e.printStackTrace();
		      }
		      
		      return dice1+dice2;
		   }
	/*public int runDice() {
		// TODO Auto-generated method stub
		
		random= new Random(System.currentTimeMillis());
		
		dice1=random.nextInt(6)+1;
		dice2=random.nextInt(6)+1;
		frTurn = new JFrame("주사위");
		frTurn.setSize(300, 300);
		Container contentPane = frTurn.getContentPane();
		JLabel label = new JLabel(p[crrPlayer].getId()+"턴! ",JLabel.CENTER);
		JLabel label2 = new JLabel("이동횟수: "+(dice1+dice2),JLabel.CENTER);
		contentPane.add(label, BorderLayout.CENTER);
		contentPane.add(label2, BorderLayout.SOUTH);		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frTurn.setBounds((screenSize.width - frTurn.getWidth())/2,(screenSize.height - frTurn.getHeight())/2,frTurn.getWidth(),frTurn.getHeight());
		
		//frTurn=new ShowTurn(p[crrPlayer].getId(), (dice1+dice2),gv);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		frTurn=new ShowTurn(p[crrPlayer].getId(), (dice1+dice2),gv);
		frTurn.setVisible(true);
		
		return dice1+dice2;
	}*/
	
	public int getMyNum() {
		return myNum;
	}

	public void setMyNum(int myNum) {
		this.myNum = myNum;
	}

	public int getMyAva() {
		return myAva;
	}

	public void setMyAva(int myAva) {
		this.myAva = myAva;
	}

	public PlayerDTO getpMain() {
		return pMain;
	}

	public int getDice1() {
		return dice1;
	}



	public int getDice2() {
		return dice2;
	}



	public void move(){
		int isChanged=0;
		if(crrX+inputX>=0 && crrX+inputX<13){
			crrX=crrX+inputX;
			pMain.crrX=crrX;
			
			isChanged++;
		}
		
		if(crrY+inputY>=0 && crrY+inputY<13){
			crrY=crrY+inputY;
			pMain.crrY=crrY;
			//GameArea.crrY=crrY;
			
			isChanged++;
		}
		
		if(isChanged<2){
			count++;
		}
		gv.setpXY(crrX, crrY);
		inputX=0;
		inputY=0;
		System.out.println("move()");
		
	}
	
	public int isReached(){
		int roomNo=0;
		//방1~3
		if(crrY==0){
			if(crrX==1){
				roomNo=1;
			}else if(crrX==8)
				roomNo=2;
			else if(crrX==12)
				roomNo=3;
		}else if(crrX==12){
			if(crrY==4)
				roomNo=4;
			else if(crrY==10)
				roomNo=5;
		}else if(crrY==12){
			if(crrX==9)
				roomNo=6;
			else if(crrX==2)
				roomNo=7;
			
		}else if(crrX==0){
			if(crrY==9)
				roomNo=8;
			else if(crrY==3)
				roomNo=9;
		}
		return roomNo;
	}

	public int process()  {
		move();
		//isReached();
		int roomNum=isReached();
		if(roomNum!=0){
			return roomNum;
		}
		if(count==0){
			
			
			savePlayerStatus();
			setGamePlayer(crrPlayer,runDice());
			
			
		}
		//isTurn();
		return 0;
	
}

	public void isTurn() {
		// TODO Auto-generated method stub
		if(count==0){
			
			
			savePlayerStatus();
			setGamePlayer(crrPlayer,runDice());
			
			
		}
	}
	
	//카드 봉인하기
	public void setAnswerCard(int[] answerCard) {
		this.answerCard = answerCard;
	}

	public void setpCard(int[][] pCard) {
		this.pCard = pCard;
	}


	public void savePlayerStatus(){
		p[crrPlayer].setCrrX(crrX);
		p[crrPlayer].setCrrY(crrY);
		p[crrPlayer].setNumCanGo(0);
		
		crrPlayer++;
		if(crrPlayer==4)
			crrPlayer=0;
		
	}

	public void setGamePlayer(int pNum, int dice){
		pMain=p[pNum];
		pMain.setNumCanGo(dice);
		crrX=pMain.crrX;
		crrY=pMain.crrY;
		count=dice;
		
	}
	
	public void keyPressed(int  key){
		switch(key){
		case 0:	//KeyEvent.VK_UP
			inputY=-1;
			break;
		case 1: //KeyEvent.VK_DOWN
			inputY=1;
			break;
		case 2: //KeyEvent.VK_LEFT
			inputX=-1;
			break;
		case 3: //KeyEvent.VK_RIGHT
			inputX=1;
			break;
		default: //다른 키 눌렀을 때
			count++;
		}
		count--;
		System.out.println("keyPresser->count"+count);
		
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return count;
	}
	
	public void setCount(int count) {
		// TODO Auto-generated method stub
		this.count=count;
	}
	
}