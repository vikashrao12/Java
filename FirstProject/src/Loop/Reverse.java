package Loop;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("The revere "+num+" is :"+reverse(num));


    }

    public static int reverse(int num){
        int newNum = 0;
        int i = 0;
        while(num>i){
            int digit = num%10;
            newNum = newNum* 10+ digit;
            num = num/10;


        }

        return newNum;

    }

}
