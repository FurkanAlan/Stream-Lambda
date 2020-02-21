package Codes_InterviewQuestions;
//find perfect number

interface Perfect<T,X>{
	T function(X x);
}
public class Q26_PerfectNumber {
	public static void main(String[] args) {
		System.out.println(perfect.function(29));
		
	}
	
	public static Perfect<String,Integer> perfect=number->{
		
		int sum=0;
		for(int i=1;i<number;i++) {
			if(number%i==0)
				sum+=i;
		}
	return number==sum?"Number is Perfect":"Number is not Perfect";
	};

}
