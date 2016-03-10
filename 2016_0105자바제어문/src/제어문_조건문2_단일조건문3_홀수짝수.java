// 짝수, 홀수 판단
public class 제어문_조건문2_단일조건문3_홀수짝수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=(int)(Math.random()*100)+1;
		// Math.random() : 0.0 ~ 0.99
		System.out.println("num="+num);
		// 처리
		if(num%2==0)
			System.out.println(num+"는(은) 짝수");
		if(num%2!=0)
			System.out.println(num+"는(은) 홀수");
		
	}

}
