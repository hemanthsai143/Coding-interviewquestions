package org.interviewquestions;

import java.util.Scanner;

public class FloyidsTriangle {

	public static void main(String[] args) {
		int n,num=1,d,c;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(c=1;c<=n;c++)
		{
			num=1;
			for(d=1;d<=c;d++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println(" ");
		}
		

	}

}
