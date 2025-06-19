import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        System.out.println("Find Largest Number.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your First number:");
        int num1 = input.nextInt();
        System.out.print("Enter Your Second number:");
        int num2 = input.nextInt();
        System.out.print("Enter Your third number:");
        int num3 = input.nextInt();
        if (num1>=num2 && num1>=num3) {
            System.out.println("Grestest Number is " + num1);
        }else if (num2>num3) {
            System.out.println("Greatest number is " + num2);
        }else{
            System.out.println("Greatest number is "+ num3);
        }
        
    }
}
