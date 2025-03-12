package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class secondLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements : ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i<size ; i++){
            System.out.println("enter the element " + (i+1) + " : ");
            arr[i] = sc.nextInt();
        }

    }

    public int secondLargestNumber(int[] arr ){
        int large = arr[0];
        for (int i = 1; i< arr.length ; i++){
            if (arr[0] > arr[i]){
                int swap ;
            }
        }
        return  0 ;

    }

}
