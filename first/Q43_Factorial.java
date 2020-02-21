package Codes_InterviewQuestions.first;


import java.util.stream.LongStream;

/*
 ntStream.rangeClosed(int startInclusive, int endInclusive) returns 
 a sequential ordered IntStream from startInclusive (inclusive) to endInclusive (inclusive)
  by an incremental step of 1.

The Stream.reduce method is a general-purpose reduction operation. The reduce operation takes two arguments:

identity: The identity element is both the initial value of the reduction and 
the default result if there are no elements in the stream. In this example, the identity element is 1.
accumulator: The accumulator function takes two parameters: a partial result of 
the reduction (in this example, the multiplication of all processed integers so far) 
and the next element of the stream . It returns a new partial result. In this example, 
the accumulator function is a lambda expression that multiplies two integers and returns the result:
 */
interface Factorial<T,X>{
	T factorial(X x);
}
public class Q43_Factorial {
	public static void main(String[] args) {
		System.out.println(number.factorial(5));
		
		
		
	}

	
	public static Factorial<Long,Integer> number=n->{
		return LongStream.rangeClosed(1,n).reduce(1,(a,b)->a*b);
	};
}
