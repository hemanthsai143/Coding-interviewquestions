package org.stringcoding;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ch1="Hemanth";
		String reverse=" ";
		
		for(int i=ch1.length()-1;i>=0;i--)
		{
			reverse=reverse+ch1.charAt(i);
		}

		if(ch1.equals(reverse))
			
			System.out.println("String is palindrome");
		else
		{
			System.out.println("Not a palindrome");
		}
	}
	

}
