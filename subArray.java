public class subArray {
    public static void printSub(int number[]){
        int curSum =0;
        int maxSum = Integer.MIN_VALUE;
        int tp =0;
        for(int i =0;i<number.length;i++){
            int start = i;
            for(int j=i;j<number.length;j++){      
                int end =j;
                curSum =0;
                for(int k = start;k<=end;k++){
                    //int sum = 0;
                    curSum += number[k];
                    System.out.print(number[k]+" ");
                    

                }
                System.out.print("sum of subarray is:" + curSum);
                if (maxSum<curSum) {
                    maxSum = curSum;      
                }
                tp++;
                
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Max sum od sub array is:"+ maxSum);
        System.out.println("total sub array is:" + tp);
        
    }
    public static void main(String[] args) {
        int number[]= {2,4,6,8,10};
        printSub(number);
    }
    
}
// time complex is big of n cude. 
// time complex is not good
