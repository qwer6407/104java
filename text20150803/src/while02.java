import java.util.Scanner;
public class while02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int i=1;
		while(i<=n){
			i++;
			int j=0;
			while(j<n-i){
				System.out.print("1");
				j++;
			}
			int k=0;
			while(k<(2*i)-1){
				System.out.print("*");
				k++;
				
			}		
			System.out.println();
		}
	}

}
