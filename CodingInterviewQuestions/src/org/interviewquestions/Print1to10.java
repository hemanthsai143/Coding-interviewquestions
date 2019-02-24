package org.interviewquestions;

public class Print1to10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNumbers(1);
		

	}
	
	public static void printNumbers(int n)
	{
		if(n<=10)
		{
			System.out.println(n);
			printNumbers(n+1);
		}
	}

}
