package oca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
 class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
//import java.util.List;
public class sample {

	public static void main(String[] args) {
		/*int[][] names = { 
                {0,1,1,0,1},
                {0,1,0,1,0},
                {0,0,0,0,1},
                {0,1,0,0,0}
               };
		
		
		int arr1[] = {-100,200,1, 5, 9, 8, 2, 4, 1, 8, 1, 2}; 
        int k = 3; 
        int n = arr1.length; 
        //System.out.println(findMaxProduct(arr1, n, k)); 
   
        System.out.println(LargButMinFreq(new int[] {2, 2, 5, 50, 1}));
		System.out.println(minimumDays(names.length,names[0].length,names));
		
		System.out.println(solution1("{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([[[[]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}{{}{[([]{})](){{}}}(((({}){()[]}((){})))())}"));
        
		System.out.println(LargButMinFreq(new int[] {2, 2, 5, 50, 1}));*/
		//System.out.println(reverseWords("i live in a house"));
		//System.out.println(wordCount("It's a man, it's a plane, it's superman!"));
	
		//System.out.println(plusOne(new int[] {9,9}));
		//System.out.println(minimumWindowSubstring("ADOBECODEBANC", "ABC"));
		
		
		System.out.println(maxConsecutiveSum(new int[] {0,0}));
	}

	
	public static int maxConsecutiveSum(int[] arr) {
		
		int maxsum = Integer.MIN_VALUE;
		int sum = 0;
		
		for(int i=0; i< arr.length;i++) {
			
			sum = sum + arr[i];
			maxsum = Math.max(maxsum, sum);
			sum = Math.max(sum, 0);
		}
		
	     return Math.max(maxsum, 0);
	   }
	
	public static String minimumWindowSubstring(String fullString, String chars) {
	    // Write your code here
		int start =0;
        int end = chars.length();
        String res = new String();
        int min = Integer.MAX_VALUE;
        String substr = new String();
        while(end <=fullString.length()){
                substr = fullString.substring(start, end);
                if(checkstr(substr,chars)){
                    if(min > (end-start)){
                        min = end-start;
                        res= substr;
                        start = end+1;
                    }
                }
                end++;
        }
        
        
        return res;
	    }

	    private static boolean checkstr(String substr , String chars){
	        char [] chararr = chars.toCharArray();
	        for(int i=0; i< chararr.length; i++){
	            if(substr.indexOf(chararr[i]) < 0) return false;
	        }
	        return true;
	    }

	public static int[] plusOne(int[] digits) {
        
        List<Integer> list = new ArrayList<Integer>();
        int carry = (digits[digits.length-1]+1)/10;
        list.add((digits[digits.length-1]+1)%10);
        
        for(int i= digits.length-2;i>=0;i--){
            carry = (digits[i]+ carry)/10;
            list.add((digits[i] + carry)%10);
        }
        
        if(carry!=0) list.add(carry);
        
        
        int[] res = new int[list.size()];
        for(int i= 0;i<=digits.length;i++){
            res[i] = list.get(Math.abs(digits.length-1-i));
            System.out.println(res[i]);
        }
        
        return res;
    }
	
