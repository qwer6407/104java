import java.util.Scanner;
public class array0817 {

	/**
	 * @param args
	 *///(data[i][0]+data[i][1]+data[i][2]+data[i][3]+data[i][4])/5)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入幾位同學");
		int n=scn.nextInt();
		//int m=scn.nextInt();
		float data[][]=new float[n][7];
		String name[]=new String[n];
		for(int i=0;i<n;i++){
			System.out.print("請輸入第"+(i+1)+"位的名字");
			name[i]=scn.next();
			System.out.print("請輸入成績");
			//data[i][scn.nextInt()]=scn.nextFloat();
			int m=5;
			data[i][0]=scn.nextFloat();
			data[i][1]=scn.nextFloat();
			data[i][2]=scn.nextFloat();
			data[i][3]=scn.nextFloat();
			data[i][4]=scn.nextFloat();
			data[i][5]=(data[i][0]+data[i][1]+data[i][2]+data[i][3]+data[i][4]+data[i][5])/5;
			System.out.print("平均為"+data[i][5]);
			data[i][6]=(data[i][0]+data[i][1]+data[i][2]+data[i][3]+data[i][4]+data[i][5]);
			System.out.print("總分為"+data[i][6]);
			//data[i][6]=0;
			//for(data[i][6]=scn.nextFloat();data[i][6]<1000000000;data[i][6]++)
			//System.out.print("全班平均為"+(data[i][6])/n);
			if(((data[i][0]+data[i][1]+data[i][2]+data[i][3]+data[i][4])/5)<60){
				System.out.println("第"+(i+1)+"位同學不及格");				
			}
		}//總分要如何全部加起來?
	}
}
				
		
					
	

