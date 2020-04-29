package testAlgos;

/*
 * Level: Easy
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:

Input: 121
Output: true
Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
Follow up:

Coud you solve it without converting the integer to a string?
 */
public class Num9_PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(new Num9_PalindromeNumber().isPalindrome(1000000001));

	}
		
	//1534236469
	public boolean isPalindrome(int x) {
		int original = x;
		if (x <0 ) return false;
		long revint = 0;		
		while (x!=0) {			
			int digit = x%10; 
			x= x/10; 			
			revint= revint *10 + digit; 
		}
		if ((int)revint == original) return true;
        return false;		
		
	}
	

/*	public static boolean isPalindrome(int x) {
		
		if (x <0 ) return false;		
		String str = Integer.toString(x);		
		StringBuffer revstr = new StringBuffer();
		revstr = revstr.append(str);
		revstr = revstr.reverse();
		if (str.contentEquals(revstr))return true;		
	    return false;
	   
	}*/
	
}
