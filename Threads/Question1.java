package Threads;

public class Question1 {
    public static void main(String[] args) {
        String name = "Mubeen";
        char[] nameChars = name.toCharArray();

        Object lock = new Object();

        Runnable evenRunnable = () -> {
          for (int i=0; i<nameChars.length;i += 2) {
              synchronized (lock) {
                  System.out.println("Even Thread : "+ nameChars[i]);
                  lock.notify();
                  try {
                      if(i+1 < nameChars.length)
                        lock.wait();
                  } catch (InterruptedException e) {
                      throw new RuntimeException(e);
                  }
              }
          }
        };

        Runnable oddRunnable = () -> {
            for (int i=1; i<nameChars.length;i += 2) {
                synchronized (lock) {
                    System.out.println("Even Thread : "+ nameChars[i]);
                    lock.notify();
                    try {
                        if(i+1 < nameChars.length)
                            lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        Thread thread1 = new Thread(evenRunnable);
        Thread thread2 = new Thread(oddRunnable);

        thread1.start();
        thread2.start();
    }
}
