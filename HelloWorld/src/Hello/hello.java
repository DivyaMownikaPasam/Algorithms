package Hello;

import java.util.Scanner;

public class hello {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
				
		// Read a full line of input from stdin and save it to our variable, inputString.
		String inputString = scan.nextLine(); 
		scan.close(); 
		
		System.out.println("Hello World!!");
		System.out.println(inputString);

	}

}
