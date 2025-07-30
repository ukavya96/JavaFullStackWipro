package day5;
import java.io.File;

public class Check_Path_Exists {
	
	
	       public static void main(String[] args) {
	        // Create a File object
	        File my_file_dir = new File("C:\\Users\\USER\\Downloads\\Leak Detection System Design_files");
	         if (my_file_dir.exists()) 
	           {
	            System.out.println("The directory or file exists.\n");
	           } 
	         else
	          {
	            System.out.println("The directory or file does not exist.\n");
	          }
	       }
	  }

