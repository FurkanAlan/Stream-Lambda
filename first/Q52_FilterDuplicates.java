package Codes_InterviewQuestions.first;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;


interface Filter<T,X>{
	T duplicates(X x);
}
public class Q52_FilterDuplicates {
	public static void main(String[] args) {
		
	}

	public static Filter<List<String>,List<String>> string=strArr->{
		Map<String,Integer> map=new HashMap<>();
		for(String st:strArr) {
			if(!map.containsKey(st)) {
				map.put(st, 1);
			}else {
				map.put(st,map.get(st)+1);
			}
		}
		
		return map.entrySet()
				   .stream()
				   .filter(x->x.getValue()==2)
				   .map(x->x.getKey())
				   .collect(Collectors.toList());
				   
		

	};
}