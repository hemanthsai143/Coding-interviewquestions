package org.collections.exam;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(1, "Hemanth");
		m1.put(2, "Krishna");
		m1.put(3,"Subbu");
		for(Map.Entry<Integer, String> m:m1.entrySet())
		{
			System.out.println("key"+ m.getKey()+ "value"+m.getValue());
		}
		

	}

}
