package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class surpriseDebate {
    public int findLowestRollNumber(int a, int [] b , int c ){
        Arrays.sort(b);
        int lowestNumber = Integer.MAX_VALUE;
         for (int i = 0 ; i<a/2; i++){
             int sum = b[i] + b[a- 1-i];
             if (sum % c == 0){
                 lowestNumber = Math.min(lowestNumber,b[i]);
             }
         }

         if (a %2==1){
             int lastStudent = b[a/2];
             if ((2* lastStudent)%c ==0){
                 lowestNumber = Math.min(lowestNumber,lastStudent);
             }
         }

        return (lowestNumber == Integer.MAX_VALUE) ? -1 : lowestNumber;

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the number  a : ");
        int a = sc.nextInt();
        int [] b = new int[a];

        for (int i = 0 ; i<a ;i++){
            System.out.print("enter the roll number " +(i+1)+ " :");
            b[i] = sc.nextInt();
        }
        System.out.print("enter c :");
        int c = sc.nextInt();
        sc.close();

        surpriseDebate obj = new surpriseDebate();
        int result = obj.findLowestRollNumber(a,b,c);
        System.out.println("lowest selected roll number is : " +result);
    }
}
