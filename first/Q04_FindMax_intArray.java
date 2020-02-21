package Codes_InterviewQuestions.first;
/*
write a program that can return the maximum value from an int array
*/

import java.util.Arrays;

interface FindMax<T,X>{
	T function(X t);
}
public class Q04_FindMax_intArray {
	public static void main(String[] args) {
		
		int[] arr= {12,45,999,0,4};
		System.out.println(max.function(arr));
		
	}
	
	public static FindMax<Integer,int[]> max=array->{
		return Arrays.stream(array)
				     .max()
				     .getAsInt();
	};

}
