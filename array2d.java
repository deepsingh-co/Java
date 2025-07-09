import java.util.Scanner;

public class array2d {

    // function for search the number

    public static boolean search(int matrix[][] , int key){
        for(int i=0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(matrix[i][j]== key){
                    System.out.println("Key Is found on index no:" + i +" , "+j);
                    return true;
                }
            }
        }
        System.out.println(" Key value is Not Found");
        return false;
    }

    // function for largest vlaue 

    public static int largestSmallestvalue(int matrix[][] ){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                largest = Math.max(largest,matrix[i][j]);
                smallest = Math.min(smallest, matrix[i][j]);
            }
        }
        System.out.println("Largest value is :" + largest);
        System.out.println("Smallest value is :" + smallest);
        return largest;
    }

    public static void main(String[] args) {
         int matrix[][]= new int [3][3];
         int n =matrix.length , m = matrix[0].length;

         // for input

         Scanner input = new Scanner(System.in);
         System.out.println("Enter the number:");
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]= input.nextInt();
            }
         }

         // for output

         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

         }
         largestSmallestvalue(matrix);
         search(matrix, 4);
    }
}
