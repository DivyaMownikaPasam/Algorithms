package oca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class tets1 {

	public static void main(String[] args) {
		
		int[] nums = {2, 7, 11, 15};
		int target = 18;
		
		/*int len = removeDuplicates(nums);

		// any modification to nums in your function would be known by the caller.
		// using the length returned by your function, it prints the first len elements.
		for (int i = 0; i < len; i++) {
		    System.out.println(nums[i]);
		}
		
		//int k=6;
		//rotate(nums,k);
		
		//System.out.println(containsDuplicate(nums));
		
		
		int [] nums1 = {4,9,5}; 
		int [] nums2 = {9,4,9,8,4};
		int[] nums = intersect(nums1,nums2);
		
		for (int i = 0; i < nums.length; i++) {
		    System.out.println(nums[i]);
		}
		int[] result = twoSum(nums,target);
		for (int i = 0; i < result.length; i++) {
		    System.out.println(result[i]);
		}
		
		String s = "A man, a plan, a canal: Panama";
		s= s.toLowerCase();
		s= s.replaceAll("[^a-z]","");

		System.out.println(s);*/
		//printString(206);
		
		
		int sum = romanToInt("MCMXCIV"); 
		
		System.out.println(sum);
	}
	
    public static int romanToInt(String s) {
        
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        char[] c = s.toCharArray();

         map.put('I',1);
         map.put('V',5);
         map.put('X',10);
         map.put('L',50);
         map.put('C',100);
         map.put('D',500);
         map.put('M',1000);
        
        
        int sum =0;
        
        if(c.length>=2){

            for(int i=1; i<c.length; i++){
                if(map.get(c[i])>map.get(c[i-1])){

                    sum = sum + (map.get(c[i])-map.get(c[i-1]));
                    i++;
                }
                else{

                    sum = sum + map.get(c[i-1]);
                }   
            }

            if(map.get(c[c.length-2])>=map.get(c[c.length-1])) sum = sum + map.get(c[c.length-1]);
        }
        
        else if(c.length==1){
            sum = map.get(c[c.length-1]);
        }
        
        return sum;
    }

	
/*	
	
	public static void printString(int columnNumber) {
		
		StringBuilder name = new StringBuilder();
		
		int res=0;
		while(columnNumber>0) {
			res = columnNumber %26;
			
			if(res==0) {
				name.append('Z');
				columnNumber = (columnNumber/26) -1;
			}
			else {
				name.append((char)((res-1) + 'A'));
				columnNumber = (columnNumber/26);
			}
			
		}
		System.out.println(name.reverse().toString());
	}
	
    public static boolean isValid(String s) {
        
        Stack<Character> stk = new Stack<Character>();
        
        for(char c : s.toCharArray()){
            
            if(c == '(') stk.push(')');
            else if(c == '{') stk.push('}');
            else if(c == '[') stk.push(']');
            else if(!stk.empty() && c !=stk.pop()) return false;
        }
        
       return true; 
    }

	public int maxSubArray(int[] nums) {
		
		int maxSoFar = nums[0];
		int maxEndingHere = nums[0];
		
		for(int i=1;i<nums.length;i++) {
	
			maxEndingHere = Math.max(nums[i], maxEndingHere+nums[i]);
			maxSoFar = Math.max(maxSoFar,maxEndingHere);
		}
		return maxSoFar;
        
    }
	
	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		result[0]= -1;
		result[1]= -1;
		HashMap<Integer,Integer> diffmap = new HashMap<Integer,Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			
			int difference = target - nums[i];
			if(diffmap.containsKey(nums[i])) {
				result[0]= diffmap.get(nums[i]);
				result[1] = i;
				break;
			}
			else{
				diffmap.put(difference,i);
			}			
		}

		return result;
	}
	
	public static int[] intersect(int[] nums1, int[] nums2) {
		
		List<Integer> interlist = new ArrayList<Integer>();
		
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		
		int i=0, j=0;
		while(i<nums1.length && j<nums2.length) {
			
			if(nums1[i]==nums2[j]) {
				interlist.add(nums1[i]);
				i++;
				j++;
			}
			else if(nums1[i]>nums2[j]) {
				j++;
			}
			else i++;
		}
		
		
		int[] result = new int[interlist.size()];
		for (int i1 = 0; i1 < interlist.size(); i1++) {
			result[i1] = (int)interlist.toArray()[i1];
		}
		return result;
		
	}
	
	public static boolean containsDuplicate(int[] nums) {
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0; i<nums.length;i++ ) {
		if(map.containsKey(nums[i])) {
			return true;
		}
		else
			map.put(nums[i], 1);
		}
		
		return false;
		
	}
	
	
	public static void rotate(int[] nums, int k) {
		
		reverse(nums,0,nums.length-1-k);
		reverse(nums,nums.length-k,nums.length-1);
		reverse(nums,0,nums.length-1);
		
	}
	
	public static void reverse(int[] nums, int l, int h) {
		
		while(l<h) {
			int temp = nums[l];
			nums[l++] = nums[h];
			nums[h--] = temp;
		}
		
	}
	
	
	public static int removeDuplicates(int[] nums) {
        Set<Integer> set = new TreeSet<Integer>();
        
        for(int a:nums) {
        	set.add(a);
        }
        
        Iterator<Integer> itr = set.iterator();
        
        int i=0;
        
        while(itr.hasNext()) {
        	nums[i] = itr.next();
        	i++;
        }
        
        return set.size();
    }
*/
}
