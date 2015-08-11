import java.util.Scanner;
public class java0503 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入邊長a");
		float a=scn.nextFloat();
		System.out.println("請輸入邊長b");
		float b=scn.nextFloat();
		System.out.println("請輸入邊長c");
		float c=scn.nextFloat();						
		if(a+b>c&& a+c>b&& b+c>a&&a-b<c&&a-c<b&&b-c<a){
			System.out.println("合理");
		}else if(a+b<=c){
			System.out.println("不合理");
		}else if(a+c<=b){
			System.out.println("不合理");
		}else if(b+c<=a){
			System.out.println("不合理");
		}
		
	}
}
