package Codes_InterviewQuestions.first;

import java.util.List;
import java.util.stream.Collectors;

/*
write a method that can remove all even numbers from a List Interface
write a method that can remove all odd numbers from a List Interface

*/
interface RemoveOddEven<T,X>{
	T function(X x);
}
public class Q16_Remove_EvenOrOdd {
	public static void main(String[] args) {
		
		
	}
	
	public static RemoveOddEven<List<Integer>,List<Integer>> removeEven=list->{
		
		
		return list.stream()
				   .filter(x->x%2==1)
				   .collect(Collectors.toList());
	};
	public static RemoveOddEven<List<Integer>,List<Integer>> removeOdd=list->{
		return list.stream()
				   .filter(x->x%2==0)
				   .collect(Collectors.toList());
	};

}
