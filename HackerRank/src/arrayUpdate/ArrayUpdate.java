package arrayUpdate;
import java.util.*;
public class ArrayUpdate {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int len = Integer.parseInt(s.nextLine());
        String[] ints = s.nextLine().split(" ");                // Reading input from STDIN

        int sum = 0;
        for (int i=0;i<ints.length;i++) {
        	sum = sum + Integer.parseInt(ints[i]);
        }
        int element = 0;
        while(true) {
        	if((len*element) > sum) {
        		break;
        	}
        	element++;
        }
        
        System.out.println(element);


	}

}

