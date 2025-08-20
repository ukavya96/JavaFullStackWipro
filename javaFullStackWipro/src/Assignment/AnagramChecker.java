package Assignment;
import java.util.Arrays;

public class AnagramChecker {

	    public static boolean areAnagrams(String str1, String str2) {

	        str1 = str1.replaceAll("\\s", "").toLowerCase();
	        str2 = str2.replaceAll("\\s", "").toLowerCase();

	        if (str1.length() != str2.length()) {
	            return false;
	        }

	        char[] arr1 = str1.toCharArray();
	        char[] arr2 = str2.toCharArray();
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);

	        return Arrays.equals(arr1, arr2);
	    }

	    public static void main(String[] args) {
	        String string1 = "Listen";
	        String string2 = "Silent";

	        if (areAnagrams(string1, string2)) {
	            System.out.println("\"" + string1 + "\" and \"" + string2 + "\" are anagrams.");
	        } else {
	            System.out.println("\"" + string1 + "\" and \"" + string2 + "\" are NOT anagrams.");
	        }
	    }
	}



