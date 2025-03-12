package Input;

import java.util.Scanner;

public class functionReturn {
    public static void main(String[] args) {
        int first = read();
        int second = read();
        System.out.println("Sum of the number is :" + (first+second));

    }
    public static int read(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();
        return num;

    }
}
