package org.interviewquestions;

public class SmallestandLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Array[]=new int[] {1,100,200,1000};
		int smallest=Integer.MAX_VALUE;
		int largest=Integer.MIN_VALUE;
		for(int i:Array)
		{
			if(i>largest)
			{
			largest=i;
				
			}
			




		}
		System.out.println(largest);
		for(int i:Array)
		{
			if(i<smallest)
			{
			smallest=i;
				
			}
			




		}
		System.out.println(smallest);
		
	}
	
}
