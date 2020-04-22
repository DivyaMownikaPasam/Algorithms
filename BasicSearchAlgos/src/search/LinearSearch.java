package search;

public class LinearSearch {

	public static int search(int[] inputArr, int findElem) {
		
		for(int i=0; i < inputArr.length; i++) {
			if (inputArr[i]==findElem)
				return i;
		}
		return -1;
	}

}
