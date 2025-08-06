package day9MultithreadingSynchronization;
class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Count: " + i);
            try {
                Thread.sleep(500); // Sleep for half a second to simulate work
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted.");
            }
        }
        System.out.println(getName() + " completed.");
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        MyThread t1 = new MyThread(" Thread MAX");
        MyThread t2 = new MyThread("Thread MIN");
        MyThread t3 = new MyThread("Thread NORM");

        t1.setPriority(Thread.MAX_PRIORITY); 
        t2.setPriority(Thread.MIN_PRIORITY); 
        t3.setPriority(Thread.NORM_PRIORITY); 

        t1.start();
        t2.start();
        t3.start();
    }
}


