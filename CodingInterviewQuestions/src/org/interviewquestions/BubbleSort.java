package org.interviewquestions;

public class BubbleSort {

	public static void bubblesort(int[] arrayint)
	{
		for(int i=0;i<arrayint.length;i++)
		{
			for(int j=1;j<(arrayint.length)-i;j++)
			{
				if(arrayint[j-1]>arrayint[j])
				{
					int temp;
					temp=arrayint[j-1];
					arrayint[j-1]=arrayint[j];
					arrayint[j]=temp;
					
					
					
				}
			}
		}
		
		for(int i:arrayint)
		{
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrayint= {5,7,8,9,1};
		bubblesort(arrayint);
		

	}

}
;