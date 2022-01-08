package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum15 {

	public static void main(String[] args) {
		ThreeSum15 sol = new ThreeSum15();
		int[] input = new int[] { -1, 0, 1, 2, -1, -4 };
		System.out.println(sol.threeSum(input));
	}

	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();

		if (nums.length < 0) {
			return ans;
		}

		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 2; i++) {

			int left = i + 1, right = nums.length - 1;

			// check for dupliactes
			if (i != 0 && nums[i] == nums[i - 1]) {
				continue;
			}

			while (left < right) {
				int sum = nums[left] + nums[right] + nums[i];
				if (sum == 0) {
					List<Integer> combination = new ArrayList<Integer>();
					combination.add(nums[i]);
					combination.add(nums[left]);
					combination.add(nums[right]);
					ans.add(combination);
					left++;
					right--;

					// check for the duplicates
					while (left < right && nums[left] == nums[left - 1]) {
						left++;
					}

					while (left < right && nums[right] == nums[right + 1]) {
						right--;
					}
				} else if (sum > 0) {
					right--;
				} else {
					left++;
				}
			}
		}

		return ans;

	}

}
