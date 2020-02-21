package Codes_InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 write a program that can return the maximum value from an int array
 */
interface SecondMax<T,X>{
	X function(T t);
};
public class Q05_SecondMax_from_IntArray {
	public static void main(String[] args) {
		int[] array= {12,88,99,0,678};
		System.out.println(secondMax.function(array));
		
		
	}
	
	public static SecondMax<int[],Integer> secondMax=arr->{
		
		    
		return Arrays.stream(arr)
	 				 .boxed()
	 				 .sorted((x,y)->y.compareTo(x))
	 				 .collect(Collectors.toList())
	 				 .get(1);
	};

}
