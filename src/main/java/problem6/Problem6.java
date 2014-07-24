package problem6;

import java.util.stream.LongStream;

public class Problem6 {

	/**
	 * Problem 6:
	 * 
	 * The sum of the squares of the first ten natural numbers is,
	 * 
	 * 1^2 + 2^2 + ... + 10^2 = 385
	 * 
	 * The square of the sum of the first ten natural numbers is,
	 * 
	 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
	 * 
	 * Hence the difference between the sum of the squares of the first 
	 * ten natural numbers and the square of the sum is 3025 - 385 = 2640.
	 * 
	 * Find the difference between the sum of the squares of the first one 
	 * hundred natural numbers and the square of the sum.
	 */
	public static void main(String[] args) {
		long squareOfTheSum = (long) Math.pow(LongStream
				.rangeClosed(1, 100)
				.reduce(0, Long::sum), 2);
		
		long sumOfTheSquares = LongStream
				.rangeClosed(2, 100)
				.reduce(1, (a, b) -> {
					return a + (long) Math.pow(b, 2);
				});
		System.out.println(squareOfTheSum - sumOfTheSquares);
	}
}
