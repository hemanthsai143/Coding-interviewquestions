package org.interviewquestions;

import java.util.Arrays;

public class StringAnagramCheck {

	public static void main(String[] args) {
     String st1="java";
     String st2="avaj";
     Boolean result=Anagramcheck(st1, st2);
     
     System.out.println(result);
	
	
	}
	
	public static boolean Anagramcheck(String st1,String st2)
	{
		char[] cst1=st1.toCharArray();
		char[] cst2=st2.toCharArray();
		Arrays.sort(cst1);
		Arrays.sort(cst2);
		
		
		return Arrays.equals(cst1, cst2);
		
	}

}
