package search;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		int inputArr[] = {10,45,43,67,87,45,67,32,45,90,87,65,83};
		int findElem = 23;
		int foundindex = LinearSearch.search(inputArr,findElem);
		 
/*		
		int inputArr[] = {10,23,45,52,64,75,85,93};
		int findElem = 85;
		int foundindex = BinarySearch.search(inputArr,findElem);
		
		if(foundindex>=0)
			System.out.println(findElem+" is at "+(foundindex+1)+" position");
		
		else System.out.println(findElem+" Not Found ");
*/
		/*
        Scanner s = new Scanner(System.in);
        String[] target = s.nextLine().split(" ");                 // Reading input from STDIN
        //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        String[] searcharr = s.nextLine().split(" ");
        int index=-1;
        for (int i =0; i<searcharr.length ; i++){
            if (searcharr[i].equals(target[1])) {
                index=i;
            }
        }
        System.out.println(index+1);

	}
	       int arrlen = Integer.parseInt(s.nextLine());                 // Reading input from STDIN
	        //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
	        String[] searcharr = s.nextLine().split(" ");
	        int [] arr = new int [searcharr.length];
	        for(int i=0; i< searcharr.length; i++){
	            arr[i] = Integer.parseInt(searcharr[i]);
	        }
	        int querylen = Integer.parseInt(s.nextLine());                 // Reading input from STDIN
	        //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
	        String[] queryarr = new String [querylen];
	        
	        for(int i=0; i< querylen; i++){
	        	queryarr[i]=s.nextLine();
	        // Write your code here
	        }
	        
	        for(int i=0; i< querylen; i++){
	             binarySort(arr,Integer.parseInt(queryarr[i]));
	        // Write your code here
	        }
	     
	    }
	    
	    static void binarySort(int arr[], int target){
	        int mid = 0;
	        int low=0;
	        int high = arr.length;
	        while(low <= high){
	            mid= (low +  high)/2;
	            if (arr[mid]==target){
	                System.out.println(mid+1);
	                break;
	            }
	            if (arr[mid] < target){
	               
	                low = mid +1;
	            }else{
	            	 high = mid -1;
	            }
	            
	        }*/
	        
	    }
	    

}
