import java.util.Scanner;
public class java0503 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("�п�J���a");
		float a=scn.nextFloat();
		System.out.println("�п�J���b");
		float b=scn.nextFloat();
		System.out.println("�п�J���c");
		float c=scn.nextFloat();						
		if(a+b>c&& a+c>b&& b+c>a&&a-b<c&&a-c<b&&b-c<a){
			System.out.println("�X�z");
		}else if(a+b<=c){
			System.out.println("���X�z");
		}else if(a+c<=b){
			System.out.println("���X�z");
		}else if(b+c<=a){
			System.out.println("���X�z");
		}
		
	}
}
