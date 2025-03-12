package Loop;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if (isArmstrong(num)){
            System.out.println("your number is Armstrong Number");
        }
        else {
            System.out.println("Your number is not Armstrong Number");
        }
    }

    public static boolean isArmstrong(int num){
        int noOfDigit = noOfDigits(num);
        int numCopy = num;
        int finalNum = 0;
        while (num>0){
            int lastDigit = num%10;
            num /=10;
            finalNum += pow(lastDigit,noOfDigit);
        }
        return finalNum == numCopy;

    }

    public static int pow(int num1,int num2){
        int result = 1;
        int i =0;
        while(i<num2){
            result *= num1;
            i++;

        }

        return result;
    }

    public static int noOfDigits(int num){
        int digit = 0;
        while(num>0){
            digit++;
            num = num/10;


        }

        return digit;
    }
}
