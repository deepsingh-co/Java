public class spiral {
    // this is concept of 2D array 

    // the spiral is a very logical and classical question which is ask in verious company like google abode goldma stack and many more
    // This is very imp question

    public static void main(String[] args) {
        int matrix [][] = {{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}};
                            spiralqu(matrix);
    }

    

    public static void spiralqu(int matrix[][]){

        int startRow =0;
        int startCo = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while (startRow<=endRow && startCo<=endCol) {
            // for top
            for(int j =startCo ; j<=endCol;j++){
                System.out.print(matrix[startRow][j] + " ");
            }

            // for right 

            for(int i = startRow;i<=endRow;i++){
                System.out.print(matrix[i][endCol] + " ");
            }

            //for bottom

            for(int j =endCol-1 ; j>=startCo;j--){
                if (startRow == endRow) {
                    break;
                    
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // for left 

            for(int i =endRow-1;i>=startRow+1;i--){
                if (startCo == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCo]+" ");
            }
            startCo++;
            startRow++;
            endCol--;
            endRow--;
            
        }
        System.out.println();

    }
    
}
