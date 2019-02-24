package org.interviewquestions;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		for(int i=0;i<=100;i++)
		{
			int k=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					k=1;
					break;
				}
				if(k==0)
				{
					System.out.println(i);
				}
			}
		}

	}

}
