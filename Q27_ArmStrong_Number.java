package Codes_InterviewQuestions;
//ArmStrong Number  153=1*1*1+5*5*5+3*3*3

interface ArmStrong<T,X>{
	T function(X x);
}

public class Q27_ArmStrong_Number {
	
	public static void main(String[] args) {
		
		System.out.println(strong.function(153));
		
	}
	
	public static ArmStrong<String,Integer> strong=number->{
		int temp=number;
		int r,sum=0;
		while(number>0) {
			r=number%10;
			number=number/10;
			sum+=r*r*r;
		}
		
		return temp==sum?"Number is ArmStrong":"Number is not ArmStrong";
	};

}
