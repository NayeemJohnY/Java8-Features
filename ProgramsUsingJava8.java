package com.java8.programs;

import java.util.stream.IntStream;

public class ProgramsUsingJava8 {

	public static int findFactorialofNumber(int number) {
		return IntStream.rangeClosed(1, number).reduce(1, (a, b) -> a * b);
	}

	public static boolean isPrime(int range) {
		return IntStream.rangeClosed(2, (int) Math.sqrt(range)).anyMatch(x -> range % x != 0);
	}

	public static void main(String[] args) {
		System.out.println(findFactorialofNumber(5));
		System.out.println(isPrime(5));
		
	}
}
