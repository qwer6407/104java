import java.util.Scanner;
public class for07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		for(int i=1;i<=4;i++)
		{
			for(int j=0;j<4-i;j++){
				System.out.print("1");
			}for(int k=0;k<(2*i)-1;k++){
				System.out.print("*");
			}
			for(int a=1;a<=3;a++){
				for(int b=0;b<a;b++){
					System.out.print("2");
			System.out.println();	
				}
			}
		}
	}
}
	

							
				
	


