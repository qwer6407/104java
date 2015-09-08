import java.util.Scanner;
public class method0813 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("x= ");
		float x=scn.nextFloat();
		float m;
		m=br(x);
		System.out.print(m);
	}
	public static float br(float j){
		float y=0;
		if(j<-1){
			y=3*(j*j);}
		else if(j>1){
				y=(2*j)+3;}
			else if(j<=1||j>=-1){
				y=(j*j*j)+(3*j)-3;}
		return y;
	}
}
