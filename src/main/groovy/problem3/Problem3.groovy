package shanman190.problem3

// The prime factors of 13195 are 5, 7, 13 and 29.
//
// What is the largest prime factor of the number 600851475143 ?
def testPrime = 600851475143
def divisor = 2

while(testPrime > 1) 
{
	if(testPrime % divisor == 0)
		testPrime = (testPrime / divisor) as long
	else
		divisor++
}

println divisor