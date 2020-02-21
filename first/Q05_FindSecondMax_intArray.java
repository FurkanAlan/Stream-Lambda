package Codes_InterviewQuestions.first;
/*
write a program that can return the maximum value from an int array
*/

import java.util.Arrays;
import java.util.stream.Collectors;

interface Max<T,X>{
	T function(X x);
};

public class Q05_FindSecondMax_intArray {
	public static void main(String[] args) {
		
		int[] array= {12,88,99,0,678};
		System.out.println(secMax.function(array));
	}
	
	public static Max<Integer,int[]> secMax=arr->{
		return Arrays.stream(arr)
					 .boxed()
					 .sorted((x,y)->y.compareTo(x))
					 .collect(Collectors.toList())
					 .get(1);
	};
	

}
