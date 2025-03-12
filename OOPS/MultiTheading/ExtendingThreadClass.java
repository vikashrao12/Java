package MultiTheading;

public class ExtendingThreadClass {
    public static void main(String[] args) {
        long start =  System.currentTimeMillis();

        FirstTask t1 =  new FirstTask();
        SecondTask t2 = new SecondTask();
        ThiredTask t3 = new ThiredTask();

        System.out.print("\nfirst task executed ");
        t1.start();
        System.out.print("\nsecond task executed ");
        t2.start();
        System.out.print("\nThird task executed ");
        t3.start();


        long endTime = System.currentTimeMillis();

        System.out.printf(" %s Total Time Tacken %d ",Thread.currentThread().getName(),(endTime-start));
    }
}
