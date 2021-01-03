package java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateFunctionalInterfaceConcept {
	public static void main(String[] args) {
		
		// returns boolean, accepts only one argument
		Predicate<Integer> fun1= x-> x>5;
		System.out.println(fun1.test(5));
		
		Predicate<String> fun2 = x-> x.isEmpty();
		System.out.println(fun2.test(""));
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,6,5,7,8,0);
		System.out.println(numbers.stream().filter(fun1).collect(Collectors.toList()));
		
		//predicate with and
		System.out.println(numbers.stream().filter(x-> x>5 && x<8).collect(Collectors.toList()));
		
		//predicate with negate
		List<String> names = Arrays.asList("Nayeem", "John", "SDET");
		Predicate<String> fun3 =  x -> x.contains("e");
		System.out.println(names.stream().filter(fun3.negate()).collect(Collectors.toList()));
		
	}
}
