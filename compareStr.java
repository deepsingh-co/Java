public class compareStr {
    public static void main(String[] args) {
        String s1 = "Deep";
        String s2 = "Deep";
        String s3 =  new String("Deep");

        if (s1 == s2) {
            System.out.println("String is equal");
        }else {
            System.out.println("String is not found");
        }

        if (s1.equals(s3)) {  // is equal is only check value
            
        
        
       // if (s1 == s3) {  wrong way
            System.out.println("String is equal");
        }else {
            System.out.println("String is not found");
    }
    
    }
}
