package Codes_InterviewQuestions.first;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Write a return method that can sort an int array in Ascending order 
without using the sort method of the Arrays class

Ex:

           int[] arr = {10, 9, 8, 7};

            arr = Sort(arr);         ==>{ 7, 8, 9, 10};
 */

interface Order<T,X>{
	T function(X x);
}

public class Q29_AscendingOrder {
	public static void main(String[] args) {
		int[] arr = {10, 9, 8, 7};
		System.out.println(Sort.function(arr));
	}
	public static Order<List<Integer>,int[]> Sort=arr->{
		return Arrays.stream(arr)
					 .boxed()
					 .sorted((x,y)->x.compareTo(y))
					 .collect(Collectors.toList());
	};

}
