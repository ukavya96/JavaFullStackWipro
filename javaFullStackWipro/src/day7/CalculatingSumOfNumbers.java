package day7;
import java.util.ArrayList;
import java.util.List;

public class CalculatingSumOfNumbers {
     public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
        int sum = al.stream().reduce(0,  Integer::sum);
        System.out.println(sum);
		  
		}
}