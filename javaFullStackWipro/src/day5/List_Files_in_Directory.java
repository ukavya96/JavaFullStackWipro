package day5;

import java.io.File;
	
	public class List_Files_in_Directory {

	
	     public static void main(String a[])
	     {
	        File file = new File("C:\\Users\\USER\\Downloads\\Leak Detection System Design_files");
	        String[] fileList = file.list();
	        for(String name:fileList){
	            System.out.println(name);
	        }
	    }
	}

