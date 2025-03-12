package Array;

import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements :");
        int size = sc.nextInt();
        int [] arr = new int[size];
        int i = 0;
        while (i< arr.length){
            System.out.print("Please Enter elements "+(i+1)+ " :");
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.print("Enter the element you want to occurrence or not :");
        int num  = sc.nextInt();

        System.out.println("Your number is occurrence " +occurrence(arr,num) + " times");
    }
    public static int occurrence(int [] arr ,int num){
        int occ = 0;
        int i = 0;
        while(i < arr.length){
            if (arr[i]==num){
                occ++;

            }
            i++;

        }
        return occ;
    }
}
