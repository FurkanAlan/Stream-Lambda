package Codes_InterviewQuestions.first;

import java.util.Arrays;


/*
write a program that return the minimum value from an int array
*/
interface Min<T,X>{
	T function(X x);
};

public class Q06_FindMin_intArray {
	public static void main(String[] args) {
		
		int[] array= {12,88,99,0,678};
		System.out.println(min.function(array));
		
	}
	
	public static Min<Integer,int[]> min=arr->{
		return Arrays.stream(arr)
				     .min()
				     .getAsInt();
	};

}
