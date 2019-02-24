package org.collections.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StreamExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=new ArrayList<Integer>();
        l1.add(23);
        l1.add(2);
        l1.add(24);
        l1.add(25);
        l1.stream().forEach(System.out::println);

        Consumer<Integer> c=i->
        {
        	System.out.println("Square of number"+i*i);
        };
        
        l1.stream().forEach(c);
	}

}
