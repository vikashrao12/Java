package Practice;

import java.util.Scanner;

public class Utility {
    public static int[] input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements :");
        int size = sc.nextInt();
        int [] arr = new int[size];
        int i = 0;
        while (i<size){
            System.out.print("enter the element " + i + " : ");
            arr[i] = sc.nextInt();
            i++;
        }
        return arr;
    }
    public static void ShowArray(int [] arr){
        int i = 0;
        while (i<arr.length){
            System.out.print(arr[i] + " ");
            i++;
        }
    }


}
