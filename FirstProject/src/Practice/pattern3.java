package Practice;

import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number :");
        int num = sc.nextInt();
        pattern3(num);
    }

    public static void pattern3(int num) {
        int rows = num;
        while (rows > 0) {
            int i = 0;
            while (i < rows - 1) {
                System.out.print("  ");
                i++;
            }
            int j = 0;
            while (j <=(num-rows)){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            rows--;
        }
    }
}
