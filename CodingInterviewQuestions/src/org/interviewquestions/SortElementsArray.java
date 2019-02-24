package org.interviewquestions;

import java.util.Arrays;
import java.util.Collections;

public class SortElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"one","five","three","two"};
		System.out.println("Before sorting");
		for(String str1:str)
		{
			System.out.println(str1);
		}

		System.out.println("After sorting");
		
		Arrays.sort(str);
		
		for(String str2:str)
		{
			System.out.println(str2);
		}
		
		Arrays.sort(str,Collections.reverseOrder());
		for(String str3:str)
		{
			System.out.println(str3);
		}
	}

}
