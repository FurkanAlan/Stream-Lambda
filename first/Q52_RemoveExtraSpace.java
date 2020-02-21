package Codes_InterviewQuestions.first;

import java.util.Arrays;
import java.util.stream.Collectors;

interface RemoveExtSpace<T,X>{
	T extraSpace(X x);
}
public class Q52_RemoveExtraSpace {
       public static void main(String[] args) {
    	   String str="Ali veli meli       ss  sss  s ";
    	   System.out.println(remove.extraSpace(str));
		
	}
       
       public static RemoveExtSpace<String,String> remove=str->{
    	   return Arrays.stream(str.split(" "))
    			        .map(x->x.trim())
    			        .collect(Collectors.joining());
       };
}
