package day7;

import java.util.ArrayList;
import java.util.List;

public class FindMaxNumberFromList {
    public static void main(String[] args) {
		
        List<Integer> al = new ArrayList<Integer>();
        al.add(23);
        al.add(34);
        al.add(67);

        // Using lambda to find the max
        int m = al.stream()
                  .max((x, y) -> x > y ? 1 : -1)
                  .get();

        System.out.println("Maximum number: " + m);
    }
}

