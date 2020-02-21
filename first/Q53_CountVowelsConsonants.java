package Codes_InterviewQuestions.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


interface CountVowelsConsonants<T,X>{
	T count(X x);
}
public class Q53_CountVowelsConsonants {
	public static void main(String[] args) {
		
		String str="alo   oii  pl ";
		System.out.println(vowCons.count(str));
		
		
		
	}
	
	
	
	public static CountVowelsConsonants<String,String>  vowCons=str->{
		List<Character> vowels=new ArrayList<>(Arrays.asList('a','e','o','u','i'));
		List<Character> consonant=new ArrayList<>();
		
		for(var i='a';i<'z';i++) {
			if(!vowels.contains(i)) consonant.add(i);
		}
		
		int vo=0;
		int co=0;
		
		str=str.toLowerCase().replaceAll(" ", "");
		for(var i=0;i<str.length();i++) {
			if(vowels.contains(str.charAt(i))) {
				vo++;
				}else co++;
			
			}
		
				      
				
		       return     "Count Vowels: "+vo+" Count Consonant: "+co;
		             
		      
	};
}
