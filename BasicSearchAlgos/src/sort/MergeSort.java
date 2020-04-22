package sort;

public class MergeSort {

	public static int[] Sort(int[] inputArr) {		
		int start=0, end= inputArr.length-1;	
		merge_sort(inputArr,start,end);
		return inputArr;		
	}

	private static void merge_sort(int[] inputArr, int start, int end) {
		if( start < end ) {
	           int mid = (start + end ) / 2 ;           // defines the current array in 2 parts .
	           merge_sort (inputArr, start , mid ) ;                 // sort the 1st part of array .
	           merge_sort (inputArr,mid+1 , end ) ;              // sort the 2nd part of array.
	         // merge the both parts by comparing elements of both the parts.
	          merge(inputArr,start , mid , end );
		}
	}

	private static void merge(int[] inputArr, int start, int mid, int end) {
		
		int p = start ,q = mid+1, k=0;

		int Arr[] = new int [end-start+1] ;

		for(int i = start ;i <= end ;i++) {
		    if(p > mid)      //checks if first part comes to an end or not .
		       Arr[ k++ ] = inputArr[ q++] ;

		   else if ( q > end)   //checks if second part comes to an end or not
		       Arr[ k++ ] = inputArr[ p++ ];

		   else if( inputArr[ p ] < inputArr[ q ])     //checks which part has smaller element.
		      Arr[ k++ ] = inputArr[ p++ ];

		   else
		      Arr[ k++ ] = inputArr[ q++];
		 }
		  for (int p1=0 ; p1< k ;p1 ++) {
		   /* Now the real array has elements in sorted manner including both 
		        parts.*/
			  inputArr[ start++ ] = Arr[ p1 ] ;                          
		  }
	}
}