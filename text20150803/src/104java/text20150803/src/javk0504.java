import java.util.Scanner;
public class javk0504 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入英文大寫或小寫");
		String sta=scn.next();		//"ABAEWREWFG"
		char cc = sta.charAt(0);	//'A'
		int num = (int)(cc);		//97
		if(num>=65 && num<=90){
			char dd = (char)(num+32);
			System.out.println(dd);		
		}else if(num>=97 && num<=122){
			char ee = (char)(num-32);
			System.out.println(ee);
		}
//		if(sta.equals("a")){System.out.println("A");}
//		if(sta.equals("A")){System.out.println("a");}
//		if(sta.equals("b")){System.out.println("B");}
//		if(sta.equals("B")){System.out.println("b");}
//		if(sta.equals("c")){System.out.println("C");}
//		if(sta.equals("C")){System.out.println("c");}
//		if(sta.equals("d")){System.out.println("D");}
//		if(sta.equals("D")){System.out.println("d");}
//		if(sta.equals("e")){System.out.println("E");}
//		if(sta.equals("E")){System.out.println("e");}
//		if(sta.equals("f")){System.out.println("F");}
//		if(sta.equals("F")){System.out.println("f");}
//		if(sta.equals("g")){System.out.println("G");}
//		if(sta.equals("G")){System.out.println("g");}
//		if(sta.equals("h")){System.out.println("H");}
//		if(sta.equals("H")){System.out.println("h");}
//		if(sta.equals("i")){System.out.println("I");}
//		if(sta.equals("I")){System.out.println("i");}
//		if(sta.equals("j")){System.out.println("J");}
//		if(sta.equals("J")){System.out.println("j");}
//		if(sta.equals("k")){System.out.println("K");}
//		if(sta.equals("K")){System.out.println("k");}
//		if(sta.equals("l")){System.out.println("L");}
//		if(sta.equals("L")){System.out.println("l");}
//		if(sta.equals("m")){System.out.println("M");}
//		if(sta.equals("M")){System.out.println("m");}
//		if(sta.equals("n")){System.out.println("N");}
//		if(sta.equals("N")){System.out.println("n");}
//		if(sta.equals("o")){System.out.println("O");}
//		if(sta.equals("O")){System.out.println("o");}
//		if(sta.equals("p")){System.out.println("P");}
//		if(sta.equals("P")){System.out.println("p");}
//		if(sta.equals("q")){System.out.println("Q");}
//		if(sta.equals("Q")){System.out.println("q");}
//		if(sta.equals("r")){System.out.println("R");}
//		if(sta.equals("R")){System.out.println("r");}
//		if(sta.equals("s")){System.out.println("S");}
//		if(sta.equals("S")){System.out.println("s");}
//		if(sta.equals("t")){System.out.println("T");}
//		if(sta.equals("T")){System.out.println("t");}
//		if(sta.equals("u")){System.out.println("U");}
//		if(sta.equals("U")){System.out.println("u");}
//		if(sta.equals("v")){System.out.println("V");}
//		if(sta.equals("V")){System.out.println("v");}
//		if(sta.equals("w")){System.out.println("W");}
//		if(sta.equals("W")){System.out.println("w");}
//		if(sta.equals("x")){System.out.println("X");}
//		if(sta.equals("X")){System.out.println("x");}
//		if(sta.equals("y")){System.out.println("Y");}
//		if(sta.equals("Y")){System.out.println("y");}
//		if(sta.equals("z")){System.out.println("Z");}
//		if(sta.equals("Z")){System.out.println("z");}
		
	}
}
