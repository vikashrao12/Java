package Loop;

import java.util.Scanner;

public class ForEachLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of name : ");
        int name = sc.nextInt();
        String [] arr = new String[name];
        for (int i = 0 ; i< arr.length; i++){
            System.out.print("enter the name : ");
            arr[i] = sc.next();
        }
        //PrintArr(arr);
        printArrForEach(arr);
    }

    public static void PrintArrFor( String arr[]){
        for (int i = 0 ; i< arr.length ; i++){
            System.out.println(arr[i]);
        }
    }

    public static void printArrForEach(String arr[]){
        for (String name : arr){
            System.out.println(name);
        }
    }
}
