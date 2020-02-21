package Codes_InterviewQuestions;
/*
 write a method that can remove all even numbers from a List Interface
 write a method that can remove all odd numbers from a List Interface
 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

interface EvenOdd<T,X>{
	 X function(T t);
};
public class Q16_Remove_EvenOrOdd {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,99,100));
		System.out.println("ArrayList: "+list);
		System.out.println("Remove even numbers :"+removeEven.function(list));
		System.out.println("remove odd numbers: " +removeOdd.function(list));
		
		
	}
	
	public static EvenOdd<List<Integer>,List<Integer>> removeEven=list->{
	  
		return list.stream()
				   .filter(x->x%2!=0)
				   .collect(Collectors.toList());
	};
	public static EvenOdd<List<Integer>,List<Integer>> removeOdd=list->{
      return list.stream()
                 .filter(x->x%2!=1)
                 .collect(Collectors.toList());
};

}
