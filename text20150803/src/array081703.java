import java.util.Scanner;
public class array081703 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("�п�J�x�}a");
		int n=scn.nextInt();
		float m=scn.nextFloat();	
		System.out.println("�z�ҿ�J��a�x�}��"+n+"*"+m+"");
		System.out.println("�п�J�x�}b");
		float a=scn.nextFloat();
		int b=scn.nextInt();
		//System.out.println("�z�ҿ�J��b�x�}��"+a+"*"+b+"");
		if(a/m==1){
		System.out.println("c="+(n)+"*"+(b));
		}else if(a/m!=1){
			System.out.print("�x�}C������");
		}
	}
}
