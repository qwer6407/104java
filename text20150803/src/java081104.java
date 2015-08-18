import java.util.Scanner;
import java.util.Random;
public class java081104{ 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		Random rnd=new Random();
		int[] data=new int[3];
		int max=0;
		int min=101;
		for(int i=0;i<3;i++){
			data[i]=rnd.nextInt(100)+1;
			if(data[i]>max){
				max=data[i];
				System.out.print("最大為"+data[i]);
			}else if(data[i]<min){
				min=data[i];
				System.out.print("最小為"+data[i]);
				}
			}
		}					
	}


				
		
	
	//尚未做完

						
	

