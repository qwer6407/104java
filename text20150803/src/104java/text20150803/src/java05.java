import java.util.Scanner;
public class java05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("��J�P��");
		System.out.println("��J���");
		float d=scn.nextFloat();
		float a=scn.nextFloat();
		if(d==1){System.out.println("���i�H�Y��");}
		if(d==3){System.out.println("���i�H�Y��");}
		if(d==5){System.out.println("���i�H�Y��");}
		if(d==7){System.out.println("���i�H�Y��");}
		if(d==2&& a!=7&&a!=17&&a!=27){System.out.println("�i�H�Y��");}				
		else if(d==2&& a==7){System.out.println("���i�H�Y��");}
		else if(d==2&& a==17){System.out.println("���i�H�Y��");}
		else if(d==2&& a==27){System.out.println("���i�H�Y��");}
		if(d==4&& a!=7&&a!=17&&a!=27){System.out.println("�i�H�Y��");}
		else if(d==4&& a==7){System.out.println("���i�H�Y��");}
		else if(d==4&& a==17){System.out.println("���i�H�Y��");}
		else if(d==4&& a==27){System.out.println("���i�H�Y��");}
		if(d==6&& a!=7&&a!=17&&a!=27){System.out.println("�i�H�Y��");}
		else if(d==6&& a==7){System.out.println("���i�H�Y��");}
		else if(d==6&& a==17){System.out.println("���i�H�Y��");}
		else if(d==6&& a==27){System.out.println("���i�H�Y��");}
	}
}
