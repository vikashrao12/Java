package MultiTheading;

public class ThiredTask extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <=1000 ; i++) {
            System.out.printf("%d# ",i);
        }
        System.out.printf(" # %s task complete ",Thread.currentThread().getName());
    }
}
