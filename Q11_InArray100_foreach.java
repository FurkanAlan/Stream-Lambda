package Codes_InterviewQuestions;

import java.util.Arrays;
import java.util.stream.Stream;

/*
 create an int array called numbers that has length of 100
      2.  assign 1~100 to the array' indexes 
      3. use for each loop to rpint out all the even numbers.
 */ 
public class Q11_InArray100_foreach {
public static void main(String[] args) {
	
	int [] array=new int[100];
	for (int i=0;i<100;i++) {
		array[i]=i+1;
	}
	
	Arrays.stream(array)
		  .filter(x->x%2==0)
		  .forEach(x->System.out.println(x));
	
	
		
		  
}
}
