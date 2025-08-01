package day7;

import java.util.ArrayList;
import java.util.List;

public class CountOfEvenNumbersInList {
     public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(9);
		al.add(4);
        long c= al.stream().filter(x -> x % 2 == 0).count();
        System.out.println(c);
		  
		}
}
