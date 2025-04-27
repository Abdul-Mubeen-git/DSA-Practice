package Threads;

public class extendsThreads {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        b.setPriority(Thread.MAX_PRIORITY); // we can change the priority of the thread
        a.setPriority(Thread.MIN_PRIORITY);
        a.start(); // start will call run method
        b.start();
    }
}

class A extends Thread {
    @Override
    public void run() {
        for(int i=0 ; i<10 ; i++) {
            System.out.println("A class");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B extends Thread {
    @Override
    public void run() {
        for(int i=0 ; i<10 ; i++) {
            System.out.println("B class");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}