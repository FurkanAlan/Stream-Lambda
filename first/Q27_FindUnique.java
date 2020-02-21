package Codes_InterviewQuestions.first;
/*
Write a return  method that can find the unique characters from the String

 Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
*/

import java.util.stream.Collectors;

interface Uniquech<T>{
	T func(T t);
}
public class Q27_FindUnique {
	public static void main(String[] args) {
		
	}
	
	public static Uniquech<String> unique=str->{
		return str.chars()
				  .distinct()
				  .mapToObj(x->String.valueOf((char)x))
				  .collect(Collectors.joining());
	};

}
