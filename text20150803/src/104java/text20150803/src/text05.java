import java.util.Scanner;
public class text05{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("Hello，請問你是？");
		String name=scn.next();
		System.out.println("Hi"+name+"你好,歡迎來到亞大!");
		System.out.println("很高興認識你,請問您是哪所高中畢業的?");
		String jack=scn.next();
		System.out.print("原來你是"+jack+"畢業的");
		System.out.print("你現在讀哪個系?");
		String toyz=scn.next();
		System.out.print("哇"+toyz+"可是熱門科系呢!,你實在太厲害了!");
		System.out.print("你畢業後要從事什麼工作?");
		String aabb=scn.next();
		System.out.println(""+aabb+"可是熱門的工作呢!,真是羨慕你!");
	}
}
