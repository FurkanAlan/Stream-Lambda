package Codes_InterviewQuestions.first;

import java.util.stream.Stream;

/*
Numbers -- FINRA
Write a method which prints out the numbers from 1 to 30 
but for numbers which are a multiple of 3, print "FIN" instead of the number 
and for numbers which are a multiple of 5, print "RA" instead of the number. 
for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
*/
interface FINRA<T,X>{
	T function(X x);
}

public class Q32_FINRA {
	public static void main(String[] args) {
		System.out.println(finra.function(30));
		
	}
	public static FINRA<String,Integer> finra=number->{
		String finra="";
		for(int i=0;i<=30;i++) {
			if(i%3==0&&i%5==0) {
				finra+="FINRA";
			}else if(i%3==0) {
				finra+="FIN";
			}else if(i%5==0) {
				finra+="RA";
			}
			else {
				finra+=i;
			}
		}
		return finra;
	};

}
