import java.util.Scanner;
public class for04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入班級人數");
		int a=scn.nextInt();
		System.out.println("請輸入每人身高");
		int people=scn.nextInt();
		int sum1=0;
		float b=scn.nextFloat();
		for(b=1;b<=people;b=b+1){
			sum1=sum1+scn.nextInt();
		System.out.println("平均身高為"+sum1/a);
			}		
		}
	}

