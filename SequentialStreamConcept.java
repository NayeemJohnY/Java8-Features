package java8Features;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SequentialStreamConcept {

	public static void main(String[] args) {
		
		Stream.of("Nayeem", "John").forEach(System.out::println);
		
		
		Stream.of("a1", "a2", "a3").findAny().ifPresent(System.out::println);
		
		IntStream.range(1, 5).forEach(System.out::println);
		
		Arrays.stream(new int[] {1,2,3,4,5}).map(x -> x*2).average().ifPresent(System.out::println);
		
		Stream.of("a1", "a$2", "a#3").map(s -> s.replaceAll("\\D", "")).mapToInt(Integer::parseInt).max().ifPresent(System.out::println);
		
		Stream.of(1.0,2.0,3.0).mapToInt(Double::intValue).mapToObj(x -> "Y"+ x).forEach(System.out::println);
		
		Stream.iterate(0, n -> n+1).filter(x-> x%2!=0).limit(10).forEach(x -> System.out.print(x +" "));
	}

}
