import java.util.Scanner;
import javax.swing.*;
public class mytask {
    public static void main(String [] args){
        Scanner in =new Scanner(System.in);
        int count=0;
        while (true) {
            System.out.println("enter the first num  : ");
            int num1 =in.nextInt();
            if (num1==-1){
                break;
            }
            else count+=1;
            System.out.println("enter the second num  : ");
            int num2 =in.nextInt();
            System.out.println("sum is   : " + num1+num2);
            System.out.println("operation performed  "+ count +"times");
        }
        


    }
    
}
