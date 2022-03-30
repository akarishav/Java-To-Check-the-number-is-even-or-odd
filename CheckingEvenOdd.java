import java.util.*;
public class CheckingEvenOdd {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check : ");

        //Taking input from the users
        int num = sc.nextInt();

        //Checking for even & odd
        if (num%2==0){
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is an odd number");
        }
    }
}
