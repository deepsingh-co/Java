public class primeFun {
    //public static boolean isPrime(int n){
//
    //    if(n==2){ // corner case
    //        return true;
    //    }
    //    
    //    for(int i = 2;i<=n-1;i++){
    //        if (n % i==0) { // completely dividing
    //            return false;
    //        }
    //    }
    //    return true;
//
    //}
    public static boolean isPrime(int n){
        if ( n == 2){
            return true;
        }
        for(int i = 2 ; i<=Math.sqrt(n);i++){
            if (n % i ==0) {
                return false;
                
            }
        
        }
        return true;
    }
    public static void rangeInPrime( int n){
        for(int i = 2; i<=n;i++){
            if (isPrime(i)) {
                System.out.print(i+" ");
                
            }
        }
        System.out.println();
    }
      public static void main(String[] args) {
        rangeInPrime(100);
      }  

}
    

