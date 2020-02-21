package Codes_InterviewQuestions.first;



public class Q48_Division_WithoutDivideOrOprerator {
	
	public static void main(String[] args) {
		
		int divident=13;
		int divisor=2;
		
		System.out.println(division(divident, divisor));
	}
	
	public static String division(int divident,int divisor) {
		
		int q=0;
		int r=0;
		
		while(divident>=divisor) {
		divident=divident-divisor;
		  q++;
		  r=divident;
		}
		
		return "quotient :"+q+"   remainder: "+r;
	}

}
