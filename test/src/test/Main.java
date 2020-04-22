package test;
/*
 * Given a string s and a string t, check if s is subsequence of t.

You may assume that there is only lower case English letters in both s and t. t is potentially a very long (length ~= 500,000) string, and s is a short string (<=100).

A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, "ace" is a subsequence of "abcde" while "aec" is not).

Example 1:
s = "abc", t = "ahbgdc"

Return true.

Example 2:
s = "axc", t = "ahbgdc"

Return false.
 * */

public class Main {

	public static void main(String[] args) {
	//	System.out.println("Hello");
	//	System.out.println(isSubsequence("a","ahbgdc"));
		
		String s1 = "Hello";
		s1+="GM";
		String s2 = "Hello";
		s2+="GM";
		String s3 = s2;
		s3+="GD";
	//	System.out.println(Integer.toHexString(s1.hashCode());
		System.out.println(s2);
		//if(s1==s2) System.out.println("True");

	}
	
	public static boolean isSubsequence(String s, String t) {
        
        char[] carray = s.toCharArray();
        int l = 0;
        
       // for(char c : carray){
            while(l<t.length() || l!=-1){
                l=t.indexOf(s,l);
            }
        //}
        if(l == t.length()) 
            return true;
        else 
            return false;
    }

}



/*
 * 
 * Given a 2D binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.

Example:

Input: 

1 0 1 0 0
1 0 1 1 1
1 1 1 1 1
1 0 0 1 0

Output: 4
 * */


/*
 * Given two strings str1 and str2 of the same length, determine whether you can transform str1 into str2 by doing zero or more conversions.

In one conversion you can convert all occurrences of one character in str1 to any other lowercase English character.

Return true if and only if you can transform str1 into str2.

 

Example 1:

Input: str1 = "aabcc", str2 = "ccdee"
Output: true
Explanation: Convert 'c' to 'e' then 'b' to 'd' then 'a' to 'c'. Note that the order of conversions matter.
Example 2:

Input: str1 = "leetcode", str2 = "codeleet"
Output: false
Explanation: There is no way to transform str1 to str2.
 

Note:

1 <= str1.length == str2.length <= 10^4
Both str1 and str2 contain only lowercase English letters.
 * 
 * */
 