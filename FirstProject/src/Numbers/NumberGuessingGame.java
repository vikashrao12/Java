package Numbers;

import java.util.Scanner;

public class NumberGuessingGame {
        int random;
          NumberGuessingGame() {
            random = (int)Math.round(Math.random() * 100);

    }

    int guess(int guessing){
              return guessing - random;
    }

    public static void main(String[] args) {

        NumberGuessingGame gu = new NumberGuessingGame();

        Scanner sc = new Scanner(System.in);
        for (int i = 1; true; i++) {
            System.out.print("enter the number ");
            int num = sc.nextInt();
            int result = gu.guess(num) ;

            if (result == 0 ){
                System.out.println("congratulation , your number is correct ");
                break;
            }
            else if (result > 0){
                System.out.println(" please guess lower number ");

            }
            else {
                System.out.println(" please guess higher number ");

            }
        }
        System.out.println("Computer choice number is "+gu.random);


    }
}
