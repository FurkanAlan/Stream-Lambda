package Codes_InterviewQuestions;

import java.util.Arrays;

/*
 1. write a java program that can count how many time the word "book" is appered in a String Ex:
 input: I like books, I have books, I need book 
 output: 3
 */
interface CountWord<T,X>{
	T funcCount(X x);
	
}
public class Q01_Count_Word {
	public static void main(String[] args) {
		
		String str="I like books, I have books, I need book";
		
		System.out.println(count.funcCount(str));
	}
	
	public static CountWord<Integer,String> count=str->{
		
		
		return (int) Arrays.stream(str.split(" "))
				     .filter(x->x.contains("book"))
				     .count();
	};

}
