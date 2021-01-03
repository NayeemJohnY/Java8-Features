 package java8Features;

import java.util.function.Supplier;

public class SupplierFunctioanlInteraceConcept {

	public static void display(Supplier<String> text) {
		System.out.println(text.get().length());
	}
	public static void main(String[] args) {
		// takes no argument & return a result
		display(() -> "Java");
		display(() -> "Selenium");
	}
}
