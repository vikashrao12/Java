package Practice;

import java.util.Scanner;

public class DeleteArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements :");
        int size = sc.nextInt();
        int [] arr = new int[size];
        int i = 0;
        while (i<size){
            System.out.print("enter the elements :");
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.print("enter the element you want to delete :");
        int num = sc.nextInt();

         int [] newArr = deleteArr(arr,num);
        showArr(newArr);
    }
    public static int[] deleteArr(int[] arr , int num ){
        int occ = Occurrence.occurrence(arr,num);
        if (occ == 0){
            return arr;
        }

        int newSize = arr.length-occ;
        int [] newArr = new int[newSize];
        int i = 0;  int j = 0;
        while (i<arr.length){
            if (arr[i] != num){
                newArr[j] = arr[i];
                j++;
            }
            i++;
        }
        return  newArr;
    }
    public static void showArr(int[] newArr){
        int i=0;
        while (i< newArr.length){
            System.out.print(newArr[i] + " ");
            i++;
        }
    }
}
