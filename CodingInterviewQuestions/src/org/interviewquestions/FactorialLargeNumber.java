package org.interviewquestions;

import java.math.BigInteger;

public class FactorialLargeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=20;
		BigInteger fact=BigInteger.ONE;
		for(int i=1;i<=number;i++)
		{
			fact=fact.multiply(BigInteger.valueOf(i));
		}
		System.out.println(fact);

	}

}
