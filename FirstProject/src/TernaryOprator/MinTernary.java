package TernaryOprator;

import java.util.Scanner;

public class MinTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number :");
        int num1 = sc.nextInt();
        System.out.print("enter the second number :");
        int num2 = sc.nextInt();
        MinTernary ternary = new MinTernary();
       int min =  ternary.min(num1,num2);
        System.out.print("your minimum number is : " + min);
    }

    public int min(int num1,int num2){
        int result =  num1 > num2 ? num2: num1;
        return  result;

    }

}
