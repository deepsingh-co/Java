public class invertedPattern {
    public static void Inverted( int totRow){
        for(int i = 1; i<=totRow;i++){ //for line
            for(int j =1;j<=totRow-i;j++){  //for space
                System.out.print(" ");   
            }for(int j =1;j<=i;j++){ // for star
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void inverted_half_pyramid(int n){
        for(int i =1;i<=n; i++){
            for(int j = 1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
       // Inverted(10);
       inverted_half_pyramid(5);
    }
    
}
