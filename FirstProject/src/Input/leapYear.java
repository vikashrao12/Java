package Input;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Year to check is leap year or not ");
        int year = sc.nextInt();

        if(year % 400 == 0  ){
            System.out.println("your year is leap year ");
        }
        else if (year % 100 ==0) {
            System.out.println("your year is not leap year ");

        } else if (year % 4 == 0) {
            System.out.println("your year is leap year ");

        }
        else {
            System.out.println("your year is not leap year ");
        }
    }
}


//vikash.22scse2150014@gamil.com
//rajputvr9980@gmail.com alka098