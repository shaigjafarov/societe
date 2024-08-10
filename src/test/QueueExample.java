package test;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
       Queue<String> queue = new LinkedList<>();

        // Adding elements
        queue.add("First");

//        queue.offer()
        queue.offer("Second");

        // Retrieving elements
        System.out.println("Head of the queue: " + queue.peek()); // First
        System.out.println("Removed element: " + queue.poll()); // First
        System.out.println("Next element: " + queue.peek()); // Second
    }
}
