
import java.util.Scanner;

public class ReverseInt{

    static void  checkReverse(int original , int reversed){
            if(original==reversed){
            System.out.println("number is palindrome");
            }
            else {
                System.out.println("number is not palindrome");
            }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int number = sc.nextInt();

        int original= number;
        int reversed=0;

        while(number>0){
            int digit = number%10;
            reversed= reversed*10+digit;
            number=number/10;
        }

        System.out.println("Original Number: "+ original);
        System.out.println("Reversed Number: "+reversed);

        checkReverse(original, reversed);
        
        }
        

}