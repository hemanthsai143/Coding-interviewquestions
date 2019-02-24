package org.collections.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=new ArrayList<Integer>();
        l1.add(23);
        l1.add(2);
        l1.add(24);
        l1.add(25);
        
       Integer[] i= l1.stream().toArray(Integer[]::new);
for(Integer i1:i)
{
	System.out.println(i1);
}
   Stream<Integer> s=Stream.of(9,34,456,555);
   s.forEach(System.out::println);
   
	}

	
}
