package Practice;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number :");
        int num = sc.nextInt();
        pattern2(num);
    }

    public static void pattern2(int num){
        int rows = num;
        while (rows>0){
                int i = 0;
                while (i<rows){
                    System.out.print("* ");
                    i++;
                }
            System.out.println();
                rows--;

        }


    }
}
