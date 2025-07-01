public class reverse {
    public static void revers_num(int number[]){
        int start=0 , last =number.length-1;
        while (start<last) {
            int temp = number[last];
            number[last]= number[start];
            number[start] = temp;

            start++;
            last--;
            
        }

    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12,14,16,18,20};
        revers_num(number);

        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();

    }
    
}
