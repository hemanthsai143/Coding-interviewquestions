package org.collections.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   List<Integer> l1=new ArrayList<Integer>();
   l1.add(2);
   l1.add(23);
   l1.add(24);
   l1.add(25);
   l1.add(26);
   List<Integer> l2=l1.stream().filter(i->i%2==0).collect(Collectors.toList());
   System.out.println(l2);
   
   List<Integer> marks=new ArrayList<Integer>();
   marks.add(21);
   marks.add(24);
   marks.add(22);
   marks.add(23);
    List<Integer> updatedMarks= marks.stream().map(i->i+5).collect(Collectors.toList());
    System.out.println(updatedMarks);
    
    long failedStudent=marks.stream().filter(m->m<35).count();
   System.out.println("number of failed students "+ failedStudent);
    List sortedOrder=marks.stream().sorted().collect(Collectors.toList());
    System.out.println(sortedOrder);
	}

}
