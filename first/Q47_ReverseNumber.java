package Codes_InterviewQuestions.first;


import java.util.stream.Collectors;
import java.util.stream.Stream;

interface ReverseNumber<T,X>{
	T function(X x);
}

public class Q47_ReverseNumber {
	
	public static void main(String[] args) {
		int r=4567;
		System.out.println(reverse.function(r));
		System.out.println(general.function(r));
	}
	public static Reverse<String,Integer> reverse=number->{
		
			return new StringBuilder(Stream.of(String.valueOf(number).split(""))
		                                    .collect(Collectors.joining()))
					                        .reverse().toString();
	};
	
	
	public static Reverse<Integer,Integer> general=number->{
		int reverse=0;
		int reminder=0;
		do {
			reminder=number%10;
			reverse=reverse*10+reminder;
			number=number/10;
		}while(number>0);
		
		return reverse;
	};

}
