public class array {
    public static void main(String [] args){
        int even_count=0, odd_count=0;
        for (int i=0; i<args.length; i++) {
            int val = Integer.parseInt(args[i]);
            if (val%2==0){

                even_count +=1;
            }
            else{
                odd_count +=1;
            }

              }
        System.out.println("even count :" + even_count);
        System.out.println("odd count :" + odd_count);
        

    }
}