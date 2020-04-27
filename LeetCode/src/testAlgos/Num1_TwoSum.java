package testAlgos;

import java.util.HashMap;

/*
 * Level: Easy
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */
public class Num1_TwoSum {

	public static void main(String[] args) {
		
		int[] indices = (new Num1_TwoSum().twoSum(new int[]{2,7,11,15}, 9));
		for(int i:indices) {
			System.out.println(i);
		}
	}
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i< nums.length;i++){
            if(map.containsKey(nums[i])){
                indices[0] = map.get(nums[i]);
                indices[1] = i;
                break;
            }
            else{
                map.put(target-nums[i],i);
            }
        }
        return indices;
    }

}
