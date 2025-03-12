package Practice;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        table();

    }
    public static void table(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to print table : ");
        int num = sc.nextInt();
        int num2 = 1;

        while(num2 <= 10){

            System.out.println( num + "x" + num2 + " = " + (num*num2));
            num2++;
        }

    }

}
