import java.util.Scanner;

public class binaryToDecimal {
    public static void BinToDec(int binNum){
        int myNum = binNum;
        int power =0;
        int decNum =0;
        while (binNum>0) {
            int lastDigit = binNum%10;
            decNum = decNum +(lastDigit * (int)Math.pow(2, power));

            power++;
            binNum = binNum/10;
            
        }
        System.out.println("Decimal number  of  Binary number " + myNum + " is :" + decNum);
        }
        public static void DecToBin(int deciNum){
            int myNum = deciNum;
            int bin = 0;
            int pow = 0;
            while (deciNum>0) {
                int  rem = deciNum%2;
                bin = bin + (rem*(int)Math.pow(10, pow));
                pow++;
                deciNum = deciNum/2;
            }
            System.out.println("Binary number of decimal number " + myNum + " is :" + bin);
        }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("NOTE: Binary number Are in the form of only and 1");
            System.out.print("Enter Your Binary Number: ");
            int binNum = input.nextInt();
            

            BinToDec(binNum);
            System.out.print("Enter Your Decimal Number: ");
            int deciNum = input.nextInt();
            DecToBin(deciNum);
            input.close();
        }
    }
    

