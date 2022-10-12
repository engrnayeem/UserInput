package UserInput;

import java.util.Scanner;


public class UserInput {
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        
        int num1,num2,sum;
        
       System.out.print("Enter First Number:");
       num1=sc.nextInt();
       
       System.out.print("Enter Second Number:");
       
       num2=sc.nextInt();
       
       
       sum=num1+num2;
       
       System.out.println("The Addition result is:"+sum);
               
       
       
       
       
    
    }
    
}
