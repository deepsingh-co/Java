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
    public static void main(String[] args) {
        hollow_rectangle(4, 5);
    }
}
