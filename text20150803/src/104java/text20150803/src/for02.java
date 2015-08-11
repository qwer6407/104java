import java.util.Scanner;
public class for02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner scn=new Scanner(System.in);
		System.out.println("¿é¤J13");
		int sum=0;
		int i=scn.nextInt();
		for(i=13;i<=1399;i=i+2){
		sum = sum + i;
		System.out.println("sum"+sum);
	}

}
}