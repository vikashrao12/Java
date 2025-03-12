package Loop;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        pattern(num);
        System.out.println();
        pattern2(num);
    }
    public static void pattern(int num){
        int rows = 0;
        while(rows<num){
            System.out.print("*");
            int i = 0;
            while(i<rows){
                System.out.print(" *");

                i++;
            }
            System.out.println();
            rows++;
        }


    }
    public static void pattern2(int num){
        int rows =num;
        while(rows>0){
            int i=0;
            while(i<rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows--;
        }
    }
}
