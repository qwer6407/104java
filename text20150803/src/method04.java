import java.util.Scanner;
public class method04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入5個數字");	
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
		int d=scn.nextInt();
		int e=scn.nextInt();		
		int f=0;
		f=add(a,b,c,d,e);
		System.out.print(f);
	}


	public static int add(int x,int y,int z,int t ,int q)
	{
		int sum=0;
		sum=x+y+z+t+q;
		return sum;
	}
}

		

