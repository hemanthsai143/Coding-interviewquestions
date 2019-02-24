package org.interviewquestions;



public class PyramidExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5,num=1,d,c;
		
		for(c=5;c<=n;c--)
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
