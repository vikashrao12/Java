package in.ExceptionHandling;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("enter the first  number : ");
        int num1 = sc.nextInt();
        System.out.print("enter the second number : ");
        int num2 = sc.nextInt();


        try {


            int result = num1 / num2;  // when we try to divide by zero so we are getting the error and use try catch no getting error its
            // like if else ;
            System.out.printf("Result is  : %d ", result);
        }
        catch (ArithmeticException exception){  // we write the multipal catch block that catch multipal  exception catch
           // System.out.println("Divide by zero , please enter valid value ");
                            //or
            System.out.printf("%s enter valid value " ,exception.getMessage());
        }
       catch (ArrayIndexOutOfBoundsException ex ){
            System.out.println("array is out of bound ");
        }

        catch (Throwable ex){
            System.out.println("General exception  ");
        }
    }
}
