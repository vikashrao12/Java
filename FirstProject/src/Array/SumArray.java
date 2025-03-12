package Array;

public class SumArray {
    public static void main(String[] args) {
        int [] arr = {45,5,5,46,48,25,66,55,89,98,23,31,21};
        System.out.println("Sum of all array are :"+sum(arr));

    }
    public static int sum(int [] arr){
        int sum = 0;
        int  i = 0 ;
        while(i < arr.length){
            sum = sum + arr[i];
            i++;
        }
        return sum ;
    }
}
