package com.sist.test;

public class Student {
	private int hakbun;
	private String name;
	private String subject;
	private int kor;
	private int math;
	private int eng;
	private int total;
	private int rank;
	private char hakjum;
	private double avg;
	
	/*public Student(int hakbun, String name, String subject, int kor, int math, int eng, int total, int rank,
			char hakjum, double avg) {
		super();
		this.hakbun = hakbun;
		this.name = name;
		this.subject = subject;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.total = total;
		this.rank = rank;
		this.hakjum = hakjum;
		this.avg = avg;
	}*/
	public Student()
	{
		System.out.println("this:"+this);
		//System.out.println("super:"+super);
	}
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
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
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public char getHakjum() {
		return hakjum;
	}
	public void setHakjum(char hakjum) {
		this.hakjum = hakjum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}

}
