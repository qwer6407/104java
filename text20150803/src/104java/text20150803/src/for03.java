import java.util.Scanner;
public class for03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("17到1399 17的倍數相加為");
		int sum=0;
		int i=scn.nextInt();
		for(i=17;i<=1399;i=i+17){
		sum=sum+i;
		System.out.println("sum"+sum);
		}
	}

}
