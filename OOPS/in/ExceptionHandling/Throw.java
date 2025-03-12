package in.ExceptionHandling;

import java.util.Scanner;

public class Throw {
    public static void main(String[] args) {
        a();

    }

    private static void a(){
        b();

    }

    private static void b(){
        c();

    }

    private static void c(){
        d();

    }

    private static void d(){
        Scanner sc  = new Scanner(System.in);
        System.out.print("enter the first  number : ");
        int num1 = sc.nextInt();
        System.out.print("enter the second number : ");
        int num2 = sc.nextInt();


        try {
            int [] arr = new int[5];
            System.out.println(arr[6]);

            int result = num1 / num2;
            System.out.printf("Result is  : %d ", result);
        }
        catch (ArithmeticException exception){
             System.out.println("Divide by zero , please enter valid value ");

            System.out.printf("%s enter valid value " ,exception.getMessage());
        }


        catch (Throwable ex){
            System.out.println("General exception  ");
            throw ex;
        }


    }
}
