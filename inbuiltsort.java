import java.util.Arrays;
import java.util.Collections;
public class inbuiltsort {

    public static void printarr(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    
    public static void main(String[] args) {
        Integer arr[]= {2,4,5,4,6,8};
        Arrays.sort(arr);
     // this sort the array its is inbuilt short time complexity is good
        Arrays.sort(arr,Collections.reverseOrder());// sort the array in decending order.
        //Note: REverse order work only on objects
        printarr(arr);
    }

    
}

