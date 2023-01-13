package com.backend;

public class Palindrome {

	public static boolean isPalindrome(int num) {
		
		int rev= num;
		int temp =0;
		while(num%10>0) {
			
			temp=temp*10+( num%10);
			num=num/10;
		}
		if(temp == rev) {
			
			return true;
			
		}else {
			
			return false;
		}
				
	}
	
	public static void main(String[] args) {
		
		int num=12121;
		if(isPalindrome(num)) {
			System.out.println("Number is Palindrome");
		}else
		{
			System.out.println("Number is not a Palindrome");
		}
	}
}
