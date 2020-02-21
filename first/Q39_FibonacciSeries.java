package Codes_InterviewQuestions.first;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Fibonacci series
 */
interface  Fibonacci<T,X>{
	T series(X x);
}

public class Q39_FibonacciSeries {
	public static void main(String[] args) {
		int n=9;
		System.out.println(fibonacci.series(n));
		
	}
	
	public static Fibonacci<List<Integer>,Integer> fibonacci=number->{
		
		return Stream.iterate(new int[] {0,1},arr->new int[] {arr[1],arr[0]+arr[1]})
				     .limit(number)
				     .map(x->x[0])
				     .collect(Collectors.toList());
	};

}
