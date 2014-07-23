package problem4;

public class Problem4 {

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
