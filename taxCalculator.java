import java.util.Scanner;

public class taxCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to Income Tax Calculator.");
        System.out.print("Please Enter Your Income:");
        Scanner input = new Scanner(System.in);
        float income = input.nextFloat();
        if (income<500000) {
            System.out.println("You have to pay 0 Rupess");
         }else if (income>500000 && income<1000000) {
            System.out.println("You Hvae to Pay 20% of income , which is : "+(income*0.2));
         }else{
            System.out.println("You Have to pay 30% of income , which is : "+ (income*0.3));
         }
         input.close();

    }
}
