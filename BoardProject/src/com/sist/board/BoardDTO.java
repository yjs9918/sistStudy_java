package com.sist.board;
import java.io.Serializable;
import java.util.*;
/*
 *   class 설계
 *     1) 서로 다른 데이터를 모아서 관리(사용자 정의 데이터형)
 *         => 캡슐화 방식
 *         => 데이터 빈 (~DTO,VO)
 *     2) 기능을 수행
 *         => 액션 빈 (~DAO,~Manager)
 *            DAO : 파일 입출력, 데이터베이스 연결
 *            Manager : HTML,XML 파싱
 *     3) 혼합
 *         => 데이터 + 기능
 *     
 */
public class BoardDTO implements Serializable{ //Serializable = 직렬화
	private int no; //게시물 번호
	private String name; //작성자
	private String subject; //제목
	private String content; //내용
	private Date regdate=new Date();
	private String pwd; //비밀번호
	private int hit; //조회수
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
