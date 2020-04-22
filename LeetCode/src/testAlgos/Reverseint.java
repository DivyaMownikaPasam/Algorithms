package testAlgos;

//import java.util.ArrayList;

public class Reverseint {

	public static void main(String[] args) {
		
		System.out.println(reverse(-1534236469));
		
	}
	//1534236469
	public static int reverse(int x) {
		
		long revint = 0;
		
		while (x!=0) {
			
			int digit = x%10; //digit = 3,2,1
			x= x/10; // x= 12,1,0
			
			revint= revint *10 + digit; //revint = 3,32,321
		}
		
		if (revint > Integer.MAX_VALUE || revint < Integer.MIN_VALUE)
        	return 0;
        else 
        	return (int)revint;
		
		
	}
	
	
	
	
/*	public static int reverse(int x) {
        String str = Integer.toString(x);
        ArrayList<Character> chars = new ArrayList<Character>();
        for (char c : str.toCharArray()) {
        	  chars.add(c);
        }
        String revstr = new String();
        
        
        if (chars.get(0)=='-') {
        	revstr = "-";
        	chars.remove(0);
        }
        
        for (int i=chars.size()-1; i>=0; i--) {
        	revstr = revstr +  chars.get(i);
        }
        
        long revint = Long.valueOf(revstr);
        		
        if (revint > Integer.MAX_VALUE || revint < Integer.MIN_VALUE)
        	return 0;
        else 
        	return (int)revint;
    }*/

}
