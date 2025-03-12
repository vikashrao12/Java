package Array;

import java.util.Scanner;

public class FindNumIn2DArray {
    public static void main(String[] args) {
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
        System.out.println("enter the number you want find :");
        int num  = sc.nextInt();

      boolean isFound  = FindNum(newArr,num);
      if (isFound){
          System.out.println("your number has found ");
      }
      else {
          System.out.println("your number has not found ");
      }

    }

    public static boolean FindNum(int [][] newArr , int num ){
        int i  = 0;
        while (i<newArr.length){
            int j = 0 ;
            while (j<newArr[i].length){
                if (newArr[i][j] == num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
