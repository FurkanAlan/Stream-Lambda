package Codes_InterviewQuestions;
/*
 2.write a program that can check if the String is plaindrome. if it's print "true", otherwise print "false"   
  DO NOT USE FOR LOOP Ex: input: level output: true,  (because reversed value is still "level")
 */

interface Palindrome<T,X>{
	X function(T t);
	
};
public class Q02_Palindrome {
	public static void main(String[] args) {
		
		String string="level";
		System.out.println(palindrome.function(string));
		
	}
	
	public static Palindrome<String,Boolean> palindrome=str->{
		String result="";
		for(int i=str.length()-1;i>=0;i--) {
			result+=str.charAt(i);
		}
		return str.equals(result);
	};

}
