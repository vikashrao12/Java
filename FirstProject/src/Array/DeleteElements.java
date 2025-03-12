package Array;

import java.util.Scanner;

public class DeleteElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = ArrayUtility.inputArray();
        System.out.print("Enter the number you want to delete :");
        int noDelete = sc.nextInt();
        int [] newArr =deleteNumber(arr ,noDelete);
        ArrayUtility.showArray(newArr);
    }

    public static int[] deleteNumber(int [] arr,int noDelete){
        int occ = Occurrence.occurrence(arr,noDelete);
        if (occ ==0){
            return arr;
        }
        int newSize = arr.length-occ;
        int [] newArr = new int[newSize];
        int i = 0 ,j=0;
        while(i<arr.length){
            if (arr[i] != noDelete ){
                newArr[j] = arr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
}
