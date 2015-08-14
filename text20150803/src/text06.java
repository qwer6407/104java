import java.util.Scanner;
public class text06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);		
		System.out.print("輸入底");
		float b=scn.nextFloat();
		System.out.print("高");				
		float h=scn.nextFloat();
		System.out.print("面積");
		float a=b*h/2;
		System.out.print("面積為"+a);
		
	}
}
