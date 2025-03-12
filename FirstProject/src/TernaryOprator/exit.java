package TernaryOprator;

import java.util.Scanner;

public class exit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i =1 ; true ;i++){
            System.out.print("enter the command : ");
            String command = sc.next();
            if (command.equals("exit")){
                break;
            }
        }
        System.out.println("you have successfully exit ");

    }
}
