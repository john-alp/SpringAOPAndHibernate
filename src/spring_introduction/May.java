package spring_introduction;

import java.util.concurrent.locks.Lock;
        import java.util.concurrent.locks.ReentrantLock;

public class May {
    public static void main(String[] args) {
        Runner runner = new Runner();
        Thread thread1 = new Thread(runner::firstThread);
        Thread thread2 = new Thread(runner::secondThread);

        thread1.start();
        thread2.start();
    }
}

class Runner {
    private final Lock lock1 = new ReentrantLock();
    private final Lock lock2 = new ReentrantLock();

    public void firstThread() {
        for (int i = 0; i < 10000; i++) {
            synchronized (lock1) {
                System.out.println("Hold lock1, wait lock2");
                synchronized (lock2) {
                    System.out.println("Hold lock1, hold lock2");
                }
            }
        }
    }

    public void secondThread() {
        for (int i = 0; i < 10000; i++) {
            synchronized (lock2) {
                System.out.println("Hold lock2, wait lock1");
                synchronized (lock1) {
                    System.out.println("Hold lock2, hold lock1");
                }
            }
        }
    }
}
