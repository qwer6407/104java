import java.util.Scanner;
import java.util.Random;
public class Array02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		Random rnd=new Random();
		int[] data=new int[20];
		for(int i=0;i<20;i++){
			data[i]=rnd.nextInt(21)-11;
			if(data[i]<0){
				System.out.println("�t�Ʀ�"+data[i]);
			}else if(data[i]==0){
					System.out.println("��"+data[i]);
				}else if(data[i]>0){
					System.out.println("���Ʀ�"+data[i]);
				}
			}
		}					
	}
			
	
