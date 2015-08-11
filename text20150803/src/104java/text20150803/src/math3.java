import java.util.Scanner;
public class math3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入身高");
		float a=scn.nextFloat();
		if(a>165){System.out.println("通過第一關");
		System.out.println("請輸入體重");}
		else if(a<165){System.out.println("不通過");		
		float b=scn.nextFloat();
		if(b<45){System.out.println("通過第二關，可以當阿德的女朋友");
		}else if(b>45){System.out.println("不及格，請離");
		}
		}
	}
}
	
