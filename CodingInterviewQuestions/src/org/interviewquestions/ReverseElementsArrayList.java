package org.interviewquestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReverseElementsArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> s1=new ArrayList<Integer>();
		s1.add(1);
		s1.add(2);
		s1.add(3);
		Collections.reverse(s1);
		for(int s2:s1)
		{
			System.out.println(s2);
		}
		

	}

}
