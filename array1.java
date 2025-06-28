public class array1 {
    public static void update (int marks[]){
        for(int i = 0;i<marks.length;i++){
            marks[i]= marks[i]+2;
        }
        
    }
    public static void main(String[] args) {
        int marks[]= {58 , 98,54};
        update(marks); // call funcation
        for(int i =0; i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
    
}
