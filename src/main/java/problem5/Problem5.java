package problem5;

import java.util.HashMap;
import java.util.Map;

public class Problem5 {
	
	/** 
	 * Problem 5:
	 * 
	 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 
	 * without any remainder.
	 * 
	 * What is the smallest positive number that is evenly divisible by all of the numbers
	 * from 1 to 20?
	 */
	public static void main(String[] args) {
		// Initialization
		Map<Long, Long> primeCounter = new HashMap<>();
		long[] primes = new long[] { 2, 3, 5, 7, 11, 13, 17, 19 };
		for (long prime : primes) {
			primeCounter.put(prime, 0L);
		}
		
		// Computation
		for (int i = 2; i <= 20; i++) {
			long temp = i;
			for (long prime : primes) {
				if (temp % prime == 0) {
					long currentPrimeCount = 0;
					while (temp % prime == 0) {
						currentPrimeCount++;
						temp = temp / prime;
					}
					if (primeCounter.get(prime) < currentPrimeCount) {
						primeCounter.put(prime, currentPrimeCount);
					}
				}
			}
		}
		long result = primeCounter.keySet().stream().sorted().map(prime -> {
			System.out.println(prime + " := " + primeCounter.get(prime));
			return (long) Math.pow(prime, primeCounter.get(prime));
		}).reduce(1L, (a, b) -> {
			return a * b;
		});
		System.out.println(result);
	}
}
