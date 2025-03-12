package TernaryOprator;

import java.util.Scanner;

public class OddEvenTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int num = sc.nextInt();
        OddEvenTernary ternary = new OddEvenTernary();
        String result  = ternary.OddEven(num);
        System.out.println(result);

    }

    public String OddEven(int num){
        String result = num % 2 == 0 ? "your number is Even " : "Your number is Odd";
        return  result;
    }
}
