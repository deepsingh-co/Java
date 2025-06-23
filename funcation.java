import java.util.Scanner;

public class funcation {
    //public static void swap(int a , int b){
    //    int temp = a;
    //    a = b;
    //    b = temp;
    //    System.out.println("a = " +a);
    //    System.out.println("b = " +b);
    //}

    public static int multiply(int a , int b){
        int product = a*b;
        System.out.println("Product of a and b is :" + product);
        return product;
    }
    public static void main(String[] args) {
       // int a = 55;
       // int b = 41;
       // swap(a,b);
       Scanner input = new Scanner(System.in);
       System.out.print("Enter your first number: ");
       int a = input.nextInt();
       System.out.print("Enter your second number: ");
       int b = input.nextInt();
       multiply(a,b);
       input.close();
       
    }
}
