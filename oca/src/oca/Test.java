package oca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	
	public static void main(String[] args) {
		
		String inpstr = "abdvgiugahuyfuygeabedabceabcd";
		
		char[] inpchr = inpstr.toCharArray();
		
		/* MAPS
		HashMap <Character,Integer> countmap = new HashMap<Character, Integer>();
		for(int i=0; i < inpchr.length;i++) {
			char key = inpchr[i];
			if (!countmap.containsKey(key)) {
				countmap.put(key, 1);
				continue;
			}
			countmap.put(key,countmap.get(key)+1);
		}
		System.out.println(countmap);
		*/
		/*//1
		StringBuilder strbuild = new StringBuilder();
		for(int i=inpchr.length-1; i >=0;i--) {
			strbuild.append(inpchr[i]);
		}
		System.out.println(strbuild);
		
		//2
		StringBuilder strbuild1 = new StringBuilder(inpstr);
		System.out.println(strbuild1.reverse());
		
		*/
		
		/*
		int n= 00000000000000000000000000001011;
		String intstr = String.valueOf(n);
		
		System.out.println(Integer.bitCount(n));
		HashMap <Character,Integer> countmap = new HashMap<Character, Integer>();
		for (int i=0; i < intstr.length();i++) {
			char key = intstr.charAt(i);
			if (countmap.containsKey(key)) {
				countmap.put(key,countmap.get(key)+1);
				continue;
			}
			countmap.put(key,1);
		}*/
		
		
	//	String a = "fcrxzwscanmligyxyvym";

      //  String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";

      //  int res = makeAnagram(a, b);
       // System.out.println(res);
		//int number = Integer.parseInt(intstr);
		//System.out.println(number);
  /*      
		int[] nums = {2, 7, 11, 15};
		int target = 26;
        
		outerloop: for(int i=0; i<nums.length;i++) {
						for(int j=i+1;j<nums.length;j++) {
							if (nums[i]+nums[j]==target) {
								System.out.println(i +" " +j);
								break outerloop;
							}
						}
					}
	*/
		/*
		HashMap <Integer,Integer> countmap = new HashMap<Integer, Integer>();
		int a[] = new int[2];
		for(int i=0; i<nums.length;i++) {
			
			if(countmap.containsKey(nums[i])) {
				a[0] = countmap.get(nums[i]);
				a[1] = i;
				break;
			}
			
			int difference =  target - nums[i];
			if(!countmap.containsKey(difference)) {
				countmap.put(difference, i);
				
			}
		}
		
		System.out.println(a[0]+" "+a[1]);
		
		
		char[] s = {'h','e','l','l','o'};
		String str = new String(s);
		StringBuilder strb = new StringBuilder(str);
		
        strb.reverse();
        
        s = strb.toString().toCharArray();
		
        System.out.println(s);
        
		int a[] = {1,2,3,4,5,6,7};
		int k = 6;
		rotate(a,k);
		
		String ransomNote="fffbfg"; 
		String magazine="effjfggbffjdgbjjhhdegh";
		
		if(magazine.contains(ransomNote) ) System.out.println("true");
		else System.out.println("false");
		*/
		
		int nums[] = {4,1,2,1,2};
		
		HashMap<Integer,Integer> countmap = new HashMap<Integer,Integer>();
		
		for(int i=0; i<nums.length;i++) {			
			if(countmap.containsKey(nums[i])) {
				countmap.put(nums[i], countmap.get(nums[i])+1);
				
			}else {
				countmap.put(nums[i], 1);
			}
		}
		
		for (Integer key : countmap.keySet()) {
		    
			if(countmap.get(key)==1) {
				System.out.println(key);
				break;
			}	
		}	
		
	}
	
	
public static void rotate(int[] nums, int k) {
		//printarr(nums);
        reverseString(nums,0,nums.length-k);
        reverseString(nums,nums.length-k,nums.length);
        reverseString(nums,0,nums.length);
        printarr(nums);
    }
    
    private static void printarr(int[] nums) {
	
    	int i=0;
    	while (i<nums.length) {
    		System.out.println(nums[i]);
    		i++;
    	}
	
}


	public static void reverseString(int[] s,int l,int length) {
        //int l = 0, 
    	int h = length - 1;
        while(l < h) {
            int t = s[l];
            s[l++] = s[h];
            s[h--] = t;
        }
    }

	private static int makeAnagram(String a, String b) {
		
		HashMap <Character,Integer> countmap = new HashMap<Character, Integer>();
		
		for (int i=0; i < a.length();i++) {
            char key = a.charAt(i);
            if (countmap.containsKey(key)) {
                countmap.put(key,countmap.get(key)+1);
                continue;
            }
            countmap.put(key,1);
        }

        for (int i=0; i < b.length();i++) {
            char key = b.charAt(i);
            if (countmap.containsKey(key)) {
            	if(!b.contains(String.valueOf(key))) {
            		countmap.put(key,countmap.get(key)-1);
            	}else {
            		countmap.put(key,countmap.get(key)+1);
            	}
            }else
            	countmap.put(key,1);
        }
        
        Iterator<Integer> itr = countmap.values().iterator();
        int counter=0;
        while(itr.hasNext()) counter=counter+itr.next();
       // System.out.println(counter);
        
		return counter;
	}

}
