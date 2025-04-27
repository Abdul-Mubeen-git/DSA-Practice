package Threads;

public class ThreadVsRunnable {

    // if some class what to extend the AA class - not possible
    // here where the concept of Runnable comes into picture
    // we can create a Thread using Runnable also
    public static void main(String[] args) {
        Runnable r = new BB(){
            @Override
            public void run() {
                System.out.println(greet);
                super.run();
            }
        };
        Runnable r2 = new AA(){
            @Override
            public void run() {
                System.out.println("hi");
                super.run();
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();

    }
}

class parent {
    String greet = "Hai from parent..";
}

//class AA extends Thread,parent - not possible
class AA extends Thread {
    @Override
    public void run() {
        System.out.println("Class AA is running..");
    }
}

class BB extends parent implements Runnable {
    @Override
    public void run() {
        System.out.println("Class BB is running..");
    }
}
