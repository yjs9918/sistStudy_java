package com.sist.board;
/*
 *   기능
 *   1) 목록출력 => get
 *   2) 글쓰기 => add
 *   3) 내용보기 => get
 *   4) 수정하기 => set
 *   5) 삭제하기 => remove
 *   6) 찾기 => get
 */
import java.util.*;
import java.io.*;
public class BoardDAO {
	private static ArrayList<BoardDTO> list= new ArrayList<BoardDTO>();
	static
	{
		try 
		{
			File file=new File("c:\\image\\board.txt");
			ObjectInputStream ois= new ObjectInputStream(new FileInputStream(file));
			// 객체를 저장하고 불러올때 쓰는 것 = ObjectStream
			list=(ArrayList<BoardDTO>)ois.readObject();
			ois.close();
		} catch (Exception ex) {}
	}
	//목록 요청
	public ArrayList<BoardDTO> boardListData(int page)
	{
		ArrayList<BoardDTO> data=new ArrayList<BoardDTO>();
		int j=0; //10개씩 나눠주는 변수
		int pagecnt=(page*10)-10; // 출력 시작점
		int k=0; // for의 수행 갯수
		/*
		 *   게시물 14개
		 *   0
		 *   1
		 *   2
		 *   3
		 *   4
		 *   5
		 *   6
		 *   7
		 *   8
		 *   9
		 *   ==================== 1page
		 *   10
		 *   11
		 *   12
		 *   13
		 *   
		 *   1p   2p
		 *   0    10
		 *   9    13
		 */
		/*for(BoardDTO d:list)
		{
			if(j<10 && k>=pagecnt)
			{
				data.add(d);
				j++;
			}
			k++;
		} //page 나누는 기법 */		
		// SELECT ~ FROM board
		for (int i=list.size()-1;i>=0;i--) //최신 것 부터 호출
		{
			BoardDTO d=list.get(i);
			if(j<10 && k>=pagecnt)
			{
				data.add(d);
				j++;
			}
			k++;
		}
		return data;
	}
	public void BoardInsert(BoardDTO d)
	{
		// INSERT INTO board VALUES(seq.nextVal,?,?,?,SYSDATE,0) <= 오라클
		d.setNo(noMaxNumber());
		d.setRegdate(new Date());
		d.setHit(0);
		list.add(d);
	}
	// Sequence (번호 자동 증가)
	public int noMaxNumber()
	{
		int max=0;
		for(BoardDTO d:list)
		{
			if(d.getNo()>max)
			{
				max=d.getNo();
			}
		}
		return max+1;
	}
	public static ArrayList<BoardDTO> getList() {
		return list;
	}
	public int boardTotalPage()
	{
		/*
		 *   int total=list.size()/10;
		 */
		return (int)(Math.ceil(list.size()/10.0));
		//1.1 ==>2  1.0 ==>1 ===>올림함수
	}
	//내용보기
	public BoardDTO boardContent(int no)
	{
		BoardDTO d=new BoardDTO();
		for(BoardDTO dd:list)
		{
			if(no==dd.getNo())
			{
				dd.setHit(dd.getHit()+1);
				d=dd;
				break;
			}
		}
		return d;
	}
	//수정하기
	public boolean boardUpdate(BoardDTO d)
	{
		boolean bCheck=false;
		for(int i=0;i<list.size();i++)
		{
			BoardDTO dd=list.get(i);
			if(d.getNo()==dd.getNo())
			{
				if(d.getPwd().equals(dd.getPwd()))
				{
					bCheck=true;
					list.set(i,d);
				}
				else
				{
					bCheck=false;
				}
			}
		}
		return bCheck;
	}
	//삭제하기
	public boolean boardDelete(int no,String pwd)
	{
		boolean bCheck=false;
		for(int i=0;i<list.size();i++)
		{
			BoardDTO d=list.get(i);
			if(no==d.getNo())
			{
				if(pwd.equals(d.getPwd()))
				{
					bCheck=true;
					list.remove(i);
				}
				else
				{
					bCheck=false;
				}
			}
		}
		return bCheck;
	}

}
















