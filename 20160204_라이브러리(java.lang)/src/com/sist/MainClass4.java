package com.sist;
//StringTokenizer : 문자열을 분해 (단어별로)
/*
 *   hasMoreTokens() : 총 단어 개수
 *   nextToken() : 자른 단어 가져옴
 */
import java.util.*;
public class MainClass4 {
	public static void main(String[] args) {
		String data="red|black|green|cyan|yellow|pink";
		StringTokenizer st= new StringTokenizer(data, "|");
		
		/*String[] datas=data.split("|"); //regex:정규식 => "|"는 피해야한다
		for(int i=0;i<datas.length;i++)
		{
			System.out.println(datas[i]);
		} // 한글자씩 자름*/
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}
