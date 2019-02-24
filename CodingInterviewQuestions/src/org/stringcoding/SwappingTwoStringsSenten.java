package org.stringcoding;

public class SwappingTwoStringsSenten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="you how are you Hi";
		String lastString=" ";
		int i=0;
		
		String firstString=" ";
		for(i=0;i<str.length();)
		{
			while(str.charAt(i)!=' ')
			{
			firstString=firstString+str.charAt(i);
			i++;
		}
       
		break;
	}

	int j=0;
	for(j=str.length()-1;j>=i;)
	{
		while(str.charAt(j)!=' ')
		{
			lastString=lastString+str.charAt(j);
			j--;
		}
		break;
	}
	
	System.out.println(lastString);
	
	for(int m=j;m>=i;m--)
	{
		System.out.print(str.charAt(m));
	}
	
	System.out.print(firstString);
}
}
