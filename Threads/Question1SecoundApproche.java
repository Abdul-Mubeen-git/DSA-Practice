package Threads;


import java.util.concurrent.atomic.AtomicInteger;

public class Question1SecoundApproche {
    private final static String name = "Mubeen";
    private final static AtomicInteger counter = new AtomicInteger(0);
    public static void main(String[] args) {

        Runnable r1 = () -> {
          while (counter.get() < name.length()-1) {
              if(counter.get() % 2 == 0) {
                  System.out.println("1st Thread : " + name.charAt(counter.get()));
                  counter.incrementAndGet();
              }
          }
        };

        Runnable r2 = () -> {
            while (counter.get() < name.length()-1) {
                if(counter.get() % 2 == 1) {
                    System.out.println("1st Thread : " + name.charAt(counter.get()));
                    counter.incrementAndGet();
                }
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}
