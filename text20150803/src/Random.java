import java.util.Scanner;

public class Random {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);		
		int[] data = new int[12];
		for(int i=0;i<12;i++){
			System.out.print("請輸入第"+i+"間教室上課人數");
			data[i]=scn.nextInt();}
		System.out.print("請問您要哪間教室修課人數?");
		int k=scn.nextInt();
		System.out.println("教室"+k+"有"+data[k]+"人在上課");
		for(int i=0;i<12;i++){
			if(data[i]<60){System.out.println("第"+i+"教室修課人數只有"+data[i]);
		}
	}

}
}