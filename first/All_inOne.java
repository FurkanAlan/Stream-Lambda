package Codes_InterviewQuestions.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface Inspire<T,X>{
	T function(X x);
}

public class All_inOne {
	
	public static void main(String[] args) {
		int fibolimit=12;
		String strings="AABBCCCDEEEEFG   HJJJ L";
		System.out.println(strings+"'s frequency is "+frequency.function(strings));
		System.out.println(strings+"'s remove duplucates is "+removeDup.function(strings));
		System.out.println(strings+"'s unique characters is "+uniqueChars.function(strings));
	}

	public static Inspire<String,String> frequency=str->{
		List<String> list=new ArrayList<>(Arrays.asList(str.replaceAll(" ", "").split("")));
		Map<String,Integer> map=new HashMap<>();
		
		for(String st:list) {
			if(!map.containsKey(st)) {
				map.put(st,1);
				
			}else {
				map.put(st, map.get(st)+1);
			}
		}
		
		return map.entrySet()
				  .stream()
				  .map(x->x.getKey()+x.getValue())
				  .collect(Collectors.joining());
		
	};
	
	public static Inspire<String,String> removeDup=str->{
		
	return str.replaceAll(" ","")
			  .chars()
			  .distinct()
			  .mapToObj(x->String.valueOf((char)x))
			  .collect(Collectors.joining());
		
	};
	public static Inspire<String,String> uniqueChars=str->{
		List<String> list=new ArrayList<>(Arrays.asList(str.replaceAll(" ", "").split("")));
		Map<String,Integer> map=new HashMap<>();
		
		for(String st:list) {
			if(!map.containsKey(st)) {
				map.put(st,1);
				
			}else {
				map.put(st, map.get(st)+1);
			}
		}
		
		return map.entrySet()
				  .stream()
				  .filter(x->x.getValue()==1)
				  .map(x->x.getKey())
				  .collect(Collectors.joining());
		
	};
	
	public static Inspire<List<Integer>,Integer> fibonacci=number->{
		return Stream.iterate(new int[] {0,1},arr->new int[] {arr[1],arr[0]+arr[1]})
			       .limit(number)
			       .map(x->x[0])
			       .collect(Collectors.toList());
	};
	
}
