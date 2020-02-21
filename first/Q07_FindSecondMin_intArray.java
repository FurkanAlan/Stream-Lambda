package Codes_InterviewQuestions.first;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
write a program that return the second minimum value from an int array
*/
interface SecMin<T,X>{
	T function(X x);
}


public class Q07_FindSecondMin_intArray {
  public static void main(String[] args) {
	  int[] array= {12,88,99,0,678};
	  System.out.println(secMin.function(array));
	
}	

  
  public static SecMin<Integer,int[]> secMin=arr->{
	  return Arrays.stream(arr)
			  	   .boxed()
			  	   .sorted((x,y)->x.compareTo(y))
			  	   .collect(Collectors.toList())
			  	   .get(1);
			  	   
	  
  };
}
