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
    public static void flody_triangle(int n){
        int counter =1;
        for(int i = 1;i <=n;i++){
            //inner = how many time will counter be porinted
            for(int j = 1; j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void zeo_one_triangle(int n){
        for(int i = 1;i <=n ;i++){ // for row
            for(int j =1;j<=i;j++){// for coloum
                if ((i+j)%2==0) {
                    System.out.print("1");
                    
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void butterfly(int n){
        // 1 st half
        for(int i= 1; i<=n;i++){ // for line
            // for star
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            //for space
            for(int j = 1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }//for 2 half
        for(int i =n;i>=1;i--){
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }for(int j =1;j<=2*(n-i);j++){
                System.out.print(" ");
            }for(int j= 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
       // Inverted(10);
       //inverted_half_pyramid(5);
       //flody_triangle(5);
      // zeo_one_triangle(5);
      butterfly(4);
    }
    
}
