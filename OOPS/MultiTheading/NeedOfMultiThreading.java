package MultiTheading;

public class NeedOfMultiThreading {
    public static void main(String[] args) {
         long startTime = System.currentTimeMillis();

        for (int i = 1; i <=1000 ; i++) {
            System.out.printf("%d* ",i);
        }
        System.out.println(" *  task complete ");

        for (int i = 1; i <=1000 ; i++) {
            System.out.printf("%d$ ",i);
        }
        System.out.println(" $  task complete ");

        for (int i = 1; i <=1000 ; i++) {
            System.out.printf("%d# ",i);
        }
        System.out.println(" #  task complete ");

        long endTime = System.currentTimeMillis();

        System.out.printf(" total time is  %d ", (endTime-startTime));
    }
}
