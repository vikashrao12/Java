package Array;

import java.util.Scanner;

public class OccurrencesForEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("enter the elements " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the number you want to find occurrence : ");
        int num = sc.nextInt();
        System.out.println("you number is occurrence is "+ occurrence(arr,num));

    }

    public static int occurrence(int[] arr, int num) {
        int occ = 0;
        for (int num2 : arr) {
            if (num == num2) {
                occ++;

            }
        }
        return occ;

    }
}
