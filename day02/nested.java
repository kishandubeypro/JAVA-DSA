import java.util.Scanner;

public class nested {
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);


    System .out.println("Enter Your Age ");
    int age=sc.nextInt();

    System.out.println("Are you an Indian citizen? (yes/no)");
    String citizen = sc.next();


    // condition 
     if(age >= 18) {

            if(citizen.equals("yes")) {
                System.out.println("You are eligible.");
            } else {
                System.out.println("You are not eligible.");
            }

        } else {
            System.out.println("You are underage.");
        }
}    
}
