import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo {
   public static void main(String[] args) {
       List<Integer> list = Arrays.asList(1,2,3,4,5);

       System.out.println(list.stream().reduce((x,y)-> x+y).get());
   }
}

