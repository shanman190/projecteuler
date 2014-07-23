package problem3;

public class Problem3 {
	
	/**
	 * Problem 3:
	 * 
	 * The prime factors of 13195 are 5, 7, 13 and 29.
	 * 
	 * What is the largest prime factor of the number 600851475143 ?
	 */
	public static void main(String[] args) {
		Long testPrime = 600851475143L;
		Long divisor = 2L;
		while (testPrime > 1) {
			if (testPrime % divisor == 0)
				testPrime = (testPrime / divisor);
			else
				divisor++;
		}
		System.out.println(divisor);
	}

}
