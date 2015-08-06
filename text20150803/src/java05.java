import java.util.Scanner;
public class java05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("輸入星期");
		System.out.println("輸入日期");
		float d=scn.nextFloat();
		float a=scn.nextFloat();
		if(d==1){System.out.println("不可以吃素");}
		if(d==3){System.out.println("不可以吃素");}
		if(d==5){System.out.println("不可以吃素");}
		if(d==7){System.out.println("不可以吃素");}
		if(d==2&& a!=7&&a!=17&&a!=27){System.out.println("可以吃素");}				
		else if(d==2&& a==7){System.out.println("不可以吃素");}
		else if(d==2&& a==17){System.out.println("不可以吃素");}
		else if(d==2&& a==27){System.out.println("不可以吃素");}
		if(d==4&& a!=7&&a!=17&&a!=27){System.out.println("可以吃素");}
		else if(d==4&& a==7){System.out.println("不可以吃素");}
		else if(d==4&& a==17){System.out.println("不可以吃素");}
		else if(d==4&& a==27){System.out.println("不可以吃素");}
		if(d==6&& a!=7&&a!=17&&a!=27){System.out.println("可以吃素");}
		else if(d==6&& a==7){System.out.println("不可以吃素");}
		else if(d==6&& a==17){System.out.println("不可以吃素");}
		else if(d==6&& a==27){System.out.println("不可以吃素");}
	}
}
