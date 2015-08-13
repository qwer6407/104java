import java.util.Scanner;
public class for06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("n:");
		int n=scn.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=0;j<n-i;j++){				
				System.out.print("1");
			}
			for(int j=0;j<(2*i)-1;j++){
				System.out.print("*");
			}
			System.out.println();			
		}
	}

}
