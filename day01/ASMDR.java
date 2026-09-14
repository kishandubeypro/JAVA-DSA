package day01;
import java.util.*;
public class ASMDR {
 public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter  your first number");
    int a=sc.nextInt();
    System.out.println("Enter your second number");
    int b=sc.nextInt();


    int sum = a+b;
    int subtract = a-b;
    int multiply = a*b;
    int divide = a/b;
    int remender =a%b;

//System.out.println(sum);
//System.out.println(subtract);
//System.out.println(multiply);
//System.out.println(divide);
//System.out.println("Sum = " + sum);
        System.out.println("sum="+sum);
        System.out.println("subtract = " + subtract);
        System.out.println("multiply = " + multiply);
        System.out.println("divide = " + divide);
        System.out.println("remender="+remender);
        


 }   
}
