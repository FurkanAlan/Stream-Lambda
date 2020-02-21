package Codes_InterviewQuestions.first;

import java.util.Arrays;

/*
Write a return method that can reverse  String

Ex: Reverse("ABCD"); ==> DCBA
*/

interface Reverse<T,X>{
	T function(X t);
}
public class Q28_Reverse {
	public static void main(String[] args) {
		String s="Hello World";
		char [] chr= {'a','c','f','o'};
		System.out.println(reverse.function(s));
		System.out.println("String Builder :"+revSBuilder.function(s));
		printReverse(chr);
		System.out.println(reverseWithmap.function(s));
		
	}
	
	
	public static Reverse<String,String> reverse=str->{
		String result="";
		for(int i=str.length()-1;i>=0;i--) {
			result+=str.charAt(i);
		}
		
	 
		
		return result;
	};
	
	public static Reverse<String,String> revSBuilder=str->{
		return new StringBuilder(str).reverse().toString();
	};
	
	public static Reverse<String,String> reverseWithmap=str->{
		return str.chars().mapToObj(x->Character.toString((char)x))
				          .reduce("", (x,y)->x+y);
	};
	
	public static void printReverse(char[] letters){ 
		for (int i = letters.length-1; i >= 0 ; i--){
			System.out.print(letters[i]+" ");
	}
	
	}
	

}
