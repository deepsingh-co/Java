public class linear_array {
    public static int linearSearch(int number[],int key){
        for(int i =0;i<number.length;i++){
            if(number[i]== key){
                return i;
            }
        
        }
        return -1;
    }
    public static String Hotel_menu(String menu[], String dish){
        for(int i =0;i<menu.length;i++){
            if (menu[i]==dish) {
                 return "item find : "+ menu[i];
            }
        }
        return "Item not found";
    }
    public static void main(String[] args) {
        
        String menu[]= {"Dosa","Panipuri","Samosa","chole","Dahi kachori"};
        String dish = "Pani";

        String index_menu = Hotel_menu(menu, dish);
        System.out.println(index_menu);
        


        int number[] ={2,4,6,8,10,12,14,16,18}; 
        int key = 154;
        int index = linearSearch(number, key);
        if (index==-1){
           System.out.println("Not FOund");
      
      }else{
      System.out.println("key Is at index of : "+index);
        }
    }
    
}
