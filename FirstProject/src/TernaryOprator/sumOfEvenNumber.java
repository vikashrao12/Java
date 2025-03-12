package TernaryOprator;

import java.util.Scanner;

public class sumOfEvenNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number of elements : ");
        int size  = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0 ; i<size; i++){
            System.out.print("enter the elements :");
            arr[i] = sc.nextInt();
        }

        System.out.println("sum of even number is : "+sumOfEven(arr) );

    }
    public static int sumOfEven(int [] arr){
        int sum = 0 ;
        for (int num : arr){
            if (num%2 == 1){
                continue;

            }
            sum  += num;
        }
        return sum;

    }
}
