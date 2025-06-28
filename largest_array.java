public class largest_array {
    public static void main(String[] args) {
        int number[]={1,2,5,7,6,98,5,54,52,59,21,-1,65};
        System.out.println("Largest value is : "+ number_checker(number));
    }

    public static int number_checker(int number[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i =0;i<number.length;i++){
            if (largest< number[i]) {
                largest = number[i];      
            }
            if (smallest> number[i]) {
                smallest = number[i];        
            }
        
            
        }
        System.out.println("Smallest value is :" + smallest);
        return largest;
    }
    
}
