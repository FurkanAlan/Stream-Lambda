package Codes_InterviewQuestions;
// Write a program that can print out the unique values from an int Array
//Ex:if arr -> {1,1,2,3,3}output: 2if arr -> {1,2,2,3,4,4}output:  1  32

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

interface UniqueValues<T,X>{
	X function(T t);
};
public class Q08_UniqValue_fromIntArray {
	public static void main(String[] args) {
		int[] arr={1,2,2,3,4,4,8,9,7,7};
		System.out.println(uniqueVAlues.function(arr));
	}
	
	public static UniqueValues<int[],List<Integer>> uniqueVAlues=arr->{
		Map<Integer,Integer> mapping=new HashMap<>();
		
		List<Integer> listInt=Arrays.stream(arr)
									.boxed()
									.collect(Collectors.toList());
		
		for(Integer number:listInt) {
			if(!mapping.containsKey(number)) {
				mapping.put(number, 1);
			}else {
				mapping.put(number,mapping.get(number)+1);
			}
			
		}
		return mapping.entrySet()
				      .stream()
				      .filter(x->x.getValue()==1)
				      .map(x->x.getKey())
				      .collect(Collectors.toList());
	};

}
