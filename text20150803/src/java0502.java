import java.util.Scanner;
public class java0502 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("�п�J���Ʃ�");
		System.out.print("1.���Q�P2.��L");
		int n=scn.nextInt();
		switch(n){
		case 1:System.out.print("���|�R");
		break;
		case 2:System.out.print("�п�ܶ��� 1.�����2.�@��");
		int m=scn.nextInt();
		switch(m){
		case 1:System.out.print("�п�� 1.���15��2.�Q�s��50��");
		int s=scn.nextInt();
		switch(s){
		case 1:System.out.println("�R");
		break;
		case 2:System.out.println("���R");
		break;
		}
		case 2:System.out.print("�п��1.�@��30��2.���K50��");
		int x=scn.nextInt();
		switch(x){
		case 1:System.out.print("�R");
		break;
		case 2:System.out.print("���R");
		}
		}
		}
	}
}
