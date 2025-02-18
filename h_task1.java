public class h_task1{
	public static void main(String[] args){
		int min=Integer.parseInt(args[0]);
		int max=0;
		
		
		System.out.print("your input array is : [");
		for (int i =0 ;i<args.length;i++){
			System.out.print(args[i]+ " ");
		}
		System.out.println ("]");
		
		
		for (int i=0 ;i<args.length;i++){
			int val = Integer.parseInt(args[i]);
			if (val<min) {
				min=val;
			}
		    if (val>max){
				max=val;
			}
		}
		
		System.out.println("maximum number is : "+ max);
		System.out.println("minimum number is : "+ min);
		
	}
}