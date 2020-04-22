package sort;

public class QuickSort {

	public static int[] Sort(int[] inputArr) {		
		int start=0, end= inputArr.length-1;	
		quick_sort(inputArr,start,end);
		return inputArr;		
	}
	
	static void quick_sort ( int A[ ] ,int start , int end ) {
		   if( start < end ) {
		        //stores the position of pivot element
		         int piv_pos = partition (A,start , end ) ;     
		         quick_sort (A,start , piv_pos -1);    //sorts the left side of pivot.
		         quick_sort ( A,piv_pos +1 , end) ; //sorts the right side of pivot.
		   }
		}

	
	public static int partition ( int A[],int start ,int end) {
	    int i = start+1;
	    int piv = A[start] ;            //make the first element as pivot element.
	    for(int j =start + 1; j <= end ; j++ )  {
	          if ( A[ j ] < piv) {
	        	  swap (A,i, j);
	        	  i += 1;
	        }
	   }
	   swap ( A,start,i-1) ;  //put the pivot element in its proper place.
	   return i-1;                  //return the position of the pivot
	}

	private static void swap(int[] a, int i, int j) {
		int temp =a[i];
		a[i]=a[j];
		a[j]=temp;	
	}
	
}
