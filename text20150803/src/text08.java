import java.util.Scanner;
public class text08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("�п�J�b�|");
		System.out.println("�п�J��P�v");
		float r=scn.nextFloat();
		float c=scn.nextFloat();
		float h=scn.nextFloat();
		h=(r*r*c);	
		System.out.print("���n��"+h);
	}
}
