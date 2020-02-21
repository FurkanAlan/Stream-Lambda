package Codes_InterviewQuestions.first;

import java.util.Arrays;

/*
Array -- N unique integers that sum up to 0
Write a function:

that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0. 
The function can return any such array. For example, given N = 4, t
he function could return [1,0, -3,2] or [-2,1, -4,5]. 
The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is [-1,0,1]
 (but there are many more correct answers).
*/
interface UniqueInt<T,X>{
	T function(X x);
}

public class Q38_UniqueInteger {
	public static void main(String[] args) 
	{
		int num=6;
	
		System.out.println(Arrays.toString(unique.function(num)));
		
	}
	
	public static UniqueInt<int[],Integer> unique=number->{
		int[] arr=new int[number];
		int sum=0;
		for(int i=0;i<number-1;i++) {
			arr[i]=i;
			sum+=i;
		}
		
		arr[number-1]=-sum;
		return arr;
	};
	

}
