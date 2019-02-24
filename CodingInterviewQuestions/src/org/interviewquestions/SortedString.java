package org.interviewquestions;

import java.util.Arrays;

public class SortedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Sandeep";
		char ch[]=str.toCharArray();
		Arrays.sort(ch);
		String sorted=new String(ch);
		System.out.println(sorted);

	}

}
