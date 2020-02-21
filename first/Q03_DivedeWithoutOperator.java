package Codes_InterviewQuestions.first;
/*
Write a program that can devide two numbers without using division operator
*/
interface Divede<T,X>{
	T function(X x,X y );
	
	
}

public class Q03_DivedeWithoutOperator {
	public static void main(String[] args) {
		System.out.println(divede.function(13, 6));
		
	}
	
	public static Divede<String,Integer> divede=(num1,num2)->{
		String result="";
		if(num2==0) {
			result="Invalid number";
		}
		result+=""+num1+" divede by "+num2+" is ";
			int count=0;
			while(num1>=num2) {
				num1=num1-num2;
				count++;
			}
			
			result+=count+" reminder is "+num1;
		
		return result;
	};

}
