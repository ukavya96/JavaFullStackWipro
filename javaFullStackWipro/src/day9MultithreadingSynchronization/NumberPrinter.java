package day9MultithreadingSynchronization;

public class NumberPrinter extends Thread {

    
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                
                if (i == 5) {
                    Thread.sleep(5000); 
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted.");
        }
    }

    public static void main(String[] args) {
        NumberPrinter printerThread = new NumberPrinter();
        printerThread.start(); 
    }
}
