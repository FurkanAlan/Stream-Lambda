package Codes_InterviewQuestions.first;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

interface PrimeNumbers<T,X> {
	T primes(X x);
}

public class Q42_PrimeNumber {
	public static void main(String[] args) {
		int num=67;
		System.out.println("is "+num+" prime : "+number.primes(num));
		System.out.println(perimeSeries.primes(num));
		
		
	}

	public static PrimeNumbers<Boolean,Integer> number=num->{
		return num>1&&IntStream.range(2,num)
				               .noneMatch(i->num%i==0);
	};
	
	public static PrimeNumbers<List<Integer>,Integer>  perimeSeries=number->{
		
		List<Integer> list=new ArrayList<>();
		 
		return Stream.iterate(2,i->++i)
				     .filter(i->{
				    	 list.add(i);
				    	 return 0==list.stream()
				    			      .filter(x->x!=1)
				    			      .filter(x->!Objects.equals(x,i))
				    			      .filter(x->i%x==0)
				    			      .count();
				    	 
				     }).limit(number)
				       .collect(Collectors.toList());
	};
	
}
