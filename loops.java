import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
      //  int num = 0;
      //  while (10>num) {
      //      System.out.println("I love you");
      //      num++;
      //      
      //  }

    //  int num = 1;
    //  while (num<=10) {
    //    System.out.println(num);
    //    num++;
    //    
    //  }
   // int i =1;
   // int sum = 0;
   Scanner input = new Scanner(System.in);
   //System.out.print("Enter your Number : ");
   //int num = input.nextInt();
   // while (i<=num) {
   //     sum+=i;
   //     i++;
        
   // }
   //     System.out.print(sum);

   //FOR LOOPS 

  // for(int i=1; i<=10;i++){
  //  System.out.println(num +"x"+ i +"=" + (num*i) );
  // }
  // for(int i = 1;i<=4;i++){
  //  System.out.println("* * * *");
  // }
  //int rev =0;
  //  while (num>0) {
  //      int lastDigit = num%10;  
  //      rev = (rev *10)+lastDigit; 
  //      num /=10;
  //  }
  //  System.out.println(rev);
  input.close();
  do{
      System.out.println("Enter your Number: ");
      int num =input.nextInt();

      if (num%10 ==0) {
        continue;

      }
      System.out.println("number was : " + num);
    }while(true);
  }

}
