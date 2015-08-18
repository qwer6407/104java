import java.util.Scanner;
public class for07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<4-i;j++){
				System.out.print(" ");
			}for(int k=0;k<(2*i)-1;k++){
				System.out.print("*");
			}
			System.out.println();
				}																		
				for(int a=1;a<=3;a++){
						for(int b=0;b<a;b++){
						System.out.print("1");
						}for(int c=0;c<4-a;c++){
							System.out.print("*");
						}
			System.out.println();
					}
				}
			}
	

							
				
	


