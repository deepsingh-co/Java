public class hollowPttern {
    public static void hollow_rectangle(int totRow , int tolCol){
        for(int i=1;i<=totRow;i++){
            for(int j=1;j<=tolCol;j++){
                if (i == 1 || i==totRow || j == 1|| j == tolCol) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");

                }
            }
            System.out.println();
        }
    }
    public static void solid_rhombus(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j =1 ;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollow_rhombus(int n){
        for(int i =1 ; i<=n ;i++){
            for(int j = 1;j<=(n-i);j++){ // for space
                System.out.print(" ");
            }
            for(int j = 1;j<=n;j++){
                if(i==1 || i == n || j==1 || j==n) {
                    System.out.print("*");
                
                }else{
                    System.out.print(" ");
                }

        }
        System.out.println();
        
        }
    }
    public static void diamond_pattern(int n){
        for(int i = 1; i<=n;i++){
            for(int j = 1;j<=(n-i);j++){
                System.out.print(" ");
            }for(int j = 1; j<=(2*(i-1)+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n;i>=1;i--){
            for(int j = 1;j<=(n-i);j++){
                System.out.print(" ");
            }for(int j =1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void number_pattern(int n){
        for(int i=1; i<=n;i++){
            for(int j = 1;j<=(n-i);j++){
                System.out.print(" ");
            }for(int j =1 ; j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void palindromic_pattern(int n ){
        for(int i =1;i<=n;i++){
            for(int j = 1;j<=(n-i);j++){ // for space 
                System.out.print(" ");
            }for(int j =i; j>=1;j--){ // for descending order
                System.out.print(j);
            }for(int j =2;j<=i;j++){ // for ascending order
                System.out.print(j);

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
       // hollow_rectangle(4, 5);
       // solid_rhombus(5);
       // hollow_rhombus(5);
       // diamond_pattern(10);
       // number_pattern(5);
       palindromic_pattern(3);
    
    }
}
