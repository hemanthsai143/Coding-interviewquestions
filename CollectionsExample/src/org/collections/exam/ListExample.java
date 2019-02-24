package org.collections.exam;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l1=new ArrayList<String>();
		l1.add("Hemanth");
		l1.add("Krishna");
		l1.add("Naresh");
		List<String> l2=new ArrayList<String>();
		l2.add("Suhas");
		l2.add("jagadeesh");
		l1.addAll(l2);
		System.out.println(l1);
	}

}
