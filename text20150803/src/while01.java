import java.util.Scanner;
public class while01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int m=1;
		double k=20000;
		while(k<1100000){
			k=k+k*0.15;
			m++;
		}System.out.println(m);
		System.out.println("下滿需要30小時");
		
	}

}
