package org.interviewquestions;

public class PyramidExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int odd=1;
		int noofspaces=3;
		
		for(int i=1;i<=4;i++)
		{
			
			int k=0;
			for(int j=1;j<=noofspaces;j++)
			{
				System.out.print(" ");
			}
		
		for(int j=1;j<=odd;j++)
		{
			
			if(j<=i)
			{
				k=k+1;
			}
			else 
			{
				k=k-1;
			}
			System.out.print(k);
		}
		System.out.println();
		odd=odd+2;
		noofspaces=noofspaces-1;

	}
	}
}
