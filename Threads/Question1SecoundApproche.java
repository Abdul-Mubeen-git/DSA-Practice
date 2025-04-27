package Threads;


public class Question1SecoundApproche {
    int counter;
    synchronized public void increment() {
        counter++;
    }
    public static void main(String[] args) {
        String name = "Mubeen";
        int lenght = name.length();
        Runnable enveRunnable = () -> {
          for(int i=0; i<lenght;i += 2) {
              System.out.println("1st Thread : " + name.charAt(i));
          }
        };

        Runnable oddRunnable = () -> {
            for(int i=1; i<lenght;i += 2) {
                System.out.println("2nd Thread : " + name.charAt(i));
            }
        };

        Thread t1 = new Thread(enveRunnable);
        Thread t2 = new Thread(oddRunnable);
        t1.start();
        t2.start();
    }
}
