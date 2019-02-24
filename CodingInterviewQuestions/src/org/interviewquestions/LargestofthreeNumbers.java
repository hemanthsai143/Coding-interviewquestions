package org.interviewquestions;

public class LargestofthreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,60,0};
		if(a[0]>a[1] && a[0]>a[2])
		{
			System.out.println("a is biggest");
		}
		else if(a[1]>a[2])
		{
			System.out.println(a[1]+"is biggest");
		}
		else
		{
			System.out.println(a[2]+"is biggest");
		}

	}

}
