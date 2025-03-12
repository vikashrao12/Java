package Array;

import java.util.Scanner;

public class Traverse {
    public static void main(String[] args) {
        int [] arr = {45,66,5,46,48,25,66,55,89,98,23,31,21};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to traverse : ");
        int num = sc.nextInt();

        if (traverse(arr,num)){
            System.out.println("your number is in a list ");
        }
        else {
            System.out.println("sorry your number is not in a list ");
        }

    }

    public static boolean traverse(int [] arr , int num){
        int index = 0;
        while(index < arr.length){
            if(arr[index] == num){
                return true;
            }
            index++;
        }
        return false;
    }
}
