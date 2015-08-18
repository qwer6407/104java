import java.util.Scanner;
public class array081703 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入矩陣a");
		int n=scn.nextInt();
		float m=scn.nextFloat();	
		System.out.println("您所輸入的a矩陣為"+n+"*"+m+"");
		System.out.println("請輸入矩陣b");
		float a=scn.nextFloat();
		int b=scn.nextInt();
		//System.out.println("您所輸入的b矩陣為"+a+"*"+b+"");
		if(a/m==1){
		System.out.println("c="+(n)+"*"+(b));
		}else if(a/m!=1){
			System.out.print("矩陣C不成立");
		}
	}
}
