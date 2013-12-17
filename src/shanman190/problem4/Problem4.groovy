package shanman190.problem4

// A palindromic number reads the same both ways. The largest 
// palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//
// Find the largest palindrome made from the product of two 3-digit numbers.

// Original solution
def result = "";

for (int i = 999; i > 99; i--)
{
	for (int j = 999; j > 99; j--)
	{
		def testPalindrome = String.valueOf(i * j)
		if(testPalindrome == testPalindrome.reverse()
			&& (result == "" ||
				Long.parseLong(result) < Long.parseLong(testPalindrome)))
		{
			result = testPalindrome;
		}
	}
}

println result

// Improved solution
palindromes = []
(100..999).each { x ->
	(100..999).each { y ->
		cand = x * y
		candList = cand as String
		if (candList == candList.reverse()) palindromes << cand
	}
}
println palindromes.max()