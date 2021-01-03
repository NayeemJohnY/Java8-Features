package java8Features;

import java.util.function.Function;

public class FunctioanlInterfcaeConcept {
	public static void main(String[] args) {
		/**
		 * T - the type of the input to the function
		 * R - the type of the result of the function
		 * R apply (T)
		 */
		Function<String, Integer> fun1 = x -> x.length();
		System.out.println(fun1.apply("Hi I am Nayeem"));
		
		//Chaining function
		Function<Integer, Integer> fun2 = x -> x*2;
		System.out.println(fun1.andThen(fun2).apply("HI HOw are you"));
		
	}
}
