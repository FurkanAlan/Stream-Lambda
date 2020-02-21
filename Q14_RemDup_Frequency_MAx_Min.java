package Codes_InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 a.write  a return method that can remove duplicates from a stringEx: RemoveDup("abcabc") ==> returns "abc";
   b.write a return method that accepts two parameter Strings a and b, and returns the total numbers of apperence of b in String aEx: count("abcaba")  ==> returns 3 ;
   c.use the above two methods to write a new method that can find the frequency of charactersEx: frequency("aabcabcabc") ==>a4b3c34
   d. write a return method that can find the maximum number from an Integer arrayList(DO NOT use sort methods of Collections class)
   e.write a return method that can find the minimum number from an Integer arrayList(DO NOT use sort methods of Collections class)
 */
interface AllinOne<T,X>{
	X function(T t);
	
};

interface StrFunc<T,X>{
	X function(T t1,T t2);
};

public class Q14_RemDup_Frequency_MAx_Min {
	public static void main(String[] args) {
		String str1="AABBSSH HUUPP";
		String str2="A";
		List<Integer> list=new ArrayList<Integer>(Arrays.asList(1,6,99,87,567));
		System.out.println("REmove duplicates: "+RemoveDup.function(str1));
		System.out.println("count : "+count.function(str1,str2));
		System.out.println("Maximum: "+findMax.function(list));
		System.out.println("Minimum: "+findMin.function(list));
		
	}
	
	public static AllinOne<String,String> RemoveDup=str->{
		return str.replaceAll(" ", "")
				.chars()
				.distinct()
				.mapToObj(x->String.valueOf((char)x))
				.collect(Collectors.joining());
				
				};

    public static StrFunc<String,Integer> count=(x,y)->{
    	
    	   
   return (int) Arrays.stream(x.replaceAll(" ", "").split(""))
	                  .filter(a->a.contains(y))
	                  .count();
    };
    
    public static AllinOne<String,String> frequency=str->{
    	String [] strArr=str.replaceAll(" ", "").split("");
    	Map<String,Integer> mapping=new HashMap<>();
    	
    	for(String st:strArr) {
    		if(!mapping.containsKey(st)) {
    			mapping.put(st, 1);
    		} else {
    			mapping.put(st, mapping.get(st)+1);
    		}
    	}
    	
    	return mapping.entrySet()
    			      .stream()
    			      .filter(x->x.getValue()==1)
    			      .map(x->x.getKey()+x.getValue())
    			      .collect(Collectors.joining());
    			             
    };
    
    public static AllinOne<List<Integer>,Integer> findMax=list->{
    	return list.stream()
    			   .max((x,y)->x.compareTo(y))
    			   .get();
    };
    
    public static AllinOne<List<Integer>,Integer> findMin=list->{
    	return list.stream()
    			   .min((x,y)->x.compareTo(y))
    			   .get();
    };
}
