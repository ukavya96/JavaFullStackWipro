package day8Multithreading;
import java.util.*;
public class LargestPossiblePalindrome {

	    public static int charactersToRemove(String input1) {
	        input1 = input1.toLowerCase();

	        Map<Character, Integer> freqMap = new HashMap<>();

	        for (char ch : input1.toCharArray()) {
	            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
	        }

	        int oddCount = 0;
	        for (int count : freqMap.values()) {
	            if (count % 2 != 0) {
	                oddCount++;
	            }
	        }

	       
	        if (oddCount == input1.length()) {
	            return -1;
	        }

	       
	        if (oddCount <= 1) {
	            return 0;
	        }

	        
	        return oddCount - 1;
	    }

	    public static void main(String[] args) {
	        System.out.println(charactersToRemove("Template")); 
	        System.out.println(charactersToRemove("Magma"));     
	        System.out.println(charactersToRemove("Victory"));   
	        System.out.println(charactersToRemove("Racecar"));   
	    }
	}