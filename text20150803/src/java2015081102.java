import java.util.Scanner;
public class java2015081102 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("n= ");
		int n=scn.nextInt();
		int i=1;
		int v1=1;
		while(i<n){
			i++;
			v1*=i;
		}
		long c=v1;
		System.out.print("­È¬°"+c);
	}

}
