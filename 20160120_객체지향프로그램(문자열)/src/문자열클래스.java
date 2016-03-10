/*
 *   문자열 : String => char[]을 제어하는 기능과 
 *                   문자열을 저장하는 기능
 *   사용법
 *     = String str="";
 *       ====== === == 
 *       데이터형     변수   데이터
 *       char[] str={};
 *     = String str=new String("")
 *   기능
 *     = equals : 문자열이 같은지 여부 확인
 *        (대소문자를 구분해서 비교)
 *       1) 결과값 : boolean
 *       2) 매개변수 : 문자열
 *       => boolean equals(String s)
 *       => ID,PWD = (로그인, ID중복체크, 형태소분석)
 *       예) String str="Hello";
 *          String str1="Hello";
 *          => str.equals(str1)
 *     = trim : 좌우의 공백만 제거
 *       => 사용자가 회원가입, 로그인...
 *       => String trim()
 *       예)
 *          String str=" Hello Java ";
 *          string s=str.trim()
 *     = length : 문자의 갯수
 *       => 문자를 제한 (비밀번호)
 *       => int length()
 *           String str="Hello Java";
 *           int len=str.length;
 *     = substring : 문자열 분리
 *       => String substring(int s)
 *          String substring(int s, int e)
 *       예)
 *          문자열은 시작번호가 0번부터 시작
 *          "Hello Java"
 *           0123456789
 *          String str="0123456789";
 *          str.substring(3);
 *           => 3456789
 *          str.substring(3,8)
 *           => 34567  end-1 => 7
 *     = indexOf (앞에서부터 찾는 경우)
 *       => 해당문자를 찾을 경우에 사용
 *          int indexOf(char c)
 *          string str="Hello Java";
 *                      0123456789
 *          str.indexOf('a') : 7
 *     = lastIndexOf // 경로명, 확장자
 *          string str="Hello Java";
 *                      0123456789
 *          str.indexOf('a') : 9
 *     ==============서제스트==============
 *     = startsWith
 *       boolean startsWith("문자열")
 *       java Program
 *       java and jsp
 *       java and c
 *       jsp and java
 *       startsWith("java") //내가 주어준 문자열로 '시작하는' 문장을 찾아준다
 *     = endsWith // 내가 주어준 문자열로 '끝나는' 문장을 찾아준다.
 *     but 중간에 있는 글자는 가지고 오지 못해 (substring으로 자른 후 사용한다)
 *     =================================
 *     = vlaueOf : 모든 데이터형을 문자열로 변환
 *       valueOf(10) => "10"
 *       valueOf(true) => "true"
 *       => 윈도우, 웹은 단위가 문자열
 *       => static String valueOf(데이터형) //static이므로 객체선언하지 않아도 됨.(유일한 static. 나머지는 instance)
 *       String.valueOf()
 *     = spit : 문자열별로 분리하고 저장
 *       String[] split(String regex)
 *       d{1-3}\\.d{1-3}\\.d{1-3}\\.d{1-3}  -> ip주소
 *     = toUpperCase : 대문자 변환
 *       toLowerCase : 소문자 변환
 *     = compare : 문자 비교 (각 문자가 가지고 있는 정수값으로 비교)
 *     = concat : 문자열 결합 (+)
 *     = insertString : 문자 참고
 *     = charAt(int index)
 *     String str="Hello Java"
 *       str.charAt(2) ==> 'l' (한글자씩 잘라낼 때 사용)
 */
public class 문자열클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr={
				"aaabbbccc", //0
				"abcd", //1
				"abcdef", //1
				"dsfdddsflasd", //5
				"wdsffddddjlskmcn" //5
		};
		int max=0;
		int[] count=new int[arr.length];
		int c=0;
		for(int i=0;i<arr.length;i++){
			c=0;
			for(int j=0;j<arr[i].length();j++)
			{
				char ss=arr[i].charAt(j);
				if(ss=='d')
					c++;
			}
			count[i]=c;
		}
		for(int i=0;i<count.length;i++)
		{
			if(max<count[i])
				max=count[i];
		}
		
		for(int i=0;i<count.length;i++)
		{
			if(max==count[i])
			{
				System.out.println(arr[i]);
			}
		}
	}

}
