
import java.util.Scanner;

public class ReverseInt{
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int original= number;
        int reversed=0;

        while(number>0){
            int digit = number%10;
            reversed= reversed*10+digit;
            number=number/10;
        }
    }

}