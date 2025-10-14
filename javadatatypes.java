/* Question: 
Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):
A byte is an 8-bit signed integer.
A short is a 16-bit signed integer.
An int is a 32-bit signed integer.
A long is a 64-bit signed integer.
Given an input integer, you must determine which primitive data types are capable of properly storing that input.
*/

import java.util.*;
import java.io.*;

public class javadatatypes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of testcases: ");
        int x = sc.nextInt();

        for(int i = 0; i< x; i++){
            try{
                System.out.print("enter your number");
                long n = sc.nextLong();
                System.out.println(n + "can be fitted in: ");

                if(n >= Byte.MIN_VALUE && n<= Byte.MAX_VALUE ){
                    System.out.println("* byte");
                }if(n >= Short.MIN_VALUE && n<= Short.MAX_VALUE ){
                    System.out.println("* short");
                }if(n >= Integer.MIN_VALUE && n<= Integer.MAX_VALUE ){
                    System.out.println("* int");
                }if(n >= Long.MIN_VALUE && n<= Long.MAX_VALUE ){
                    System.out.println("* long");
                }
                
            }
            catch(Exception e){
                String badInput = sc.next();
                System.out.println(badInput + " can't be fitted anywhere.");
            }
        }
        sc.close();
        

    
}
    
}