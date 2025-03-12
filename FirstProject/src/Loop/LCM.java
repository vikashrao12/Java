package Loop;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int first = sc.nextInt();
        System.out.print("Enter the number: ");
        int second = sc.nextInt();
        System.out.println("LCM  "+first +" and "+ second +" is:"+lcmIs(first ,second));
    }
    public static int lcmIs(int first , int second){
        int i = 1;
        while(true){
            int factor = first * i;
            if (factor%second==0){
                return factor;
            }
            i++;
        }
    }
}
