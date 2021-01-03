package java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOpeatorInterfaceConcept {
	public static void main(String[] args) {
	 UnaryOperator<String> fun1 = x-> x.toUpperCase();
	 
	 System.out.println(fun1.apply("nayeem"));
	 
	 List<String> language = Arrays.asList("Java", "Ruby", "python");
	 language.replaceAll(x-> x.toUpperCase());
	 System.out.println(language);
	 language.replaceAll(x->x+"Nayeem");
	 System.out.println(language);
	}
}
