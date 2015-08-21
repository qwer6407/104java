import java.util.Scanner;
public class method20150814 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("¿é¤J¾ã¼Æn= ");
		int n=scn.nextInt();
		int m=0;
		m=add(n);
		System.out.print(m);
	}
	
	
	public static int add(int j){		
		int sum=0;
		for(int i=0;i<=j;i++){
			int v1=(i)*(i+1);
			sum=sum+v1;
		}
		return sum;
	}
}
