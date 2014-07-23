package shanman190.problem2

class Fibber
{
	def old = 1, fib = 1, current = 1
	
	def next() {
		def newFib = fib + old
		old = fib
		fib = newFib
		current++
		
		fib
	}
}
