package Codes_InterviewQuestions.first;

public class Q44_SumOfDigits {
	public static void main(String[] args) {
		
		int a=123;
		System.out.println(sumOfDigit(a));
		
	}
	
	public static int sumOfDigit(int n) {
		int sum;
		for(sum=0;n>0;sum+=n%10,n/=10);
		return sum;
		
	}

}
