package Numbers;

public class DiceLudo {


    int roll(){
        double random = Math.round(Math.random()*6);
        return  (int)random;
    }
    public static void main(String[] args) {

        DiceLudo dice = new DiceLudo();
        for (int i = 0; i <10 ; i++) {
            System.out.println(dice.roll());
        }

    }
}
