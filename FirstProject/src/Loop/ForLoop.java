package Loop;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :");
        int num = sc.nextInt();
        for (int i = 2 ; i<=num ; i+=2){
            System.out.print( i + " ");
        }

    }

}
