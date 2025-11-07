public class SecondLargest {
    public static void main(String[] args) {
        int[] marks = {2,3,4,1,8,9};

        int largest = 0;
        int secondLargest = 0;

        for (int i : marks){
            if (i>largest){
                secondLargest= largest;
                largest= i;
            }
            
        }
        System.out.println("largest Element = "+ largest);
        System.out.println("second Largest Element = "+ secondLargest);
    }
}
