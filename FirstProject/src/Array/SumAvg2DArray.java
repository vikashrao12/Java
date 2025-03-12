package Array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SumAvg2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows :");
        int rows = sc.nextInt();
        System.out.print("enter the number of column :");
        int column = sc.nextInt();
        int [][]  newArr = new int[rows][column];
        int i =0;
        while (i<rows){
            int j = 0;
            while (j<column){
                System.out.print("enter the row " + (i+1) + "  column " + (j+1) +" : ");
                newArr[i][j] = sc.nextInt();
                j++;

            }
            i++;
        }
        System.out.println("sum of 2D Array is : " + sum2DArray(newArr) );
        System.out.println("Avg of 2D Array is : " + Avg(newArr));
    }

    public static long sum2DArray(int[][] newArr){
        long sum = 0;
        int i = 0;
        while (i<newArr.length){
            int j = 0;
            while (j< newArr[i].length){
                sum += newArr[i][j];
                j++;

            }
            i++;

        }
        return sum;
    }
    public static double Avg(int [][] newArr){
        if (newArr.length == 0){
            return 0;
        }
        int rows = newArr.length;
        int cols = newArr[0].length;
        double size = rows*cols;
        return sum2DArray(newArr) / size;
    }

}
