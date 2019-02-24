package org.interviewquestions;

public class FibonacciSeries {
	
	public static void main(String[] args)
	{
	
	int n1=0,n2=1,max=10;
	for(int i=0;i<=max;i++)
	{
		System.out.println(n2);
		int sum=n1+n2;
		n1=n2;
		n2=sum;
		
		
	}

}
}
