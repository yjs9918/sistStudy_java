package com.sist;
// 자바에서 제공하는 클래스
import javax.swing.*; //윈도우와 관련된 모든 클래스
/*
 *   Container (윈도우창)
 *     JFrame : 기본 윈도우창
 *     JWindow : 타이틀이 없는 창
 *     JDialog : 윈도우 위에 윈도우창을 띄우는 것
 *     JPanel : 단독으로 수행 할 수 없다
 *   Component (버튼,콤보...)
 *     Button :
 *       = Button : Menu, JButoon
 *       = ToggleButton : JRadioButton, JCheckBox
 *     TextField : 한줄 입력
 *       = JTextField
 *       = JPasswordField
 *     TextArea : 여러줄 입력
 *       = JTextArea : 메모장
 *       = JTextPane : 워드패드
 *     List : 목록 출력
 *       = JList : 타이틀 없이 출력
 *       = JComboBox : 자동완성기능같은거... 하나 선택하게 해줌
 *       = JTree : 하위 생성 목록같은거... src-com.sist-Mainclass....
 *       = JTable : 타이틀 있음
 *       
 *     기타
 *      JLabel : 네이버 아이디 창 같은거.. (아이디 입력 전에 아이디 라고 떠있게 해줌)
 *      JScrollPane : H,V
 *        => JVerticalScrollBar
 *      JProgressBar
 *      
 *      = JSplitePane : 화면 분할
 *      = JInternelFrame : MDI => 내용 동시에 읽음
 *      = JTabbedPane : Tab
 *   =====================================================
 *   배치
 *    = BorderLayout : 위 아래 좌우 센터 중 선택해서 배치(5군데~)
 *    = FlowLayout : 일자로 배치(중앙으로 정렬)
 *    = CardLayout
 *    = GridLayout : 균등하게 나뉘어서 배치
 *    = 사용자 정의
 */
/*
 *   생성자 :
 *     특징) 클래스명과 동일
 *         여러개 제작이 가능 : 오버로딩(매개변수가 다르다)
 *         리턴형이 없다
 *     하는 일) 변수 초기화 담당
 *           저장과 동시에 실행해야 할 내용이 있는 경우
 *           윈도우,파일,네트워크 연결,데이터베이스 연결
 */
/*
 *   상속 ==> 단일상속
 */
public class MainClass1 extends JFrame {
	public MainClass1()
	{
		// 윈도우 크기 결정 setSize(),setBounds()
		//setSize(800,600);
		setBounds(100,100,800,600);
		// 윈도우를 보여라 요청 setVisible(boolean)
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass1 m=new MainClass1();
	}

}
