package Codes_InterviewQuestions;
/*
 Write a program that can devide two numbers without using division operator
 */

interface Divede<T,X>{
	X function(T t,T t1);
};
public class Q03_DivedeWithotOperator {
	public static void main(String[] args) {
		
		System.out.println(divede.function(12, 3));
		
	}
	
	public static Divede<Integer,String> divede=(num1,num2)->{
		String result="Invalid number";
		if(num2==0) {
			return result;
		}
		result=""+num1+" divede by "+num2+" is ";
		
		int count=0;
		while(num1>=num2) {
			num1=num1-num2;
			count++;
		}
		result+=count+" reminder is "+num1;
		
		return result;
	};

}
