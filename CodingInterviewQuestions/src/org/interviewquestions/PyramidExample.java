package org.interviewquestions;

import java.util.Scanner;

public class PyramidExample {

	public static void main(String arags[])
	{
		int n,num=1,d,c;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(c=5;c>=1;c--)
		{
			num=1;
			for(d=5;d>=c;d--)
			{
				System.out.print(num+" ");
				num++;
			}
			
			System.out.println(" ");
		}
		
	}
}
