package java8Features;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorInterfcaeConcept {
	public static void main(String[] args) {

		//perform operation on 2 operands of same type adn return same type result
		BinaryOperator<Integer> fun1 = (x, y) -> x + y;
		System.out.println(fun1.apply(5, 6));
		//perform operation on 2 operands of different type and return different result
		BiFunction<String, String, Integer> fun2 = (x,y) -> x.length() + y.length();
		System.out.println(fun2.apply("Hi", "Hello"));
		// 2 different operator
		BiFunction<String, Integer, String> fun3 = (x,y) -> x+y;
		System.out.println(fun3.apply("Hi", 3));
	}
}
