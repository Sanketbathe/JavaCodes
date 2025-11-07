import java.util.HashMap;
import java.util.Scanner;


public class CharacterCount {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your String");
        String text  = sc.nextLine();

        String lowerCase =text.toLowerCase();

        HashMap<Character, Integer> count=new HashMap<>();

        for(char c:lowerCase.toCharArray()){
            count.put(c, count.getOrDefault(c, 0)+1);
        }
        System.out.println(count);

    }
}
