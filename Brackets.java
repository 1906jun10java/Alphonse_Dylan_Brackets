package com.revature.java_practice;

public class Brackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isBracket("{[()]}"));
	}
	public static boolean isBracket(String str) //check if a string is a palindrome
	{
		boolean bracket = false;
		char[] charArr = str.toCharArray();
		int x = 0;
		int y = charArr.length-1;
		char opposite = 'f';
		
		
		while(x <= y)
		{
			switch(charArr[x])
			{
			case'{':
				opposite = '}';
				break;
			case '[':
				opposite = ']';
				break;
			case '(':
				opposite = ')';
				break;
			default:
				return false;
			}
			
			if(charArr[y] == opposite)
			{
				bracket = true;
			}
			else
			{
				bracket = false;
				break;
			}
			
			x++;
			y--;
		}
		return bracket;
	}

}
