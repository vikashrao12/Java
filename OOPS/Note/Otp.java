package Note;

import java.util.Scanner;

public class Otp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result  = OtpGan();
        System.out.println(result);
        int num;
//       for (int i =0 ;true ; i++){
//            System.out.println("Enter the OTP : ");
//            int num = sc.nextInt();;
//
//            if ( num  == result){
//                System.out.println("Welcome You Are Login ........ ");
//                break;
//            }
//        }

        do {
            System.out.print("Enter the OTP : ");
            num = sc.nextInt();
             if (num == result){
                 System.out.println("Welcome You Are Login...");
             }
             else if (num != result){
                 System.out.println("Wrong Otp please Try Again ");
             }
        }while (num != result);

    }

    public  static int OtpGan(){
        double otp = Math.floor((Math.random()*5000));
        return (int)otp;

    }
}
