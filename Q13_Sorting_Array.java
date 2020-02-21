package Codes_InterviewQuestions;


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

public class Q13_Sorting_Array {
	
	
	public static void main(String[] args) {
		int[] intArr= {1,4,9,60,45,99};
		double[] doubArr= {1.2,4.6,9.0};
		char[] chrArr= {'A','C','D','E'};
		String [] strArr= {"Ali","Zeyd","Mevlut","Suad"};
		
		System.out.println(sorting(intArr));
				
	System.out.println(sorting(doubArr));
		
	System.out.println(	sorting(chrArr));
		
	System.out.println(sorting(strArr));
	}

	private static List<String> sorting(String[] strArr) {
	return	Arrays.stream(strArr)
		      .sorted((x,y)->x.compareToIgnoreCase(y))
		      .collect(Collectors.toList());
			  
		
	}

	private static List<Character> sorting(char[] chrArr) {
		List<Character> list=new ArrayList<Character>();
		
		      
		
		for(Character ch:chrArr ) {
			list.add(ch);
		}
		
		return  list.stream()
				     .sorted((x,y)->y.compareTo(x))
				     .collect(Collectors.toList());
		
		
		 
				     
		
	}

	private static List<Double> sorting(double[] doubArr) {
		return Arrays.stream(doubArr)
				  .boxed()
			      .sorted((x,y)->y.compareTo(x))
			      .collect(Collectors.toList());
			
		
	}

	private static List<Integer> sorting(int[] intArr) {
		return Arrays.stream(intArr)
				  .boxed()
			      .sorted((x,y)->y.compareTo(x))
			      .collect(Collectors.toList());
		
	}
	
	

}
