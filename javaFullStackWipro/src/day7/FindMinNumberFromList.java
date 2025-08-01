package day7;

import java.util.ArrayList;
import java.util.List;

public class FindMinNumberFromList {
    public static void main(String[] args) {
		
        List<Integer> al = new ArrayList<Integer>();
        al.add(23);
        al.add(34);
        al.add(67);

        int m = al.stream()
                  .min((x, y) -> x > y ? 1 : -1) // Use min instead of max
                  .get();

        System.out.println("Minimum number: " + m);
    }
}
