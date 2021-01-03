package java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctionalInterfaceConcept {
	public static void main(String[] args) {
		
		// consumer something & returns nothing
		Consumer<String> fun1 = x-> System.out.println(x);
		fun1.accept("Nayeem");
		
		List<String> names = Arrays.asList("Nayeem", "John", "SDET");
		names.forEach(x -> System.out.println(x.length()));
	}
}
