package day7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringNegativeNumbers {

	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<Integer>();
		al.add(-2);
		al.add(3);
		al.add(-5);

		List<Integer> li = al.stream()
				.filter(x -> x <0)
				.collect(Collectors.toList());

		System.out.println("Original list: " + al);
		System.out.println("Filtered list  " + li);
	}
}


