import java.util.Scanner;
public class method06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		 Scanner n = new Scanner(System.in);
		    System.out.print("請輸入第一個整數：");
		    int a = n.nextInt();		
		    System.out.print(a+"的公因數有");    		
		    for(int i=1 ; i<=a ; i++ ){
		      if( a%i==0 ){    
		    	  System.out.print(i+" ");
		      }
		    }
		    System.out.println("請輸入第二個整數: ");
		    int b=scn.nextInt();
		    System.out.print(b+"的公因數有");
		    for(int j=1;j<=b;j++){
		    	if( b%j==0){
		    		System.out.print(j+" ");
		    	}
		    }
		}   
	}//尚未做完

		
		
	

