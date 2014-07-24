package problem7;

import java.util.ArrayList;
import java.util.List;

public class Problem7 {

	/**
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
	 * 
	 * What is the 10001st prime number?
	 */
	public static void main(String[] args) {
		long possiblePrime = 2;
		List<Long> expectedPrimes = new ArrayList<>();
		expectedPrimes.add(possiblePrime);
		possiblePrime += 1;
		expectedPrimes.add(possiblePrime);
		long ss = 2;
		while (expectedPrimes.size() < 10001) {
			possiblePrime += ss;
			boolean isPrime = true;
			for (long prime : expectedPrimes) {
				if (prime > Math.sqrt(possiblePrime)) 
					break;
				if (possiblePrime % prime == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				expectedPrimes.add(possiblePrime);
			}
		}
		System.out.println(expectedPrimes.get(expectedPrimes.size() - 1));
	}
}
