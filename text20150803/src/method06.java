import java.util.Scanner;
public class method06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		 Scanner n = new Scanner(System.in);
		    System.out.print("�п�J�Ĥ@�Ӿ�ơG");
		    int a = n.nextInt();		
		    System.out.print(a+"�����]�Ʀ�");    		
		    for(int i=1 ; i<=a ; i++ ){
		      if( a%i==0 ){    
		    	  System.out.print(i+" ");
		      }
		    }
		    System.out.println("�п�J�ĤG�Ӿ��: ");
		    int b=scn.nextInt();
		    System.out.print(b+"�����]�Ʀ�");
		    for(int j=1;j<=b;j++){
		    	if( b%j==0){
		    		System.out.print(j+" ");
		    	}
		    }
		}   
	}//�|������

		
		
	

