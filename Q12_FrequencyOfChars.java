package Codes_InterviewQuestions;
/*
 write a method that can find the frequency of characters in String
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

interface Frequency<T,X>{
	X function(T t);
};
public class Q12_FrequencyOfChars {
	public static void main(String[] args) {
		String string="AAABBB CCC    DDDD EEEEEE FFFFFFFFFF  GHT";
		System.out.println(frequency.function(string));
		
	}
	
	public static Frequency<String,String> frequency=str->{
		
		String [] strArr=str.replaceAll(" ", "").split("");
		
		List<String> list=new ArrayList<>(Arrays.asList(strArr));
		
		
		 Map<String,Integer> mapping=new HashMap<>();
		 
		 for(String chr:list) {
			 if(!mapping.containsKey(chr)) {
				 mapping.put(chr, 1);
			 }else {
				 mapping.put(chr, mapping.get(chr)+1);
			 }
		 }
		 
		 return mapping.entrySet()
				       .stream()
				       .map(x->x.getKey()+x.getValue())
				       .collect(Collectors.joining());
		 
	};

}
