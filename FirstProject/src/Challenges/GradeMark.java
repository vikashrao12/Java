package Challenges;

import java.util.Scanner;

public class GradeMark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Hindi Marks :");
        float hindi = sc.nextFloat();
        System.out.print("Enter your Hindi Marks :");
        float english = sc.nextFloat();
        System.out.print("Enter your Hindi Marks :");
        float math = sc.nextFloat();
        System.out.print("Enter your Hindi Marks :");
        float physics = sc.nextFloat();
        System.out.print("Enter your Hindi Marks :");
        float chemistry = sc.nextFloat();
        float avg = (hindi+english+math+physics+chemistry)/5;
        System.out.println("your percentage is "+avg);
        if (avg>=90){
            System.out.println("Your Great Is A+");
        }
        else if (avg>=75) {
            System.out.println("Your Great is B ");
        }
        else if (avg>=60) {
            System.out.println("Your Great is C");
        }
        else if (avg>=30) {
            System.out.println("Your Great is D");
            System.out.println("Sorry Your are Fail");

        }
        else {
            System.out.println("sorry you are fail");
        }
    }
}
