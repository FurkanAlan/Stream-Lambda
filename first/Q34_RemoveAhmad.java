package Codes_InterviewQuestions.first;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed"..... 
Write a java operation to remove all the names named Ahmed
*/

interface Remove<T,X>{
	T function(X x);
}
public class Q34_RemoveAhmad {
	public static void main(String[] args) {
		String [] array= {"Ahmed", "John", "Eric", "Ahmed"};
		System.out.println(removeAny.function(array));
		
	}
  public static Remove<List<String>,String[]> removeAny=strArr->{
	  return Arrays.stream(strArr)
			       .filter(x->!x.contains("Ahmed"))
			       .collect(Collectors.toList());
  };
}
