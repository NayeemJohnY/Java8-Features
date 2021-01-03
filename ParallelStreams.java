package java8Features;

import java.util.stream.IntStream;

public class ParallelStreams {

	public static void main(String[] args) {
		long t1 = System.currentTimeMillis();
		IntStream.range(0, 100000).forEach(System.out::println);
		System.out.println((System.currentTimeMillis()-t1));
	}
}
