package Codes_InterviewQuestions;
/*
 write a program that can check if two Strings are build out of same    Ex:       
  if str1 = "aabbbc";  str2 ="cab";        output: true        if str1 ="abcd";  str2 ="abc";        output: false
 */
interface IsEqual<T,X>{
	X function(T t1,T t2);
};
public class Q10_Equla_TwoString {
	public static void main(String[] args) {
		String str1="asa";
		String str2="asa";
		
		System.out.println(isEqula.function(str1, str2));
	}
	
	public static IsEqual<String,Boolean> isEqula=(x,y)->{
		return x.equals(y);
	};

}
