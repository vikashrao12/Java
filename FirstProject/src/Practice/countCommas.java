package Practice;

import java.util.Scanner;

public class countCommas {
    public int countCom(int N){
        int totalCommas = 0 ;
        for (int i =0; i <= N; i++){
            String number = String.valueOf(i);
            int length = number.length();

            if (length>3){
                int commas = (length-1)/3;
                totalCommas += commas;
            }
        }
        return totalCommas;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number :");
        int N =sc.nextInt();
        sc.close();;
        countCommas obj = new countCommas();

        int result = obj.countCom(N);
        System.out.println("total commas used :" + result);
    }
}
