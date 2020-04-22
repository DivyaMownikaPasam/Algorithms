package search;
public class BinarySearch {	
	public static int search(int[] inputArr, int findElem) {
		
		int lowIndex = 0;
		int highIndex = inputArr.length - 1;
		int mid = 0;
		
		while(lowIndex<= highIndex) {
			mid = (lowIndex + highIndex)/2;
			if (inputArr[mid]==findElem) return mid;
			if (inputArr[mid] > findElem) {
				highIndex = mid-1;
			}
			if (inputArr[mid] < findElem) {
				lowIndex = mid+1;
			}
		}
		return -1;
	}
}