package org.stringcoding;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static String removeDuplicates(String str)
	{
		Set<Character> s1=new HashSet<Character>();
		StringBuilder st=new StringBuilder();
		
		for(int i=0;i<str.length();i++)
		{
			Character ch=str.charAt(i);
			while(!s1.contains(ch));
			s1.add(ch);
			st.append(ch);
			System.out.println(st);
		}
		
		
		return st.toString();
		
		
		
		
	}
	public static void main(String[] args) {
		String str="sandeep";
		System.out.println(removeDuplicates(str));
		

	}

}