	public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {
        Set<Integer> set = new HashSet<Integer>();
        makeSet(set, root1);
        makeSet(set, root2);
        
        int [] nums = new int[set.size()];
        Iterator<Integer> itr = set.iterator();
        
        int k=0;
        while(itr.hasNext())
        	nums[k++] = itr.next();
        
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return true;
            }
            map.put(nums[i], i);
        }
        
        return false;
    }
	
	
	private void makeSet(Set<Integer> set, TreeNode root) {
		if(root==null) return;
		makeSet(set,root.left);
		set.add(root.val);
		makeSet(set,root.right);
	}


	public static HashMap wordCount(String sentence) {
		
		  String[] arr = sentence.replaceAll("\\p{Punct}", "").toLowerCase().split(" ");
		  HashMap<String, Integer> map = new HashMap<String, Integer>();
		  for(int i=0; i< arr.length;i++) {
			  if(!map.containsKey(arr[i])) map.put(arr[i],1);
			  else map.put(arr[i],map.get(arr[i])+1);
		  }
	      return map;
	    }

	
	public static ArrayList unique(int[] arr) {
		  ArrayList<Integer> list = new ArrayList<Integer>();
		  
		  for(int i=0; i< arr.length;i++) {
			  if(!list.contains(arr[i])) list.add(arr[i]);
		  }
		  
	      return list;
	   }

	public static String reverseWords(String s) {    
		StringBuilder builder = new StringBuilder();    
		int currentWordEnd = s.length();    
		for (int i = s.length() - 1; i >= 0; i--) {        
			if (s.charAt(i) == ' ') {            
				if (builder.length() > 0) // not empty, add a space                
					builder.append(' ');            
				builder.append(s.substring(i+1, currentWordEnd));            
				currentWordEnd = i;        
				}    
			}    
		// add first word    
		String firstWord = s.substring(0, currentWordEnd);    
		if (builder.length() > 0)        
			builder.append(' ');    
		builder.append(firstWord);    
		return builder.toString();
	}
	
	    private static int[][] matrix;
	    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	    private static int minimumDays(int rows, int columns, int[][]array)
	    {
	    	/*
	              int [][] array = new int[grid.size()][];
	        
	        for(int i=0; i< array.length;i++){
	            array[i] = new int[grid.get(i).size()];
	        }
	        
	        
	        for(int i=0; i< grid.size();i++){
	            for(int j=0; j<grid.get(i).size();j++){
	                array[i][j] = grid.get(i).get(j);
	            }
	        }
	        */
	        int result = 0;
	        matrix = array;
	        
	        int [][] refarray = new int[array.length][];
	        
	        
	        for(int i=0; i< array.length;i++){
	        	refarray[i] = new int[ array[i].length];
	        }
	        
	        for(int i=0; i< array.length;i++){
	            for(int j=0; j<array[i].length;j++){
	            	refarray[i][j] = array[i][j];
	            }
	        }
	        
	        while(checkMatrix()){
	        	result+=1;
	            for(int i=0; i< matrix.length;i++){
	                for(int j=0; j<matrix[i].length;j++){
	                    if(matrix[i][j] ==0 && adjacentOne(i,j,refarray)){
	                        matrix[i][j] = 1;
	                        
	                    } 
	                  }
	            }
	            for(int i=0; i< array.length;i++){
		            for(int j=0; j<array[i].length;j++){
		            	refarray[i][j] = array[i][j];
		            }
		        }
	            
	        }
	        
	        return result;
	    }
	    private static boolean checkMatrix(){
	        for(int i=0; i< matrix.length;i++){
	            for(int j=0; j<matrix[i].length;j++){
	                if(matrix[i][j] == 0) return true;
	            }
	        }
	        return false;
	    }
	    
	    private static boolean adjacentOne(int x, int y, int[][] array){
	        
	        if(x+1 < array.length && array[x+1][y]==1) return true;
	        if(y+1 < array[0].length && array[x][y+1]==1) return true;
	        if(x-1 >=0 && array[x-1][y]==1) return true;
	        if(y-1 >=0 && array[x][y-1]==1) return true;
	        
	        return false;
	    }
	    	    
	    public static long solution(String s) {
	        
	        long n = s.length();
	        long ans = 0;
	        Map<Character, Long> map = new HashMap<Character, Long>(); 

	        for (long j = 0, i = 0; j < n; j++) {
	            if (map.containsKey(s.charAt((int) j))) {
	                i = (int) Math.max(map.get(s.charAt((int) j)), i);
	            }
	            ans = Math.max(ans, j - i + 1);
	            map.put(s.charAt((int) j), (long) (j + 1));
	        }
	        return ans;
	    }

	    public static boolean solution1(String s) {
            if(s=="") return true;
        
            Stack<Character> stack = new Stack<>();
            for (char c : s.toCharArray()) {
                if (c == '(') {
                    stack.push(')');
                } else if (c == '{') {
                    stack.push('}');
                } else if (c == '[') {
                    stack.push(']');
                } else if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
            return stack.isEmpty();

	    }



	    static int findMaxProduct(int arr[], int n, int k) 
	    { 
	        // Initialize the MaxProduct to 1, as all elements 
	        // in the array are positive 
	        int MaxProduct = 1; 
	        for (int i=0; i<k; i++) 
	            MaxProduct *= arr[i]; 
	   
	        int prev_product = MaxProduct; 
	   
	        // Consider every product beginning with arr[i] 
	        // where i varies from 1 to n-k-1 
	        for (int i=1; i<=n-k; i++) 
	        { 
	            int curr_product = (prev_product/arr[i-1]) * 
	                                arr[i+k-1]; 
	            MaxProduct = Math.max(MaxProduct, curr_product); 
	            prev_product = curr_product; 
	        } 
	   
	        // Return the maximum product found 
	        return MaxProduct; 
	    } 

	    public static int LargButMinFreq(int arr[])
	    {
	        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	        
	        for(int num: arr){
	            if(map.containsKey(num))
	                map.put(num,map.get(num)+1);
	            else
	                map.put(num,1);
	        }
	        
	        int min=1000000;
	        
	        for(int key : map.keySet()){
	            min = Math.min(min,map.get(key));
	        }
	        
	        int max=0;
	        for(int key : map.keySet()){
	            if(map.get(key)==min)
	                max=Math.max(max,key);
	        }
	        
	    return max; 
	    }
}
