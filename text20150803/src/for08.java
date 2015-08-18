import java.util.Scanner;
public class for08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("½Ð¿é¤Jn");
		int n=scn.nextInt();
		int sum=0;
		for(int i=n;i<n+1;i=i*i+1)
		{
			sum=sum+i;
			System.out.print("­È¬°"+sum);
		}
	}
}
