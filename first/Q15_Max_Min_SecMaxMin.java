package Codes_InterviewQuestions.first;
/*
a.write a return method that accepts an int array and returns it as an ArrayList 
    b.write a return method that accepts an Integer array and returns the maximum numberDO NOT USE SORT METHOD
    c.write a return method that accepts an Integer arrayList and returns the second maximum numberDO NOT USE SORT METHOD
    d.write a return method that accepts an Integer array and returns the minimum numberDO NOT USE SORT METHOD 
    e.write a return method that accepts an Integer arrayList and returns the second minimum numberDO NOT USE SORT METHOD
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

interface IntegerOp<T,X>{
	T function(X x);
}
public class Q15_Max_Min_SecMaxMin {
	
	public static void main(String[] args) {
	int[] intArr= {99,2,3,89,100,1,0};
	System.out.println("int Array to ArrayList: "+arrayList.function(intArr));
	System.out.println("Max in ArrayList: "+max.function(arrayList.function(intArr)));
	System.out.println("SecMax in ArrayList: "+secMax.function(arrayList.function(intArr)));
	System.out.println("Min in ArrayList: "+min.function(arrayList.function(intArr)));
	System.out.println("SecMin in ArrayList: "+secMin.function(arrayList.function(intArr)));

	
}
	public static IntegerOp<List<Integer>,int[]> arrayList=intArr->{
	return Arrays.stream(intArr)
			     .boxed()
			     .collect(Collectors.toList());
};

	public static IntegerOp<Integer,List<Integer>> max=list->{
		return list.stream()
				   .max((x,y)->x.compareTo(y))
				   .get();
	};
	public static IntegerOp<Integer,List<Integer>> secMax=list->{
		return list.stream()
				   .sorted((x,y)->y.compareTo(x))
				   .collect(Collectors.toList())
				   .get(1);
	};
	
	public static IntegerOp<Integer,List<Integer>> min=list->{
		return list.stream()
				   .min((x,y)->x.compareTo(y))
				   .get();
	};
	
	public static IntegerOp<Integer,List<Integer>> secMin=list->{
		return list.stream()
				   .sorted((x,y)->x.compareTo(y))
				   .collect(Collectors.toList())
				   .get(1);
	};


}
