package Practice;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements :");
        int size = sc.nextInt();
        int [] arr = new int[size];
        int i = 0;
        while (i<size){
            System.out.print("enter the elements :");
            arr[i] = sc.nextInt();
            i++;
        }
         reverse(arr);
        show(arr);
     }

     public static void reverse(int[] arr){
        int i = 0;
        while (i< arr.length/2){
            int swap = arr[i];
            arr[i] = arr[(arr.length-1)-i];
            arr[(arr.length-1)-i] = swap;
            i++;
        }
     }
     public static void show(int [] arr){
         int i = 0;
         while (i< arr.length){
             System.out.print(arr[i] + " ");
             i++;
         }
     }
}
