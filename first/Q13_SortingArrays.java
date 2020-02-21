package Codes_InterviewQuestions.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
   a.write a return method that accepts an int array and sorts it in descending order.
 	b.write a return method that accepts a double array and sorts it in descending order.
 	c.write a return method that accepts a char array and sorts it in descending order.
    d.write a return method that accepts a String array and sorts it in descending order
 Hint: method overloading is prefered here
 */
interface Sorting<T,X>{
	T function(X x);
}

public class Q13_SortingArrays {
	
	public static void main(String[] args) {
		int[] intArr= {1,4,9,60,45,99};
		double[] doubArr= {1.2,4.6,9.0};
		char[] chrArr= {'A','C','D','E'};
		String [] strArr= {"Ali","Zeyd","Mevlut","Suad"};
		
		
		System.out.println(descending(intArr));
		System.out.println(descending(doubArr));
		System.out.println(descending(chrArr));
		System.out.println(descending(strArr));
		
	}
	
	
	public static List<Integer> descending(int[]intArr) {
		return Arrays.stream(intArr)
					 .boxed()
					 .sorted((x,y)->y.compareTo(x))
					 .collect(Collectors.toList());
		
	}
	
	public static List<Double> descending(double []intDouble) {
		return Arrays.stream(intDouble)
					 .boxed()
					 .sorted((x,y)->y.compareTo(x))
					 .collect(Collectors.toList());
		
	}
	
	public static List<Character> descending(char []chArr) {
		
		List<Character> chrlist=new ArrayList<Character>();
		for(Character chr:chArr) {
			chrlist.add(chr);
		}
		return chrlist.stream()
					 .sorted((x,y)->y.compareTo(x))
					 .collect(Collectors.toList());
		
	}
	
	public static List<String> descending(String []strArr) {
		return Arrays.stream(strArr)
					 .sorted((x,y)->y.compareTo(x))
					 .collect(Collectors.toList());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
