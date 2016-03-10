//String은 상속받아 변경 불가.(Math,System도 마찬가지)
public class 문자열데이터2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=" Hello Java ";
		System.out.println(str.length()); //length => 문자 갯수 확인 (비밀번호 등에 이용. 8자 이상 입력...)
		System.out.println(str.trim().length()); //trim() => 좌우의 공백 제거 <매우중요>
		String str1="0123456789";
		//우편 번호 ==> 010-111
		// ㄴ 0,3 ==> 4,7
		System.out.println(str1.substring(2)); // char 배열이라고 생각.. 인덱스 번호부터 출력함
		System.out.println(str1.substring(3, 7)); // 인덱스 부터 출력해서 end-1번까지 출력
		String str2="MainClass.java";
		System.out.println(str2.substring(str2.lastIndexOf('.')+1)); 
		//lastIndexOf => 뒤에서부터 찾아옴(확장자 찾을때) / +1 => . 다음것부터 출력하라
		//IndexOf => 앞에서부터 찾아옴
		String str3="admin,man,20,2003";
		String[] res=str3.split(","); // split => 데이터가 묶여있을 때 잘라서 가져옴.
		//String.valueOf(30); //"30" static 메소드 (객체이름없이 접근)
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
		
	}

}
