package testAlgos;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int sol [] = {2,5,5,11};
        int target = 10;
        int result[] = twoSum (sol,target);
        System.out.println(result[0] + "  "+ result[1]);
    }
    
    public static int[] twoSum(int[] nums, int target) {
        int [] sol = new int[2];
        Map<Integer,Integer> map = new HashMap<>(); 
        for (int i=0;i<nums.length;i++){
            map.put(i,target - nums[i]);
        }
        System.out.println(map);
        
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if (map.containsValue(nums[i])){
            	index=i;
                break;
            }
        }
        sol[0] = index;
        try {
        	sol[1] = map.get(nums[index]);
        }
        catch (NullPointerException e){
        	System.out.println("No numbers to add"); 
        }
        return sol;
    }

}