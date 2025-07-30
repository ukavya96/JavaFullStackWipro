package day5;
import java.io.File;
public class Check_File_Or_Directory {

	       public static void main(String[] args) {
	        // Create a File object
	        File my_file_dir = new File("C:\\Users\\USER\\Downloads\\Leak Detection System Design_files");
	         if (my_file_dir.isDirectory()) 
	           {
	            System.out.println(my_file_dir.getAbsolutePath() + " is a directory.\n");
	           } 
	         else
	          {
	            System.out.println(my_file_dir.getAbsolutePath() + " is not a directory.\n");
	          }
	         if (my_file_dir.isFile()) 
	           {
	            System.out.println(my_file_dir.getAbsolutePath() + " is a file.\n");
	           } 
	         else
	          {
	            System.out.println(my_file_dir.getAbsolutePath() + " is not a file.\n");
	          }  
	      }
	  }

