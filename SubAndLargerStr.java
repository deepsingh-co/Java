public class SubAndLargerStr {
    public static void main(String[] args) {
        String str = "HelloWorld";
        // This is inbuild function in java to find the subString
        System.out.println(str.substring(0,5));
        System.out.println(ptintSubString(str, 5, 10));


        //larger String
        String fruits[] = {"apple" ,"mango" , "banana"};
        System.out.println(largerStrin(fruits));
    }

    public static String ptintSubString(String str , int si ,int ei ){
        String substr = "";
        for(int i =si;i<ei;i++){
            substr += str.charAt(i);
        }
        return substr;
    }

    public static String largerStrin(String fruit[]){

        String largest  = fruit[0];

        for(int i=0;i<fruit.length;i++){
            if (largest.compareTo(fruit[i])<0) {
                largest = fruit[i];
            }
        }
        return largest; //wilson joynil arekar 

    }
    
}
