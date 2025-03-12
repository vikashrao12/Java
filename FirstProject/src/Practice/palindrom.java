package Practice;

import Input.input;

import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number :");
        int num = sc.nextInt();
        if (palindrom(num)){
            System.out.println("your number is palimdrom");
        }
        else {
            System.out.println("your number is not palimdrom ");
        }


    }
    public static Boolean palindrom(int num){
        return num == reverse(num);
    }

    public static int reverse(int num){
        int rev = 0;
        while(num>0){
            int digit = num %10;
            rev = rev*10 + digit;
            num /= 10;
        }
        return rev;
    }
}
