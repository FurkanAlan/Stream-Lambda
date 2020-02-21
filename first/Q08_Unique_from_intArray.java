package Codes_InterviewQuestions.first;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Write a program that can print out the unique values from an int Array
//Ex:if arr -> {1,1,2,3,3}output: 2if arr -> {1,2,2,3,4,4}output:  1  32
interface Unique<T,X>{
	T function(X x);
}
public class Q08_Unique_from_intArray {
	public static void main(String[] args) {
		int[] arr={1,2,2,3,4,4,8,9,7,7};
		System.out.println(uniqueIntArr.function(arr));
		
	}
	
	public static Unique<List<Integer>,int[]> uniqueIntArr=arr->{
		Map<Integer,Integer> mapping=new HashMap<>();
		for(Integer in:arr) {
			if(!mapping.containsKey(in)) {
				mapping.put(in,1);
			}else {
				mapping.put(in, mapping.get(in)+1);
			}
		}
	   return mapping.entrySet()
			   		 .stream()
			   		 .filter(x->x.getValue()==1)
			   		 .map(x->x.getKey())
			   		 .collect(Collectors.toList());
			   					
	};

}
