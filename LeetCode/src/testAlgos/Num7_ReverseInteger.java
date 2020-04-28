package testAlgos;

/*
 * Level: Easy
 * Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
 */


public class Num7_ReverseInteger {

	public static void main(String[] args) {
		System.out.println(new Num7_ReverseInteger().reverse(123));

	}
    public int reverse(int x) {
        long ans = 0; 
        while(x != 0){
            ans = ans*10 + (x%10);
            x = x/10;
        }
        if(ans<Integer.MIN_VALUE || ans>Integer.MAX_VALUE) return 0;
        return (int)ans;
    }

}
