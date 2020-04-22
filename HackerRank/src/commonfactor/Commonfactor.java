package commonfactor;
import java.util.*;
public class Commonfactor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        String[] ints = s.nextLine().split(" ");;                 // Reading input from STDIN
        
        int first = Integer.parseInt(ints[0]);
        int second = Integer.parseInt(ints[1]);
        
        int least =(first < second)? first:second;
        int count=0;
        for (int i=1; i< least; i++) {
        	if (first%i==0 && second%i==0) count++;
        }
        
        System.out.println(count);

	}

}
