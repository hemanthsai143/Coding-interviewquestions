package org.collections.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> l1=new ArrayList<Integer>();
l1.add(12);
l1.add(1);
l1.add(2);
l1.add(23);
l1.add(20);
l1.add(19);

 List<Integer> desendingOrder=  l1.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
   
   System.out.println(desendingOrder);
   List<Integer> ascendingOrder=l1.stream().sorted().collect(Collectors.toList());

	}
	//default sorting order is always ascending order
	
	

}
