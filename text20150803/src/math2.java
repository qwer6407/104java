import java.util.Scanner;
public class math2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("�п�J���A");
		float a=scn.nextFloat();
		System.out.println("�п�J���B");
		float b=scn.nextFloat();
		System.out.println("�аݧA�n���B��O+�A-�A*��/?");
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




