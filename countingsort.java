public class countingsort {
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void countsort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[]= new int[largest+1];
        // new keyword is used for heap memory
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while (count[i]>0) {
                arr[j]= i;
                j++;
                count[i]--;
                
            }
        }
    }
    public static void main(String[] args) {
        int arr[]= {1,2,5,4,2,6,4,8,1,5,6,};
        // time complexcity is O(n+range) if maximum number is less it give a linear time complexty
        countsort(arr);
        printarr(arr);
    }
    
}
