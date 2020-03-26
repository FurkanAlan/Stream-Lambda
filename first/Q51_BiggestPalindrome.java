package Codes_InterviewQuestions.first;

import java.util.Arrays;


interface PalindromeX<T,X>{
	T palindrome(X x);
}
public class Q51_BiggestPalindrome {
	public static void main(String[] args) {
		String [] array= {"leVel","Ahmet","Mehmet","asdFghgfdsa"};
		System.out.println(biggest.palindrome(array));
	}
	
	
	public static PalindromeX<String, String[]> biggest=strArr->{
		
		return Arrays.stream(strArr)
					  .filter(x->x.equalsIgnoreCase(Stream.of(x.split("").reduce((x,y)->y+x))
					  .max((x,y)->y.compareTo(x))
					  .get();
		    
		      
	};

}
