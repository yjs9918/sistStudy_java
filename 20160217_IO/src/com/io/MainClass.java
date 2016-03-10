package com.io;
/*
 *   IO : (input,output)
 *   ====== 입출력
 *   = 메모리 입출력
 *   = 파일 입출력(다운로드, 업로드)   web: html,oracle
 *   = 네트워크 입출력
 *   
 *   자바에서 지원하는 클래스
 *   8bit(1byte)                   16bit(2byte)
 *   ===========                   ============
 *   InputStream,OutputStream      Reader,Writer
 *    (interface)
 *   1) 메모리 입출력
 *      InputStream, OutputStream
 *      BufferedInputStream
 *      BufferedOutputStream
 *      
 *   2) 파일 관련 입출력
 *      FileInputStream
 *      FileOutputStream
 *      ================ 1byte
 *      FileReader
 *      FileWriter
 *      ================ 2byte
 *      
 *   3) 네트워크
 *      전송 : byte로 전송
 *      읽어 올때 : char로 받는다
 *   ====================================================
 *   객체단위로 전송
 *   ObjectInputStream
 *   ObjectOutputStream
 *   ==> 직렬화 (값을 받아올때는 다시 객체단위로 받아야 하기 때문에 역직렬화)
 *       class A
 *       {
 *       	String name;
 *       	String sex;
 *       	String addr;
 *       }
 *       
 *       A a= new A();
 *       
 *       =============
 *           name
 *       =============
 *           sex
 *       =============
 *           addr       직렬화
 *       =============  ===> ===================
 *                             name  sex  addr
 *                           ===================
 *                      <=== 역직렬화
 *                      
 *       파일 : csv,xml,json 을 많이 이용
 *       
 *       읽어오는 방법
 *        1) 메모리 읽기
 *        2) 파일 읽기
 *        3) web 읽기
 *        4) 네트워크 읽기
 *        
 *        BufferedReader in= 
 *          new BufferedReader(new InputStreamReader(***))
 *                                 =================
 *                                   8bit => 16bit변환
 *          (***) 안에 들어가는 요소
 *          메모리 읽기 => System.in
 *          파일 읽기 => new FileInputStream(file명)
 *          Web 읽기 => url.openConnection().getInputStream()
 *          Network => socket.getInputStream()
 *      
 */
import java.io.*;
import java.net.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키보드 입력값 받기
		try
		{	//메모리에서 읽기
			/*BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
			System.out.print("한글을 입력하세요:");
			String msg=in.readLine(); //한줄 전체를 읽어올 때 씀 \n이 나왔을 때 읽어들임
			System.out.println("읽은 값: "+msg);*/ 
			
			//파일에서 읽기
			/*FileInputStream fis=new FileInputStream("C:\\javaDev\\javaStudy2\\20160217_IO\\src\\com\\io\\MainClass.java");
			BufferedReader in= new BufferedReader(new InputStreamReader(fis));
			while(true)
			{
				String msg=in.readLine();
				if(msg==null) //더 이상 읽은 값이 없을때
				{
					break;
				}
				System.out.println(msg);
			}*/
			//파일에서 한글깨짐 확인(FileInputStream)
			//FileReader fis=new FileReader 로 읽으면 한글 깨지지않음
			/*int i=0;
			//-1 : EOF (End Of File => 파일이 끝나기 전까지)
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
			}*/
			
			//web에서 읽기
			URL url=new URL("http://wwww.daum.net");
			HttpURLConnection conn=(HttpURLConnection)url.openConnection(); //conn => 다음서버에 접근
			//BufferedReader in= new BufferedReader(new InputStreamReader(conn.getInputStream()));//한글 깨짐
			BufferedReader in= new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
			//getInputStream:데이터 통로 연결 , UTF-8: 유니코드 (웹에서 가져올때 사용=>가져오는 웹사이트의 문자코드를 넣어줘야한다 )
			while(true)
			{
				String msg=in.readLine();
				if(msg==null) break;
				System.out.println(msg);
			}
			
			
		}catch(Exception ex){}
	}

}
