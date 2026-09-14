package day01;
import java.util.*;
public class userinput {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();


        int age=sc.nextInt();
        double height=sc.nextDouble();
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);



    }
}
