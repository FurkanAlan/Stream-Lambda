package Codes_InterviewQuestions.first;
/*
 *
 1. write a java program that can count how many 
 time the word "book" is appered in a String Ex:
 input: I like books, I have books, I need book 
 output: 3
 */

import java.util.Arrays;

interface CountWord<T,X>{
	T function(X x);
}
 
public class Q01_CountWord {

	
	public static void main(String[] args) {
		String str="I like books, I have books, I need book";
		System.out.println(countWord.function(str));
		
	}
	
	public static CountWord<Integer,String> countWord=str->{
		return (int)Arrays.stream(str.split(" "))
				     .filter(x->x.contains("book"))
				     .count();
		
	};

}
