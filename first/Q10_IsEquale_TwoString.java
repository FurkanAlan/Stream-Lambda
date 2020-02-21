package Codes_InterviewQuestions.first;
/*
write a program that can check if two Strings are build out of same    Ex:       
 if str1 = "aabbbc";  str2 ="cab";        output: true        if str1 ="abcd";  str2 ="abc";        output: false
*/
interface IsEqual<T,X>{
	T function(X x1,X x2);
}
public class Q10_IsEquale_TwoString {
	public static void main(String[] args) {
		String str1="abcd";
		String str2="abc";
		System.out.println(isEqual.function(str1, str2));
		
	}
	
	public static IsEqual<Boolean,String> isEqual=(str1,str2)->{
		boolean b=true;
		
		for(int i=0;i<str2.length();i++) {
			if(str1.contains(str2.substring(i))) {
				b=true;
				
			}else {b=false;}
		}
		
		return b&&str1.length()%str2.length()==0;
	};

}
