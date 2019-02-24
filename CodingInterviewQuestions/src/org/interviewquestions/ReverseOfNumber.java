package org.interviewquestions;

public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Integer num=123;
   String st=String.valueOf(num);
   
   String reverse=" ";
   for(int i=st.length()-1;i>=0;i--)
   {
	   reverse=reverse+st.charAt(i);
	   
   }
   
   System.out.println(reverse);
	}

}
