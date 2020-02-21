package Codes_InterviewQuestions.first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
2.write a program that can check if the String is plaindrome. 
if it's print "true", otherwise print "false"   
 DO NOT USE FOR LOOP Ex: input: level output: true, 
  (because reversed value is still "level")
*/
interface Palindrome<T,X>{
	T function(X x);
}
public class Q02_Palindrome {
	public static void main(String[] args) {
		
		String str1="level";
		System.out.println(palindrome.function(str1));
		
	}
	
	public static Palindrome<Boolean,String> palindrome=str->{
		String result="";
		for(int i=str.length()-1;i>=0;i--) {
			result+=str.charAt(i);
		}
		return str.equals(result);
	};

}
