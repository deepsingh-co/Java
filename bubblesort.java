public class bubblesort {
    public static void bubbleSort(int arr[]){
        for(int turn =0;turn<arr.length-1;turn++){
            boolean swap = false; // if array is shorted and no swapping happen break the code and exit the time complexcity will we big O on n
            for(int j =0;j<arr.length-1-turn;j++){
                if (arr[j]<arr[j+1]) {
                    // swap
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                    swap = true; // if swap happen 
                    
                }
            }
            if (!swap) { // if swap is not change break it and exit the code
                break;
                
            }
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        bubbleSort(arr);
        printarr(arr);
    }
}