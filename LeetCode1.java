import java.util.ArrayList;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
You may assume that each input would have exactly one solution, and you may not use the same element twice.
你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。

Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/

public class LeetCode1 {
	public static int[] twoSum(int[] nums, int target) {
		//int results[] = new int[nums.length];
		ArrayList<Integer> results = new ArrayList<Integer>();
		boolean isfound = false;
		for(int i=0; i<nums.length-1; i++) {
			isfound = false;
			if(results.contains(i)) {
				isfound = true;
			}
			
			if (isfound) {
				continue;
			}
			
			int temp = target - nums[i];
			for(int k=i+1; k<nums.length; k++) {
				if (nums[k] == temp) {
					results.add(i);
					results.add(k);					
					break;
				}
			}
		}
		Integer[] array = new Integer[results.size()];
		results.toArray(array);
		int[] out = new int[results.size()];
		for(int i=0; i<out.length; i++)
			out[i] = array[i];
			
		return out;
	}
}
