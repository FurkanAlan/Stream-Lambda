package Codes_InterviewQuestions;
/*
 write a program that can return the maximum value from an int array
 */

import java.util.Arrays;

interface Max<T,X>{
	X function(T t);
};
public class Q04_MaxNumber_from_IntArray {
	public static void main(String[] args) {
		
		int[] array= {12,88,99,0,678};
		System.out.println(max.function(array));
		
	}
	
	public static Max<int[],Integer> max=arr->{
		
	return	Arrays.stream(arr)
		          .max()
		          .getAsInt();
		};
		    

}
