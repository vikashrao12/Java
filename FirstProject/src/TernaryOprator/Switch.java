package TernaryOprator;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chose you operator + , - , * , / ,%  ");
        char operator = sc.next().charAt(0);
        System.out.print("enter the first number :");
        double num1 = sc.nextDouble();
        System.out.print("enter the second number :");
        double num2 = sc.nextDouble();
        double result=0;
        OldSwitch(operator,result,num1,num2);


    }

    public static void OldSwitch(char operator,double result ,double num1, double num2) {
        switch (operator) {
            case '+':
                result = (int) num1 + (int) num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;
            case '%':
                result = num1 % num2;
                System.out.println(num1 + " % " + num2 + " = " + result);
                break;
            default:
                System.out.println("Wrong Operator , Please Select Valid Operators ");

        }
    }
}
