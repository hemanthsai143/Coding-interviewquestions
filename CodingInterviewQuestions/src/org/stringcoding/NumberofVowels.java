package org.stringcoding;

public class NumberofVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  str="aeiou";
		char [] str1=str.toCharArray();
		int count=0;
		for(char str2:str1)
		{
			switch(str2)
			{
			case 'a':
			case 'e':
			case  'i':
			case  'o':
			case  'u':
				
				count++;
				break;
			
		}
			
			
	}
			
		System.out.println(count);
	}
	
}
