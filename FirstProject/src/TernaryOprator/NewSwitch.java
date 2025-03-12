package TernaryOprator;

import java.util.Scanner;

public class NewSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the day in number :");
        int day = sc.nextInt();
        NewSwitch(day);
    }

    public static void NewSwitch( int day){

        String dayStr = switch (day){
            case 1  -> "monday ";
            case 2 -> "tuesday";
            case 3 -> "wednesday";
            case 4 -> "thursday";
            case 5 -> "friday";
            case 6 -> "saturday ";
            case 7 -> "sunday ";
            default ->  "not valid";
        };
        System.out.println(dayStr);

    }
}
