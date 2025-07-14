import java.util.Scanner;

public class BasicStrr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your First name: ");
        String firstName = input.next();
        System.out.print("Enter your last name: ");
        String LastName = input.next();
        String FullName = firstName + " " + LastName;
        System.out.println(FullName);
        Countletter(FullName);
        input.close();
    }
    
    public static void Countletter(String str){
        for(int i=0 ;i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
}
