package java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsConcept {
	public static void main(String[] args) {

		List<String> products = Arrays.asList("Redmi", "Dell", "Windows", "Shoes");

		products.stream().filter(x -> !x.equals("Shoes")).forEach(System.out::println);

		List<Customer> customerList = Arrays.asList(new Customer("Nayeem", 25), new Customer("John", 25),
				new Customer("Tom", 26), new Customer("Peter", 30));
		// filter with finAny
		System.out.println(customerList.stream().filter(x -> x.getAge() == 30).findAny().orElse(null).getName());
		// filter with orElse
//		System.out.println(customerList.stream().filter(x -> x.getAge() < 20).findAny().orElse(null).getName());
		// filter with multiple conditions
		System.out.println(customerList.stream().filter(x -> x.getName().equals("Nayeem") && x.getAge() == 25).findAny()
				.orElse(null).getName());
		System.out.println("------");

		customerList.stream().filter(x -> x.getAge() < 30).map(Customer::getName).collect(Collectors.toList())
				.forEach(System.out::println);
		;

		// flat map

		String data[][] = new String[][] { { "Nayeem", "SDET" }, { "Vino", "FSD" }, { "Sreeram", "Tech Lead" } };

		Stream<String[]> dataStream = Arrays.stream(data);
//		Stream<String[]> dataStreamFilter = dataStream.filter(x-> x.toString().equals("Nayeem"));

//		dataStreamFilter.forEach(System.out::println);
		System.out.println("------");
		dataStream.flatMap(x -> Arrays.stream(x)).filter(x -> x.equals("SDET")).forEach(System.out::println);
		System.out.println("------");
		Customer cus1 = new Customer("John", 12);
		cus1.addDevics("Readmi");
		cus1.addDevics("Oppo");
		cus1.addDevics("vivo");

		Customer cus2 = new Customer("Joe", 10);
		cus2.addDevics("Apple");
		cus2.addDevics("SAMSUNG");
		cus2.addDevics("vivo");
		// Stream of array,Steam<array[]>  Stream<List<String> stream of list => Stream<Strin>
		List<Customer> listOfCustomers = Arrays.asList(cus1, cus2);
		listOfCustomers.stream().map(x -> x.getDevices()).collect(Collectors.toList()).forEach(System.out::println);

		listOfCustomers.stream().map(x -> x.getDevices()).flatMap(x -> x.stream()).distinct()
				.forEach(System.out::println);

		int numbers[] = {1,2,3,4,5,6,7,8,9};
		Stream<int[]> numbersStream = Stream.of(numbers);
		Stream.of(numbers).forEach(System.out::println);
		numbersStream.flatMapToInt(x-> Arrays.stream(x)).forEach(System.out::println);
		
	}
}
