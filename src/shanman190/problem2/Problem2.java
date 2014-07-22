package shanman190.problem2;

import java.util.ArrayList;
import java.util.List;

//import java.util.HashMap;
//import java.util.Map;

public class Problem2 {

//	private static Map<Long, Long> memo;
	
	public static void main(String[] args) {
		List<Long> fib = new ArrayList<>();
		fib.add(1L);
		fib.add(2L);
		while (fib.get(fib.size() - 1) <= 4000000) {
			int size = fib.size();
			fib.add(fib.get(size - 1) + fib.get(size - 2));
		}
		System.out.println(
				fib
					.stream()
					.filter(i -> { return i % 2 == 0; })
					.reduce(0L, Long::sum));
	}
}
