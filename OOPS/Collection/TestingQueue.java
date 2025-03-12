package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class TestingQueue {
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>() ;
        q.add(5);
        q.offer(6);  // both add and offer for the add elements


        for (Integer i : q) {
            System.out.printf("%d ",i);

        }
        System.out.println();

        System.out.println(q.peek());
        System.out.println(q.element()); // both print head elements example 5

        System.out.println(q.remove());  // its remove last elements like 6
        System.out.println(q.poll()); // its also remove last elements if queue is empty its print null but remove throw error

        Utility.print(q);
        System.out.println(q.poll());

    }
}
