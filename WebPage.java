package java8Features;

//SAM -single Abstract method
@FunctionalInterface
public interface WebPage {

	public void header(String str);
//	public void t1();

//	public void header2(String str,int a) {
//		System.out.println("aheader");
//	};
	
	public static void display(String str) {

	};

	public static void view(String str) {
		System.out.println("asbc");
	};

	default void show() {
	}

	default void preview() {
		System.out.println("asbc");
	}
}
