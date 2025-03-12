package TernaryOprator;

import java.util.Scanner;

public class sumPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i  =  0 ; i<size;i++){
            System.out.print("enter the elements :");
            arr[i] = sc.nextInt();
        }

        System.out.println("sum of positive number is : " + sumPositive(arr));

    }

    public static long sumPositive(int[] arr){
        long  sum = 0;
        for (int num : arr){
            if (num<0){
                continue;
            }
            sum += num;
        }
        return sum;

    }
}
