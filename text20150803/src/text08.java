import java.util.Scanner;
public class text08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入半徑");
		System.out.println("請輸入圓周率");
		float b=scn.nextFloat();
		float a=scn.nextFloat();	
		System.out.print("面積為"+(b*b*a));
	}
}
