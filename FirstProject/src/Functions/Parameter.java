package Functions;

public class Parameter {
    public static void main(String[] args) {
        int sum = sumTwoNumbers(7,5);
        System.out.println("sum of "+sum);  //argument
        System.out.println(sumTwoNumbers(6,8));
        System.out.println(sumTwoNumbers(-68,68));
    }
     public static  int sumTwoNumbers(int first , int second){
         System.out.println("first number received :"+first);
         System.out.println("second number received :"+second);//parameter
        int sum= first + second;
        return sum;
     }
}
