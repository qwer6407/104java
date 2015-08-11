import java.util.Scanner;
public class math2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入整數A");
		float a=scn.nextFloat();
		System.out.println("請輸入整數B");
		float b=scn.nextFloat();
		System.out.println("請問你要的運算是+，-，*或/?");
		String c=scn.next();				
		if(c.equals("+")){		
			System.out.println((a+b));
		}else{
			if(c.equals("-")){
				System.out.println((a-b));
			}else if(c.equals("*")){
				System.out.println((a*b));}
				else if(c.equals("/")){System.out.println((a/b));
			}
		}
	}
}




