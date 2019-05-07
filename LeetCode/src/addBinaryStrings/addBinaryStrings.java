package addBinaryStrings;

public class addBinaryStrings {

	public static void main(String[] args) {
		
		System.out.println("Adding two binary strings");
		System.out.println(addBinary("1010","1011"));
		
	}
	
	public static String addBinary(String a, String b) {
        return(Long.toBinaryString(Long.parseLong(a,2)+Long.parseLong(b,2)));
    }

}
