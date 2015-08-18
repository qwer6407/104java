import java.util.Random;
import java.util.Scanner;
public class java081803 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);			
		System.out.print("n= ");
		int n=scn.nextInt();
		int i=1;
		int v1;
		int sum=0;
		for(i=1;i<=n;i++){
			v1=(i)*(i+1);
			sum=sum+v1;
			
		}
		System.out.print("­È¬°"+sum);
	}
}
