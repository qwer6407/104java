import java.util.Scanner;
public class text07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("輸入梯形上底");
		float a=scn.nextFloat();
		System.out.println("輸入梯形下底");
		float b=scn.nextFloat();
		System.out.println("輸入梯形高");
		float c=scn.nextFloat();
		float h;
		h=(a+b)*c/2;
		System.out.print("面積為"+h);
	}

}
