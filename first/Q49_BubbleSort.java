package Codes_InterviewQuestions.first;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

interface Bubble<T,X>{
	T sort(X t);
}
public class Q49_BubbleSort {
	public static void main(String[] args) {
		
		int [] intArr= {3,99,0,2,88};
		
		System.out.println(bubble.sort(intArr));
		
	}
	
	public static Bubble<List<Integer>,int[]> bubble=arr->{
		return Arrays.stream(arr)
				     .boxed()
				     .sorted((x,y)->x.compareTo(y))
				     .collect(Collectors.toList());
	};

}
