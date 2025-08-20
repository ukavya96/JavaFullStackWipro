package Assignment;

public class CountVowelsAndConsonants {
	public static void countVowelsAndConsonants(String input) {
	      
	        input = input.toLowerCase();

	        int vowels = 0, consonants = 0;

	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);

	            if (Character.isLetter(ch)) {
	             
	                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                    vowels++;
	                } else {
	                    consonants++;
	                }
	            }
	        }

	        System.out.println("Vowels: " + vowels);
	        System.out.println("Consonants: " + consonants);
	    }

	    public static void main(String[] args) {
	        String input = "Hello, World!";
	        System.out.println("Input String: " + input);
	        countVowelsAndConsonants(input);
	    }
	}



