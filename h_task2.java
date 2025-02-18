import java.util.*;
public class h_task2{
	public static void main ( String[] args ){
		
		int num=0;
		Scanner in = new Scanner (System.in);
		System.out.print ("define the ending range : ");
		int val=in.nextInt();
		if (val <0) {
			System.out.println ("an invalid number " );
		}
		System.out.print("armstrong numbers are : [ ");
		for(int i =0 ;i<=val ;i++){
			int sum =0 ;
			int j=i;
			while (j>0){
				num=j%10;
				sum+=(num*num*num);
				j=j/10;
			}
			if (sum==i){
				System.out.print(i + " ");
			}
		}
		System.out.println("]");
		
	}
}