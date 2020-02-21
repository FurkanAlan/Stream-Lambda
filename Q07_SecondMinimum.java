package Codes_InterviewQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
 write a program that return the second minimum valye from an int array
 */
interface SecondMinimum<T,X>{
	X function(T t);
	
};
public class Q07_SecondMinimum {
	public static void main(String[] args) {
		int[] array= {12,88,99,0,678};
		System.out.println(secondMinimum.function(array));
	}
	
	public static SecondMax<int [],Integer> secondMinimum=arr->{
		return Arrays.stream(arr)
					 .boxed()
					 .sorted((x,y)->x.compareTo(y))
					 .collect(Collectors.toList())
					 .get(1);
	};

}
