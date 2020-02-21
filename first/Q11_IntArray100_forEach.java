package Codes_InterviewQuestions.first;
/*
create an int array called numbers that has length of 100
     2.  assign 1~100 to the array' indexes 
     3. use for each loop to rpint out all the even numbers.
*/

import java.util.Arrays;

public class Q11_IntArray100_forEach {
	public static void main(String[] args) {
		int [] arr=new int[100];
		for(int i=0;i<100;i++) {
			arr[i]=i+1;
		}
		
		Arrays.stream(arr)
			  .filter(x->x%2==0)
			  .forEach(x->System.out.print(x+" "));
		
	}

}
