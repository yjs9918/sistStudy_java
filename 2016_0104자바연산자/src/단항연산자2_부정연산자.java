/*
 *   부정 연산자 ( ! ) => boolean
 *     => true=>false
 *        false=>true
 *     예)
 *        boolean bCheck=false;
 *        while(true)
 *        {
 *            bCheck=!bCheck;
 *            if(bCheck==true)
 *            {
 *            }
 *            else
 *            {
 *            }
 *        }   
 */
public class 단항연산자2_부정연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b=false;
		System.out.println("b="+b);
		b=!b;
		System.out.println("b="+b);

	}

}
