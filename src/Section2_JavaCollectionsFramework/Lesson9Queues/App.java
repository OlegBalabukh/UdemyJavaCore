package Section2_JavaCollectionsFramework.Lesson9Queues;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {
    public static void main(String[] args) {

        /*
         * (head) <- ooooooooooooooooooooooo <- (tail) FIFO  (first in, first out)
         *
         * A queue is a first-in first-out FIFO structure, FIFO: the first item
         * that you remove from a queue, would be the first item that you added.
         * The sooner you enter a queue, the quicker you can leave it. Adding
         * item - to the tail; removing - from the head. So, items, removed from
         * the head - the items you added the earliest. Queues are useful in
         * multithreading, especially ArrayBlockingQueue.
         */

        // Queue with 3 items max;
        Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);

        // =========== Methods that throw exceptions: #1, #2, #3 ===============

        // Throws NoSuchElementException --- no items in queue yet
        // System.out.println("Head of the queue is: " + q1.element());

        q1.add(10); // #1
        q1.add(20);
        q1.add(30);

        System.out.println("Head of the queue is: " + q1.element()); // #2

        try {
            q1.add(40); // Error: Queue full; but IDE don't force to handle this exception
        } catch (IllegalStateException e) {
            System.out.println("Tried to add too many items to the queue.");
        }

        /*
        * In case with linked list, an exception with add() won't be shown
        * because a linked list is not bounded. That's why ArrayBlockingQueue used
        */

        for (Integer value: q1) {
            System.out.println("Queue value: " + value);
        }

        /*
        Integer value;
        value = q1.remove(); #3
        System.out.println("Removed from queue: " + value);
        */

        System.out.println("Removed from queue: " + q1.remove());
        System.out.println("Removed from queue: " + q1.remove());
        System.out.println("Removed from queue: " + q1.remove());

        try {
            System.out.println("Removed from queue: " + q1.remove());
        } catch (NoSuchElementException e) {
            System.out.println("Tried to remove to many items from queue.");
        }

        // =========== Methods that return special value: #1, #2, #3 ===============

        Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);

        System.out.println("Queue 2 peek: " + q2.peek()); // null, #2 (peek() == element())

        q2.offer(10); // #4
        q2.offer(20);

        System.out.println("Queue 2 peek: " + q2.peek()); // 10

        if (q2.offer(30) == false) { // false instead of an exception; #1 (offer() == add())
            System.out.println("Offer failed to add third item.");
        }

        for (Integer value: q2) {
            System.out.println("Queue 2 value: " + value);
        }

        System.out.println("Queue 2 poll: " + q2.poll()); // 10, poll() removes items; #3 (poll() == remove())
        System.out.println("Queue 2 poll: " + q2.poll()); // 20
        System.out.println("Queue 2 poll: " + q2.poll()); // null instead of an exception

        // for unbounded queue - use LinkedList; for bounded queue - ArrayBlockingQueue
    }
}
