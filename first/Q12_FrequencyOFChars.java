package Codes_InterviewQuestions.first;
//write a method that can find the frequency of characters in String

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

interface Frequency<T,X>{
	T function(X x);
}
public class Q12_FrequencyOFChars {
	public static void main(String[] args) {
		
		String str1="aaawwwiidfsjvb";
		System.out.println(freq.function(str1));
		
	}
  public static Frequency<String,String> freq=str->{
	  String [] strArr=str.replaceAll(" ", "").split("");
	  
	  Map<String,Integer> mapping=new HashMap<String,Integer>();
	  for(String st:strArr) {
		  if(!mapping.containsKey(st)) {
			  mapping.put(st, 1);
		  }else {
			  mapping.put(st, mapping.get(st)+1);
		  }
	  }
	  
	  return mapping.entrySet()
			  		.stream()
			  		.map(x->x.getKey()+x.getValue())
			  		.collect(Collectors.joining());
  };
}
