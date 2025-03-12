package Array;

import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Of Elements :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Enter Your Elements " + (i + 1) + " :");
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.println("Sum of Array is :" + sum(arr));
        System.out.println("Avg of Array is :" +avg(arr));

    }

    public static long sum(int[] arr) {
        long sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum += arr[i];
            i++;
        }
        return sum;
    }

    public static int avg(int[] arr) {
        long average = sum(arr )/ arr.length;
        return (int)average;
    }
}

