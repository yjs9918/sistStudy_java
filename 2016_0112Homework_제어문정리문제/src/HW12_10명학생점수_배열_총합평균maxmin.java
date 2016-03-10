
public class HW12_10명학생점수_배열_총합평균maxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int[] jumsu=new int[10];
		for(int i=0;i<jumsu.length;i++)
		{
			jumsu[i]=(int)(Math.random()*101);
		}
		int total=0;
		double avg=0.0;
		int max=0;
		int min=100;
		for(int i=0;i<10;i++)
		{
			total+=jumsu[i];
			if(max<jumsu[i])
				max=jumsu[i];
			if(min>jumsu[i]);
			min=jumsu[i];
		}
		for(int i=0;i<10;i++)
		{
			System.out.print(jumsu[i]+" ");
		}
		System.out.println("\n총점:"+total);
		System.out.println("평균:"+total/10.0);
		System.out.println("최고점:"+max);
		System.out.println("최저점:"+min);

	}

}
