import java.util.Scanner;
public class while01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int j=0;
		int n=scn.nextInt();
		while(j<n){
			int k =0;
			while(k<=j){
				System.out.print("*");
				k++;
			}
			System.out.println();
			j++;
		}
	}

}
