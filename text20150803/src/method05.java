import java.util.Scanner;
public class method05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int data[]=new int[3];
		System.out.print("�Ф��O��J��^�Ʀ��Z");
		float a=scn.nextInt();
		float b=scn.nextInt();
		float c=scn.nextInt();
		float d=0;
		float m=0;
		d=sum(a,b,c);
		m=avg(a,b,c);
		System.out.print("�`����"+d);
		System.out.print("������"+m);
	}
	public static float sum(float i,float j,float k)
	{			float sum=0;
				sum=i+j+k;
				return sum;
	}
	public static float avg(float z,float x,float c)
	{	float avg=0;
		avg=(z+x+c)/3;
		return avg;
	}
}
