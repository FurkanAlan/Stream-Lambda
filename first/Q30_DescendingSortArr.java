package Codes_InterviewQuestions.first;
/*
Array -- Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class

Ex:  int[] arr = {10,20,7, 8, 90};

            arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q30_DescendingSortArr {
	public static void main(String[] args) {
		int[] arr = {10,20,7, 8, 90};
		System.out.println(Sort.function(arr));
		
		
	}
	public static Order<List<Integer>,int[]> Sort=arr->{
		return Arrays.stream(arr)
				     .boxed()
				     .sorted((x,y)->y.compareTo(x))
				     .collect(Collectors.toList());
	};

}
