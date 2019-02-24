package org.interviewquestions;

public class MissingNumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,2,3,4,6};
		int number=missingNumber(array,6);
		System.out.println(number);
	}
		private static int missingNumber(int [] array,int n) {
			int expectedsum=(n*(n+1)/2);
			int actualsum=0;
			for(int i:array)
			{
				actualsum=actualsum+i;
			}
			
			return expectedsum-actualsum;
		}

	

}
