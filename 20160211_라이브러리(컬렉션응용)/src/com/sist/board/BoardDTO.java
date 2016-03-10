package com.sist.board;
import java.io.Serializable;
import java.util.*;
/*
 *   class ����
 *     1) ���� �ٸ� �����͸� ��Ƽ� ����(����� ���� ��������)
 *         => ĸ��ȭ ���
 *         => ������ �� (~DTO,VO)
 *     2) ����� ����
 *         => �׼� �� (~DAO,~Manager)
 *            DAO : ���� �����, �����ͺ��̽� ����
 *            Manager : HTML,XML �Ľ�
 *     3) ȥ��
 *         => ������ + ���
 *     
 */
public class BoardDTO implements Serializable{ //Serializable = ����ȭ
	private int no; //�Խù� ��ȣ
	private String name; //�ۼ���
	private String subject; //����
	private String content; //����
	private Date regdate=new Date();
	private String pwd; //��й�ȣ
	private int hit; //��ȸ��
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	
}
