package Codes_InterviewQuestions;
/*
 a.write a return method that accepts an int array and returns it as an ArrayList 
     b.write a return method that accepts an Integer array and returns the maximum numberDO NOT USE SORT METHOD
     c.write a return method that accepts an Integer arrayList and returns the second maximum numberDO NOT USE SORT METHOD
     d.write a return method that accepts an Integer array and returns the minimum numberDO NOT USE SORT METHOD 
     e.write a return method that accepts an Integer arrayList and returns the second minimum numberDO NOT USE SORT METHOD
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

interface IntegerNumbers<T,X>{
	X function(T t);
};
public class Q15_Max_SecMax_Min_SecMin {
	public static void main(String[] args) {
		int[] intArr= {99,2,3,89,100,1,0};
		arrayList.function(intArr);
		List<Integer> list=new ArrayList<Integer>(Arrays.asList(99,2,3,89,100,1,0));
		System.out.println("intArray to ArrayList :"+arrayList.function(intArr));
		System.out.println("Maximum Number: "+maxNumber.function(list));
		System.out.println("Minimum Number: "+minNumber.function(list));
		System.out.println("Secon dMaximum Number: "+secMaxNumber.function(list));
		System.out.println("Secon dMinimum Number: "+secMinNumber.function(list));

		

		
	}
	
	public static IntegerNumbers<int[],List<Integer>> arrayList=arr->{
		return Arrays.stream(arr)
		      .boxed()
		      .collect(Collectors.toList());
	};
	
	
	public static IntegerNumbers<List<Integer>,Integer> maxNumber=list->{
		return list.stream()
				   .max((x,y)->x.compareTo(y))
				   .get();
	};
	public static IntegerNumbers<List<Integer>,Integer> secMaxNumber=list->{
		return list.stream()
				   .sorted((x,y)->y.compareTo(x))
				   .collect(Collectors.toList())
				   .get(1);
	};
	
	public static IntegerNumbers<List<Integer>,Integer> minNumber=list->{
		return list.stream()
				   .min((x,y)->x.compareTo(y))
				   .get();
	};
	public static IntegerNumbers<List<Integer>,Integer> secMinNumber=list->{
		return list.stream()
				   .sorted((x,y)->x.compareTo(y))
				   .collect(Collectors.toList())
				   .get(1);
				   
	};

}
