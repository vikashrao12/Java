package Loop;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        System.out.println("Welcome to the table");

        Scanner sc=  new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int i =1;
        while(i<=10){
            System.out.println(num +" x "+ i +" = " + num*i);
            i++;
        }

    }
//     public static int input(){
//         Scanner sc=  new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int num = sc.nextInt();
//         return num;
//     }
////     public static int table(){
////        while()
////     }
//     public static void greet(){
//         System.out.println("Welcome to the table");

     }
