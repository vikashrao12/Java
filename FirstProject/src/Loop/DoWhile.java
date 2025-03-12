package Loop;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        System.out.print("enter your age:");
//        int age = sc.nextInt();
//        while (age<0 ||age>100){
//            System.out.println("majak mat kro valid age dalo :");
//            age = sc.nextInt();
//        }
//        System.out.println("Your age is : " + age);


        int age;
        do {
            System.out.print("enter your age :");
            age = sc.nextInt();
        }while (age<0 || age>100);
        System.out.println("your age is : " + age);
    }
}
