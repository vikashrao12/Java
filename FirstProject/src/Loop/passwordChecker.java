package Loop;

import java.util.Scanner;

public class passwordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass;
        do {
            System.out.print("enter the password : ");
             pass = sc.next();
        }
        while(!isValidPass(pass));
            System.out.println("Thank you your is correct  ");



    }
    public static boolean isValidPass( String pass){
        return  pass.length()>=6;

    }
}
