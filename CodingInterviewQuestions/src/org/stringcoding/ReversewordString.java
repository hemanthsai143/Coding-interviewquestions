package org.stringcoding;

public class ReversewordString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String originalString ="Hi Hemanth How are u";
		String[] words=originalString.split(" ");
		String reverseString=" ";
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			String reverseword=" ";
			for(int j=word.length()-1;j>=0;j--)
			{
				reverseword=reverseword+word.charAt(j);
			}
			reverseString=reverseString+reverseword+" ";
		}
		System.out.println(originalString);
		System.out.println(reverseString);
	}

}
