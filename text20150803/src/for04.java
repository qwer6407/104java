import java.util.Scanner;
public class for04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("�п�J�Z�ŤH��");
		int a=scn.nextInt();
		System.out.println("�п�J�C�H����");
		int people=scn.nextInt();
		int sum1=0;
		float b=scn.nextFloat();
		for(b=1;b<=people;b=b+1){
			sum1=sum1+scn.nextInt();
		System.out.println("����������"+sum1/a);
			}		
		}
	}

