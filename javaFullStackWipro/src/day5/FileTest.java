package day5;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {

    public static void main(String[] args) {
        File file = new File("Kavya.txt");

        try {
            // Create the file
            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File already exists.");
            }

            // Write content
            try (FileWriter writer = new FileWriter(file)) {
                writer.write("HI JAVA B1");
            }

            // Read content using try-with-resources
            try (FileReader reader = new FileReader(file)) {
                int c;
                while ((c = reader.read()) != -1) {
                    char ch = (char) c;
                    System.out.print(ch);
                }
            }

        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
