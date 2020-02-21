package Codes_InterviewQuestions.first;

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
interface FiveInOne<T,X>{
	T function(X x);
	//T function1(X x1,X x2);
	
}
public class Q14_RemDup_Freq_Max_Min {
	
	public static void main(String[] args) {
		String str1="AABBSSH HUUPP";
		String str2="A";
		List<Integer> list=new ArrayList<Integer>(Arrays.asList(1,6,99,87,567));
		System.out.println(RemoveDup.function(str1));
		System.out.println(count(str1, str2));
		System.out.println(frequency.function(str1));
		
		System.out.println(max.function(list));
		System.out.println(min.function(list));
		
	}
  public static FiveInOne<String,String> RemoveDup=str->{
	  return Arrays.stream(str.replaceAll(" ", "").split(""))
			       .distinct()
			       .collect(Collectors.joining());
  };
  
  public static int count(String a,String b) {
	  return (int) Arrays.stream(a.replaceAll(" ","").split(""))
			        .filter(x->x.contains(b))
			        .count();
		}
  
  
  
  public static FiveInOne<String,String> frequency=str->{
	  Map<String,Integer> mapping=new HashMap<>();
	  
	  String[] strArr=str.replaceAll(" ", "").split("");
	  for(String st:strArr) {
		  if(!mapping.containsKey(st)) {
			  mapping.put(st, 1);
		  }else {
			  mapping.put(st, mapping.get(st)+1);
		  }
	  }
	  return mapping.entrySet()
			  		.stream()
			  		.map(x->x.getKey()+x.getValue())
			  		.collect(Collectors.joining());
  };
  
  public static FiveInOne<Integer,List<Integer>> max=list->{
	  return list.stream()
			     .max((x,y)->x.compareTo(y))
			     .get();
			  
  };
  
  public static FiveInOne<Integer,List<Integer>> min=list->{
	  return list.stream()
			     .min((x,y)->x.compareTo(y))
			     .get();
			  
  };
}				
