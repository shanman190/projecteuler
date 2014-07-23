package shanman190.problem1

// If we list all the natural numbers below 10 that are multiples
// of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//
// Find the sum of all the multiples of 3 or 5 below 1000.

// Original solution
def n = 1..999 as Integer[]
println n.sum { (it % 3 == 0 || it % 5 == 0) ? it : 0 }

// Imporved solution
println((1..<1000).sum { (it % 3 == 0 || it % 5 == 0) ? it : 0 })