package Codes_InterviewQuestions.first;
//Write a return method that check if a string is build out of the same letters as another string.

import java.util.Arrays;
import java.util.TreeSet;

interface SameLetter<T,X>{
	T func(X x1,X x2);
}
public class Q26_SameLetter {
	public static void main(String[] args) {
		
	}
	
	public static SameLetter<Boolean,String> same=(x,y)->{
		x=new TreeSet<String>(Arrays.asList(x.split(""))).toString();
		y=new TreeSet<>(Arrays.asList(y.split(""))).toString();
		
		return x.equals(y);
	};

}
