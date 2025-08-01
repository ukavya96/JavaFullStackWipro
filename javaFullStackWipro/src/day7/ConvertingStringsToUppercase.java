package day7;

import java.util.ArrayList;
import java.util.List;

public class ConvertingStringsToUppercase {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();

		li.add("wipro");
		li.add("technologies");
		li.add("chennai");

		li.stream()
		  .map(String::toUpperCase)
		  .forEach(System.out::println);
	}
}

