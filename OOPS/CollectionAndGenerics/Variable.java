package CollectionAndGenerics;

import java.util.Scanner;

public class Variable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number : ");
        int first = sc.nextInt();
        System.out.print("enter the second number :");
        int second = sc.nextInt();
        System.out.print("enter the number you want to add : ");
        int num = sc.nextInt();
        int num2;
        for (int i = 0; i < num; i++) {
            System.out.print("enter the numbers ;");
            num2 = sc.nextInt();

        }

        System.out.println(sum(first,second,num));
    }

    public static int sum(int first,int second ,int ... a){
        int sum = first+second ;
        for (int i : a) {
            sum += i;

        }
        return sum;
    }
}
