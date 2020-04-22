package testAlgos;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome(121));

	}
		
	//1534236469
	public static boolean isPalindrome(int x) {
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
