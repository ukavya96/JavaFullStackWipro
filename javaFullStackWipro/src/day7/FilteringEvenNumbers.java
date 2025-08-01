package day7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringEvenNumbers {

	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<Integer>();
		al.add(3);
		al.add(8);
		al.add(9);

		List<Integer> li = al.stream()
				.filter(x -> x % 2 == 0)
				.collect(Collectors.toList());

		System.out.println("Original list: " + al);
		System.out.println("Filtered list (even numbers only): " + li);
	}
}

