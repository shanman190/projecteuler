package problem3;

public class Problem3 {
	
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
