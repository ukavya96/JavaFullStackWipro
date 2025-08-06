package day8Multithreading;

class MyThread implements Runnable {
    public void run() {
        
        System.out.println("Running Thread: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MyThread task = new MyThread();

        Thread t1 = new Thread(task, "Scooby");
        Thread t2 = new Thread(task, "Shaggy");

        t1.start();
        t2.start();
    }
}
