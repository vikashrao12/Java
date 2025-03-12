package Practice;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number :");
        int num = sc.nextInt();
        pattern1(num);

    }
    public static void pattern1(int num){
        int i = 0;
        while(i<num){
            System.out.print("* ");
                 int j = 0;
                while(j<i){
                    System.out.print("* ");
                    j++;
            }
                i++;
            System.out.println();
        }
    }
}
