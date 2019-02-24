package org.interviewquestions;

import java.util.HashSet;
import java.util.Set;

public class DuplicateelementsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String duplicates[]=new String[] {"Java","Spring","Java","Hibernate"};
		Set<String> nonduplicates=new HashSet<String>();
		Set<String> duplicates1=new HashSet<String>();
		for(String string:duplicates)
		{
			if(!nonduplicates.contains(string))
			{
				nonduplicates.add(string);
			}
			else
			{
				duplicates1.add(string);
				System.out.println(duplicates1);
		}
		
		

	}
	}

}
