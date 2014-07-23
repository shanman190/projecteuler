package problem4;

public class Problem4 {

	/**
	 * Problem 4:
	 * 
	 * A palindromic number reads the same both ways. The largest palidrome
	 * made from the product of two 2-digit numbers is 
	 * 9009 = 91 x 99.
	 * Find the largest palindrome made from the product of two 3-digit numbers.
	 */
	public static void main(String[] args) {
		String result = "";
		for (int i = 999; i > 99; i--) {
			for (int j = 999; j > 99; j--) {
				String testPalindrome = String.valueOf(i * j);
				if (testPalindrome.equals(new StringBuffer(testPalindrome).reverse().toString())
						&& (result.equals("") || Long.parseLong(result) < Long.parseLong(testPalindrome))) {
					result = testPalindrome;
				}
			}
		}
		System.out.println(result);
	}
}
