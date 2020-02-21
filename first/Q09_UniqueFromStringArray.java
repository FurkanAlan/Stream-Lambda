package Codes_InterviewQuestions.first;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Write a program that can print out the unique values from an String  Array
*/
interface UniqueValue<T,X>{
	T func(X x);
}
public class Q09_UniqueFromStringArray {
	public static void main(String[] args) {
String [] strArr= {"Eric","Micheal","Eric","Mark","Stephone","Mahmut","Mevlut","Eren","Eren"};
		
		System.out.println(UnValue.func(strArr));
		
	}
	
	public static UniqueValue<List<String>,String[]> UnValue=Str->{
		Map<String,Integer> mapping=new HashMap<>();
		
		for(String str:Str) {
			if(!mapping.containsKey(str)) {
				mapping.put(str, 1);
			}else {
				mapping.put(str, mapping.get(str)+1);
			}
		}
		
	 return    mapping.entrySet()
	    	   .stream()
	    	   .filter(x->x.getValue()==1)
	    	   .map(x->x.getKey())
	    	   .collect(Collectors.toList());

	};

}
