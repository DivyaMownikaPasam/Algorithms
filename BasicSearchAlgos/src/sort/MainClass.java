package sort;

public class MainClass {

	public static void main(String[] args) {
		
	//	int inputArr[] = {10,45,43,67,87,45,67,32,45,90,87,65,83};
		int inputArr[] = {56,45,83,67,10,45};
		//inputArr = MergeSort.Sort(inputArr);
		inputArr = QuickSort.Sort(inputArr);
		System.out.print("Sorted List: ");
		for(int i:inputArr)
			System.out.print(i + " ");
	}

}
