package Codes_InterviewQuestions;
/*
 Write a program that can print out the unique values from an String  Array
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

interface UniqueString<T,X>{
	X function(T t);
};
public class Q09_UniqueValue_from_StringArray {
	public static void main(String[] args) {
		String [] strArr= {"Eric","Micheal","Eric","Mark","Stephone","Mahmut","Mevlut","Eren","Eren"};
		
		System.out.println(uniQueString.function(strArr));
		
		Map<Integer,String> hmap=new HashMap<>();
		
		    hmap.put(5,"A");
		    hmap.put(6, "Z");
		    hmap.put(1,"B");
		    hmap.put(3, "C");
		    hmap.put(2,"D");
		    hmap.put(99, "E");
		    
		    System.out.println(hmap);
		    
		    hmap.entrySet().stream()
		                   .sorted((x,y)->x.getValue().compareTo(y.getValue()))
		                   .forEach(x->System.out.println(x));
		    
		    
		    
		    
	}
	
	
	public static UniqueString<String[],List<String>>  	uniQueString=strArr->{
		List<String>  strlist=Arrays.stream(strArr).collect(Collectors.toList());
		Map<String, Integer> mapping=new HashMap<>();
		for(String word:strArr) {
			if(!mapping.containsKey(word)) {
				mapping.put(word,1);
			}else {
				mapping.put(word, mapping.get(word)+1);
			}
		}
		
		return mapping.entrySet()
					  .stream()
					  .filter(x->x.getValue()==1)
					  .map(x->x.getKey())
					  .sorted()
					  .collect(Collectors.toList());
	};

}
