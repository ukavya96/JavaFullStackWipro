package day5;



	import java.io.File;
	import java.io.FilenameFilter;
	public class Get_Files_By_Extension {
	
	       public static void main(String a[]){
	        File file = new File("C:\\Users\\USER\\Downloads\\Leak Detection System Design_files");
	           String[] list = file.list(new FilenameFilter() {
	           @Override
	            public boolean accept(File dir, String name) {
	             if(name.toLowerCase().endsWith(".txt")){
	                    return true;
	                } else {
	                    return false;
	                }
	            }
	        });
	        for(String f:list){
	            System.out.println(f);
	        }
	    }
	}
