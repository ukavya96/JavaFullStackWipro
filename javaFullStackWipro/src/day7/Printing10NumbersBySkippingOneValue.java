package day7;
import java.util.stream.Stream;
public class Printing10NumbersBySkippingOneValue {

	public static void main(String[] args) {
		Stream.iterate(0,  n-> n+2)
		.limit(10)
		.forEach(System.out::println);

	}

}
