import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int marks[] = new int[50];

        Scanner input = new Scanner(System.in);
        marks[0] = input.nextInt();
        marks[1] = input.nextInt();
        marks[2] = input.nextInt();

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        int percentage= (marks[0] + marks[1]+marks[2])/3;
        System.out.println(percentage + "%");
        System.out.println(marks.length);
        input.close();
    }
}
