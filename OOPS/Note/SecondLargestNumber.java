package Note;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements :");
        int size = sc.nextInt();
        int [] arr = new int[size];
        for (int i = 0 ; i<size ; i ++){
            System.out.print("enter the elements ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for ( int num : arr) {
            System.out.print(" "+num);

        }
        System.out.println();
        int secondL = arr.length-1;
        System.out.println("Your Second Largest Elements is : "+secondL);
    }
}
