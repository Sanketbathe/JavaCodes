// class calculator{
//     public int add(int a, int b){
//         int r=a+b;
//         return r;
//     }

//     public int mult(int c,int d){
//         int p=c*d;
//         return p;

//     }

// }



// public class demo {
//     public static void main(String[] args) {
//         int a=4; 
//         int b=5;
//         int c=7;
//         int d=8;

//         calculator calc=new calculator();

//         int result=calc.add(a,b);
//         int product=calc.mult(c,d);
//         System.out.println(result);
//         System.out.println(product);

//     }
// }

// program for finding length of the string with the help of external fuction
// class demo{
//     public static int strlength( String str){
//         int r=str.length();
//         return r;
//     }

//     public static void main(String[] args) {
//         String str="djshgsdh";
//         int result=strlength(str);
//         System.out.println(result);
//     }
// }


//factorial calculation
// class demo{
//     static int mymethod(int number){
//         int r =1;
//         for(int i=1;i<=number;i++){
//             r=r*i;
//         }
//         return r;
//     }
//     public static void main(String[] args) {
//         String name = "sanket";
//         int number= 3;
//         int result=mymethod(number);
//         System.out.println(result);
//     }
// }


// class demo{

//    public static void main(String[] args) {
//      int nums[]={2,4,5,6};
//      int n[]=new int[4];
//      n[1]=4;
//      for(int i:n){
//         System.out.println(i);
//     }

//     for(int i:nums){
//         System.out.println(i);
//     }
//    }
// }


class human{
    private int age = 23;
    private String name = "sanket" ;

    public int getage(){
        return age;
    }

    public String getname(){
        return name;
    }

}
class demo{
    public static void main(String[] args) {
        human obj= new human();
        // obj.name="sanket";
        // obj.age=23;
        System.out.println(obj.getname()+" : "+ obj.getage());
        
    }
}