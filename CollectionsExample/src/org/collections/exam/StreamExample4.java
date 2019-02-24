package org.collections.exam;

import java.util.ArrayList;
import java.util.List;

public class StreamExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=new ArrayList<Integer>();
         l1.add(23);
         l1.add(2);
         l1.add(24);
         l1.add(25);
         
        Integer min=l1.stream().min((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(min);
        Integer max=l1.stream().max((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(max);
	}

}
