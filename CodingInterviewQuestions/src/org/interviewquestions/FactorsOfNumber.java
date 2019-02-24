package org.interviewquestions;

public class FactorsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++)
		{
			System.out.println("Factors of a given number are"+i);
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					System.out.println(" "+j);
				}
			}
		}

	}

}
