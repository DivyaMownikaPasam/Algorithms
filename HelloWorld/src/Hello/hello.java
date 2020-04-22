package Hello;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Checking {

int amount;
public Checking(int amount) {
	this.amount = amount;
}

public int getAmt() {
	return amount;
}
public void change(int x) {
	amount += x;
}
}


public class hello {

public static void main(String[] args) {
 
	boolean[] bool = new boolean[2];
	//bool[0] = new Boolean (Boolean.parseBoolean("true"));
	//bool[1] = new Boolean (Boolean.valueOf(null));
	System.out.println(bool[0] +" "+ bool[1]);
}

}