package TernaryOprator;

import java.util.Scanner;

public class BreakSpecificNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number you want to break the loop : ");
        int num  = sc.nextInt();
       for (int i =1; true; i++ ){
           System.out.println(i);
           if (i == num){
               break;
           }
       }
    }
}
