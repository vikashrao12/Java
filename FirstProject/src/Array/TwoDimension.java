package Array;

import java.util.Scanner;

public class TwoDimension {
    public static void main(String[] args) {
       int [][] arr = {{1,2,3},{4,5,6} ,{7,8,9}};
       int index= 0 ;
       while(index < arr.length){
           int j =0;
           while(j<arr[index].length){
               System.out.print(arr[index][j] +" ");
               j++;
           }
           System.out.println();
           index++;
       }
    }
}
