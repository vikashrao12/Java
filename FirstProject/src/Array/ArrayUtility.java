package Array;

import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number Of  Elements  : ");
        int size = sc.nextInt();
        int [] arr = new int [size];
        int i =0;
        while (i<size){
            System.out.print("Please enter your elements "+(i+1)+" :");
            arr[i] = sc.nextInt();
            i++;

        }
        return arr;
    }


    public static void showArray(int [] arr){
        int i=0;
        while(i< arr.length){
            System.out.print(arr[i] +" ");
            i++;
        }
    }

    public static int[][] input2DArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows :");
        int rows = sc.nextInt();
        System.out.print("enter the number column :");
        int column = sc.nextInt();
        int [][] newArr = new int[rows][column];
        int i  = 0;
        while (i<rows){
            int j = 0;
            while (j<column){
                System.out.print("enter the row " + (i+1) + ": column " + (j+1) + " :");
                newArr[i][j] = sc.nextInt();
                j++;
            }
            i++;
        }
        return newArr;
    }
}
