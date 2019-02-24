package org.collections.exam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l1=new ArrayList<String>();
		l1.add("AA");
		l1.add("A");
		l1.add("AAA");
		l1.add("AAAA");
		l1.add("AAA");
		Comparator<String> c=(s1,s2)->{
		                       int i1=s1.length();
		                       int i2=s2.length();
		                       if(i1<i2) return -1;
		                       else if(i1>i2) return 1;
		                       else return s1.compareTo(s2);
		};
		
		List l2=l1.stream().sorted(c).collect(Collectors.toList());
		System.out.println(l2);
	}

}
