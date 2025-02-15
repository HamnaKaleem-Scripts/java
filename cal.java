import javax.swing.*;
import java.util.*;
public class cal {
    
    public static void main (String[] args ){
        Scanner in =new Scanner(System.in);
        char operator=args[0].charAt(0);
        System.out.println("enter the first num  : ");
        int num1 =in.nextInt();
        System.out.println("enter the sec num  : ");
        int num2=in.nextInt();
        
        int result=0;
        if (operator == '+') {
             result = num1 + num2;
        } else if (operator == '-') {
             result = num1 - num2;
        } else if (operator == '*') {
             result = num1 * num2;
        } 
        System.out.println("your result is : " + result);
      

        in.close();



    }
}
    