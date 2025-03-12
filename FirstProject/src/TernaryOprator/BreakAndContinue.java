package TernaryOprator;

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 1 ; i<=1000; i ++){
            if (i == 10){
                break;
            }
            System.out.print(i);
        }
        System.out.println();

        for (int i = 1 ;i<=10; i++){
            if (i == 3 ){
                continue;
            }
            System.out.print(i);
        }
    }
}
