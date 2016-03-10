package com.sist;
// �ڹٿ��� �����ϴ� Ŭ����
import javax.swing.*; //������� ���õ� ��� Ŭ����
/*
 *   Container (������â)
 *     JFrame : �⺻ ������â
 *     JWindow : Ÿ��Ʋ�� ���� â
 *     JDialog : ������ ���� ������â�� ���� ��
 *     JPanel : �ܵ����� ���� �� �� ����
 *   Component (��ư,�޺�...)
 *     Button :
 *       = Button : Menu, JButoon
 *       = ToggleButton : JRadioButton, JCheckBox
 *     TextField : ���� �Է�
 *       = JTextField
 *       = JPasswordField
 *     TextArea : ������ �Է�
 *       = JTextArea : �޸���
 *       = JTextPane : �����е�
 *     List : ��� ���
 *       = JList : Ÿ��Ʋ ���� ���
 *       = JComboBox : �ڵ��ϼ���ɰ�����... �ϳ� �����ϰ� ����
 *       = JTree : ���� ���� ��ϰ�����... src-com.sist-Mainclass....
 *       = JTable : Ÿ��Ʋ ����
 *       
 *     ��Ÿ
 *      JLabel : ���̹� ���̵� â ������.. (���̵� �Է� ���� ���̵� ��� ���ְ� ����)
 *      JScrollPane : H,V
 *        => JVerticalScrollBar
 *      JProgressBar
 *      
 *      = JSplitePane : ȭ�� ����
 *      = JInternelFrame : MDI => ���� ���ÿ� ����
 *      = JTabbedPane : Tab
 *   =====================================================
 *   ��ġ
 *    = BorderLayout : �� �Ʒ� �¿� ���� �� �����ؼ� ��ġ(5����~)
 *    = FlowLayout : ���ڷ� ��ġ(�߾����� ����)
 *    = CardLayout
 *    = GridLayout : �յ��ϰ� ����� ��ġ
 *    = ����� ����
 */
/*
 *   ������ :
 *     Ư¡) Ŭ������� ����
 *         ������ ������ ���� : �����ε�(�Ű������� �ٸ���)
 *         �������� ����
 *     �ϴ� ��) ���� �ʱ�ȭ ���
 *           ����� ���ÿ� �����ؾ� �� ������ �ִ� ���
 *           ������,����,��Ʈ��ũ ����,�����ͺ��̽� ����
 */
/*
 *   ��� ==> ���ϻ��
 */
public class MainClass1 extends JFrame {
	public MainClass1()
	{
		// ������ ũ�� ���� setSize(),setBounds()
		//setSize(800,600);
		setBounds(100,100,800,600);
		// �����츦 ������ ��û setVisible(boolean)
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass1 m=new MainClass1();
	}

}
