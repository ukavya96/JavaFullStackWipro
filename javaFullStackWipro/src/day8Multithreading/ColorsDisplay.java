package day8Multithreading;
import java.util.Random;

class ColorDisplay implements Runnable {
    String[] colours = {"white", "blue", "black", "green", "red", "yellow"};
    Random rand = new Random();

    public void run() {
        while (true) {
            int index = rand.nextInt(colours.length);
            String color = colours[index];

            System.out.println(Thread.currentThread().getName() + " - Colour: " + color);

            if (color.equals("red")) {
                System.out.println(Thread.currentThread().getName() + " - Found red! Stopping thread.");
                break;
            }

            try {
                Thread.sleep(500); // Pause for visibility
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }

    public static void main(String[] args) {
        ColorDisplay task = new ColorDisplay();

        Thread t1 = new Thread(task, "ColourThread");
        t1.start();
    }
}