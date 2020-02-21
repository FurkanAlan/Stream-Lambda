package Codes_InterviewQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
 write a program that return the minimum value from an int array
 */
interface MinNumber<T,X> {
	X function(T t);
};

public class Q06_MinNumber {
	public static void main(String[] args) {
		int[] array= {12,88,99,0,678};
		System.out.println(minNumber.function(array));
	}
	
	public static MinNumber<int [],Integer> minNumber=arr->{
		return Arrays.stream(arr)
					 .min()
					 .getAsInt();
					
	};

}
