package Codes_InterviewQuestions.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
ArrayList -- Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
*/
interface Some<T>{
	T function(T t);
}
public class Q35_RemoveSome {
	public static void main(String[] args) {
		List<Integer> lst=new ArrayList<>(Arrays.asList(2,3,4,5,6,7,8,9,101,200,300));
		System.out.println(remove.function(lst));
		
	}
	public static Some<List<Integer>> remove=list->{
		return list.stream()
				   .filter(x->x>100)
				   .collect(Collectors.toList());
	};
	

}
