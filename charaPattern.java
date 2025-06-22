public class charaPattern {
    public static void main(String[] args) {
        char ch ='A';
        int n = 4;
        for(int line = 1; line<=n; line++){
            for(int cha = 1;cha<=line;cha++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    
}
