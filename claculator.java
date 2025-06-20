import java.util.Scanner;

public class claculator {
    public static void main(String[] args) {
        System.out.println("Welcome  to calculator.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number : ");
        int num2 = input.nextInt();
        System.out.print("Enter Your Operator: ");
        char operator = input.next().charAt(0);

        switch (operator) {
            case '+': System.out.println(num1 + num2);
                break;
            case '-': System.out.println(num1 - num2);
                break;
            case '*': System.out.println(num1 * num2);
                break;
            case '/': System.out.println(num1 / num2);
                break;
            case '%': System.out.println(num1 % num2);
                break;
                
                
        
            default: System.out.println("now use your own mind on St");
                break;
        }
        input.close();

    }
    
}
