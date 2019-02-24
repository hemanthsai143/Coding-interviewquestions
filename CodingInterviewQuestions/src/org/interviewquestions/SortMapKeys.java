package org.interviewquestions;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> unsortedMap=new HashMap<String,String>();
		
		unsortedMap.put("Pineapple", "yellow");
		unsortedMap.put("Apple", "Red");
		unsortedMap.put("Grape", "blue");
		for(Map.Entry<String, String> m1:unsortedMap.entrySet())
		{
			System.out.println("unsorted keys"+m1.getKey());
		}
		
		TreeMap<String, String> sortedMap=new TreeMap<String,String>(unsortedMap);
		for(Map.Entry<String, String> m1:sortedMap.entrySet())
		{
			System.out.println("sorted keys"+m1.getKey());
		}

	}

}
