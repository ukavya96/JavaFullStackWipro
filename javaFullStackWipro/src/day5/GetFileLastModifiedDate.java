package day5;
import java.io.File;
import java.util.Date;

public class GetFileLastModifiedDate {
           public static void main(String[] args) {
	       File file = new File("C:\\Users\\USER\\Downloads\\Leak Detection System Design_files");
	       Date date=new Date(file.lastModified());
		   System.out.println("\nThe file was last modified on: "+date+"\n");	   
	     }
	}

