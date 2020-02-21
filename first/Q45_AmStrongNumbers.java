package Codes_InterviewQuestions.first;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * /**
 * Java 8 / Lambda approach to generate Armstrong number.
 * Armstrong always start to look from number 1.
 * @param series Number of how many Armstrong number should be generated
 * @return List holding resulting Armstrong number.
 */


interface Amstrong<T,X>{
	T function(X x);
}
public class Q45_AmStrongNumbers {
	

	public static void main(String[] args) {
		int number=5;
		
		System.out.println(generate.function(number));
		System.out.println(isAmstrong.function(153));
	}
	public static Amstrong<Boolean,Integer> isAmstrong=num->{
		return 1==Stream.of(num)
				      .filter(x->x==Stream.of(String.valueOf(num).split(""))
				      .map(Integer::valueOf)
				      .map(n -> (n*n*n))
	                  .mapToInt(n -> n)
	                  .sum())
				      .count();
	                   
	};
	
	public static Amstrong<List<Integer>,Integer> generate=series->{
	    return Stream.iterate(1, i -> ++i)
	            .filter(i -> i == Stream.of(String.valueOf(i).split(""))
	                    .map(Integer::valueOf)
	                    .map(n -> (n*n*n))
	                    .mapToInt(n -> n)
	                    .sum())
	            .limit(series)
	            .collect(Collectors.toList());
	};
}
