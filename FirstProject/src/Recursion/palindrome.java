package Recursion;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string :");
        String name = sc.next();

        System.out.println("your string is "+ (isPalindrome(name) ? "palindrome" : " Not palindrome "));

    }

    public static boolean isPalindrome(String name ){
        if (name.length() <= 1){
            return true;

        }
        if (name.charAt(0) != name.charAt(name.length() - 1 )){
            return false;

        }
        String newStr =  name.substring(1 ,name.length()-1);
        return isPalindrome(newStr);
    }
}
