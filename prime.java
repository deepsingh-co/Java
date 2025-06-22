import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();

        if (num == 2) {
            System.out.println("num is prime");
            
        }else{
            boolean isPrime = true;
            for(int i = 2; i<=Math.sqrt(num);i++){
                if (num % i ==0) {  // n is multiply of i ( i not equal to 1 aur other)
                    isPrime = false;     
                }
            }
            if (isPrime == true) {
                System.out.println("Num is prime");
            
            }else{
                System.out.println("Its is not Prime");
            }
            input.close();

        }

        
    }
}
