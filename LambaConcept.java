package java8Features;

public class LambaConcept {

	public static void main(String[] args) {
		// Anonymous class
		WebPage web = new WebPage() {

			public void header(String str) {
				System.out.println(str);

			}
		};
		web.header("String s1");
		// Lambda Expression 
		WebPage web2 = (String value) -> {
			System.out.println(value);
		};
		
		web2.header("Str");
		
		WebPage web3 = v -> System.out.println(v);
		
		web3.header("Str p");
		/// Method  Reference
		web3 = System.out::println;
		web3.header("Hi Nayeem");

	}
	
}
