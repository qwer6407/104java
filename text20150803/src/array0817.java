import java.util.Scanner;
public class array0817 {

	/**
	 * @param args
	 *///(data[i][0]+data[i][1]+data[i][2]+data[i][3]+data[i][4])/5)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("�п�J�X��P��");
		int n=scn.nextInt();
		//int m=scn.nextInt();
		float data[][]=new float[n][7];
		String name[]=new String[n];
		for(int i=0;i<n;i++){
			System.out.print("�п�J��"+(i+1)+"�쪺�W�r");
			name[i]=scn.next();
			System.out.print("�п�J���Z");
			//data[i][scn.nextInt()]=scn.nextFloat();
			int m=5;
			data[i][0]=scn.nextFloat();
			data[i][1]=scn.nextFloat();
			data[i][2]=scn.nextFloat();
			data[i][3]=scn.nextFloat();
			data[i][4]=scn.nextFloat();
			data[i][5]=(data[i][0]+data[i][1]+data[i][2]+data[i][3]+data[i][4]+data[i][5])/5;
			System.out.print("������"+data[i][5]);
			data[i][6]=(data[i][0]+data[i][1]+data[i][2]+data[i][3]+data[i][4]+data[i][5]);
			System.out.print("�`����"+data[i][6]);
			//data[i][6]=0;
			//for(data[i][6]=scn.nextFloat();data[i][6]<1000000000;data[i][6]++)
			//System.out.print("���Z������"+(data[i][6])/n);
			if(((data[i][0]+data[i][1]+data[i][2]+data[i][3]+data[i][4])/5)<60){
				System.out.println("��"+(i+1)+"��P�Ǥ��ή�");				
			}
		}//�`���n�p������[�_��?
	}
}
				
		
					
	

