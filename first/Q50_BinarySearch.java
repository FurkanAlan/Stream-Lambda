package Codes_InterviewQuestions.first;

import java.util.Arrays;
import java.util.Optional;

interface Binary<T,X,Y>{
	T search(X x,Y y);
}
public class Q50_BinarySearch {
	
	public static void main(String[] args) {
		
		int [] array= {29,8,0,3,45,3};
		int i=3;
		
		System.out.println(binary.search(array, i));
		
	}
	
	public static Binary<String,int[],Integer> binary=(int [] arr,Integer n)->{
		Optional<?> i= Arrays.stream(arr)
		      .boxed()
		      .filter(x->x==n)
		      .findAny();
		      
		     
		
		return i.isEmpty()? "elements is not found":"element is: "+i.get();
		     
		      
	};

}
