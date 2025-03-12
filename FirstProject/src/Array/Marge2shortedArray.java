package Array;

import java.util.Scanner;

public class Marge2shortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements :");
        int size = sc.nextInt();
        int [] arr1 =  new int[size];
        int i = 0;
        while (i<size){
            System.out.print("enter the element " + (i+1) + " : ");
            arr1[i] = sc.nextInt();
            i++;
        }
        System.out.print("enter the number of elements :");
        int size2 = sc.nextInt();
        int [] arr2 = new int[size2];
        int j = 0;
        while (j<size2){
            System.out.print("enter the element " + (j + 1) + " : ");
            arr2[j] = sc.nextInt();
            j++;
        }
        int [] newArr = margeArr(arr1,arr2);
        System.out.println("your marge Array is : "+ newArr);
        show(newArr);


    }
    public static void show(int [] arr){
        int i = 0;
        while (i<arr.length){
            System.out.print(arr[i] + " ");
            i++;
        }
    }
    public static int [] margeArr(int [] arr1 , int [] arr2){
        int[] newArr = new int[arr1.length+ arr2.length];
        int  i = 0,j = 0, k = 0;
        while (i< arr1.length || j<arr2.length){
            if ( j == arr2.length||
                    i< arr1.length && arr1[i] < arr2[j]){
                newArr[k] = arr1[i];
                i++;
                k++;
            }
            else {
                newArr[k] = arr2[j];
                j++;
                k++;
            }

        }
        return newArr;

    }
}
