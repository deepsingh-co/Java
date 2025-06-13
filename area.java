import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        System.out.println("Welcome to Area Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  radius of circle: ");
        double num1 = sc.nextDouble();
        double sum = (3.14 * num1 * num1);
        System.out.println("Area of Circle is:" + sum);
        sc.close();

    }
    
}
