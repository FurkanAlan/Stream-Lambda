package Codes_InterviewQuestions.first;

interface OddEven<T,X>{
	T func(X x);
}
public class Q31_OddEven {
	public static void main(String[] args) {
		
		System.out.println(numOP.func(56));
	}
	
	public static OddEven<String,Integer> numOP=number->{
		return number%2==0? "Even":"Odd";
	};

}
