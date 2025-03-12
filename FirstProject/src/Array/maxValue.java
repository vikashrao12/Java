package Array;

import java.util.Scanner;

public class maxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0 ; i<size ; i++){
            System.out.print("enter the elements " + (i+1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("maximum value is your array is : "+isMaxValue(arr) );

    }
    public static int isMaxValue(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int num : arr){
            if (max < num){
                max = num ;
            }
        }
        return  max;



    }
}
