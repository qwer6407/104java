import java.util.Scanner;
public class method07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("n= ");
		int n=scn.nextInt();
		float m=0;
		m=add(n);
		System.out.print(m);
	}
	public static float add(int j){
		float sum=0;
		for(int i=1;i<=j;i++){
			float v1=1;
			float v2=(2*i-1);
			float v3=(2*i);
			float c=1/((v2)*(v3));
			sum=sum+(c);
			
		}
			return sum;
	}
}
