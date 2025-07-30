package day5;
import java.io.File;
public class Check_Read_and_Write_Permissions {

	
	
	       public static void main(String[] args) {
	        // Create a File object
	        File my_file_dir = new File("C:\\Users\\USER\\Downloads\\Leak Detection System Design_files");
	         if (my_file_dir.canWrite()) 
	           {
	            System.out.println(my_file_dir.getAbsolutePath() + " can write.\n");
	           } 
	         else
	          {
	            System.out.println(my_file_dir.getAbsolutePath() + " cannot write.\n");
	          }
	         if (my_file_dir.canRead()) 
	           {
	            System.out.println(my_file_dir.getAbsolutePath() + " can read.\n");
	           } 
	         else
	          {
	            System.out.println(my_file_dir.getAbsolutePath() + " cannot read.\n");
	          }  
	      }
	  }
	  
