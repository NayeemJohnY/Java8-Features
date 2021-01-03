package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreams {
	public List<String> list;
	public JavaStreams(List<String> list){
		this.list = list;
	}
	
	
	
	/*
	 * 1. Stream API is used to process collections of objects. 
	 * 2. A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.
	 * 3. A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels.
	 * 4. Streams don’t change the original data structure, they only provide the result as per the pipelined methods.
	 * 5. Each intermediate operation is lazily executed and returns a stream as a result
	 * 6. Various intermediate operations can be pipelined. Terminal operations mark the end of the stream and return the result.
	 */
	
	public static void main(String[] args) {
		List<String> employeeDetails = Arrays.asList("Nayeem", "John","SDET","Bangalore", "Cengage", "SDET");
		
		//Count all values
		System.out.println("Count of All Elements: " + employeeDetails.stream().count());
		//distinct() & count Streams
		System.out.println("Count of Unique Elements: " + employeeDetails.stream().distinct().count());
		//filter and Collect
		System.out.println("Elements contains 'e' : " + employeeDetails.stream().filter(eDetail -> eDetail.contains("e")).collect(Collectors.toList()));
		//Map each element to upperCase and collect to List
		System.out.println("Elements in Upper case : "+ employeeDetails.stream().map(eDetail -> eDetail.toUpperCase()).collect(Collectors.toList()));
		
		List<JavaStreams> streamsList = new ArrayList<JavaStreams>();
		streamsList.add(new JavaStreams(Arrays.asList("Java", "C++", "Ruby")));
		streamsList.add(new JavaStreams(Arrays.asList("CBE", "BLR", "HYD")));

		System.out.println("all Match " +  employeeDetails.stream().allMatch(eDetail -> eDetail.contains("e")));
		System.out.println("Any Match " +  employeeDetails.stream().anyMatch(eDetail -> eDetail.contains("o")));
		System.out.println("None Match " +  employeeDetails.stream().noneMatch(eDetail -> eDetail.contains("F")));
		
		   	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
	        int result1 = numbers.stream().reduce(0, (subtotal, element) -> subtotal + element);
	        System.out.println(result1);
	        
	        int result2 = numbers.stream().reduce(0, Integer::sum);
	        System.out.println(result2);
	        
	        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
	        String result3 = letters.stream().reduce("", (partialString, element) -> partialString + element);
	        System.out.println(result3);
	        
	        String result4 = letters.stream().reduce("", String::concat);
	        System.out.println(result4);

	        String result5 = letters.stream().reduce("", (partialString, element) -> partialString.toUpperCase() + element.toUpperCase());
	        System.out.println(result5);
	        
	        
	        String[] arr = new String[]{"a", "b", "c"};
	        System.out.println(Arrays.stream(arr, 1,2).collect(Collectors.toList()));
	        
	       System.out.println(Stream.<String>builder().add("a").add("b").add("c").build().collect(Collectors.toList()));
	       System.out.println(Stream.generate(() -> "element").limit(10).collect(Collectors.toList()));
	       System.out.println(Stream.iterate(5,n -> n +2).limit(10).collect(Collectors.toList()));
	}

}
