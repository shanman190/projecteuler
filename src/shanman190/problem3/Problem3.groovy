package shanman190.problem3

600851475143

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