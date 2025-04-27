package Threads;

import java.util.*;

class Intro {

    // what are thread ? Threads are lightweight and smallest/sub task
    // why it's light weight? Thread reqiried fewer resourses to manage compare to process
    // every java program have at least one thread (JVM creates a main thread when the program starts.)
    public static void main (String... str) {
        Thread t = Thread.currentThread(); //  main thread
        System.out.println("Current thread Name :: " + t.getName());

        t.setName("custom Name");
        System.out.println("Modified thread Name to :: " + t.getName());

        // child Thread (Main Thread creates child thread)
        Thread childThread = new Thread() {
            @Override
            public void run() {
                System.out.println("Current Thread :: " + Thread.currentThread().getName());
            }
        };
        childThread.start();

        System.out.println("Child thread Name :: " + childThread.getName());
        System.out.println(childThread.getName() + " is Child Thread of " + childThread.getThreadGroup().getName());



        System.out.println("Child thread Priority :: " + childThread.getPriority());
        System.out.println("Main thread priority:: " + t.getPriority());

        childThread.setPriority(Thread.MAX_PRIORITY);
        t.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Child thread Priority :: " + childThread.getPriority());
        System.out.println("Main thread priority:: " + t.getPriority());
    }
}