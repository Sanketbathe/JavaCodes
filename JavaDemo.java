
import java.util.Arrays;
import java.util.HashMap;

public class JavaDemo{

    public static int add(int a , int b){
            return a+b;
        }
        public static int swap(int a,int b){
            a=a+b;
            b=a-b;
            a=a-b;
            System.out.println(a+" "+ b);
            return b;
        }
        public static boolean isEven(int a){
            if(a%2==0){
                return true;
            }
            else{
                return false;
            }
        }

        public static int  reverseInt(int i) {
        int original=i;
        int reversed=0;
        while(original>0){
            int digit= original%10;
            reversed=reversed*10+digit;
            original=original/10;
        }
        return reversed;

    }
    public static void main(String[] args) {
        System.out.println(add(2,3 ));
        System.out.println(swap(2,3));
        System.out.println(isEven(8));
        System.out.println(reverseInt(123));

        //Hashmap Demo

        String text="banana";
        HashMap<Character, Integer> map= new HashMap<>();
        for (char c: text.toCharArray()) {
            map.put(c, map.getOrDefault(c,0)+1);
        }
        System.out.println(map);



        //array operations

        int sumOfArray=0;

        int[] arr={1,9,8,4,5,6};
        for(int i:arr){
        sumOfArray = sumOfArray + i;
    }
        System.out.println("sum of array = " + sumOfArray);
        Arrays.sort(arr);
        System.out.print("Sorted Array = ");
        for(int i:arr){
           System.out.print(i+" ");
          }
        System.out.println();

//        String a ="Ram";
//        String b ="Ram";
//        String c =new String("Ram");
//        System.out.println(a==b);
//        System.out.println(a==c);
//        System.out.println(a.equals(c));
//
//        int a1=4;
//        int b1= 4;
//        System.out.println(a==b);

        System.out.println(factorial(5));
        System.out.println(sumNatural(5));

    }
//factorial with recursion
    public static int factorial (int n) {

        if (n == 0) {
            return 1;
        }
        return n*factorial(n-1);
    }
    public static int sumNatural(int n) {
        if  (n == 1) {
            return 1;
        }
        return n+sumNatural(n-1);
    }
}


