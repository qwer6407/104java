import java.util.Scanner;
public class java0502 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入飲料店");
		System.out.print("1.五十嵐2.其他");
		int n=scn.nextInt();
		switch(n){
		case 1:System.out.print("不會買");
		break;
		case 2:System.out.print("請選擇飲料 1.綠茶類2.咖啡");
		int m=scn.nextInt();
		switch(m){
		case 1:System.out.print("請選擇 1.綠茶15元2.烏龍綠50元");
		int s=scn.nextInt();
		switch(s){
		case 1:System.out.println("買");
		break;
		case 2:System.out.println("不買");
		break;
		}
		case 2:System.out.print("請選擇1.咖啡30元2.拿鐵50元");
		int x=scn.nextInt();
		switch(x){
		case 1:System.out.print("買");
		break;
		case 2:System.out.print("不買");
		}
		}
		}
	}
}
