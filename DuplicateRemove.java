public class DuplicateRemove {

    static int binSearch(int[] array, int n, int key){
        int low = 1;
        int high = n;
        while (low <= high){
            int mid = (low + high)/2;
            if(array[mid] == key) {
                return mid;
            }
            else if(array[mid] < key) {
                System.out.println(mid + " : "+ array[mid]);
                low = mid + 1;
            }
            else {
                System.out.println(mid + " : "+ array[mid]);
                if(array[mid] > key) high = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] array={1,2,5,6,34,46,66,87,98,191};


        int result = binSearch(array, array.length, 2);
        System.out.println("item fount at: "+result);
        System.out.println(array[result]);



        //removing duplicates from array
//        int count=0;
//
//        for (int i=1;i<array.length-1;i++)
//        {
//            if (array[count]!=array[i]){
//                count++;
//                array[count]=array[i];
//            }
//        }
//        for(int i=0;i<=count;i++)
//        {
//            System.out.println(array[i]);
//        }

    }
}
